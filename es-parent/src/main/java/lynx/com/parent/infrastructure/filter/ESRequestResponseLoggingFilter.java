package lynx.com.parent.infrastructure.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ESRequestResponseLoggingFilter extends OncePerRequestFilter {

    private static final String TRACE_ID_HEADER = "X-Trace-Id";
    private static final String TRACE_ID_MDC_KEY = "traceId";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String traceId = resolveOrCreateTraceId(request);
        MDC.put(TRACE_ID_MDC_KEY, traceId);
        response.setHeader(TRACE_ID_HEADER, traceId);

        long startTimeMs = System.currentTimeMillis();

        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request, 1024 * 1024);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

        try {
            log.info(">> REQ IN: {} {}", request.getMethod(), request.getRequestURI());
            filterChain.doFilter(requestWrapper, responseWrapper);
        } finally {
            long durationMs = System.currentTimeMillis() - startTimeMs;

            int status = responseWrapper.getStatus();
            String responseBody = extractBody(responseWrapper.getContentAsByteArray());
            if (responseBody.length() > 1000) {
                responseBody = responseBody.substring(0, 1000) + "...";
            }
            log.info("<< REQ OUT: {} {} | status={} | {} ms", request.getMethod(), request.getRequestURI(), status, durationMs);

            // Copy body back to real response
            responseWrapper.copyBodyToResponse();
            MDC.remove(TRACE_ID_MDC_KEY);
        }
    }

    private String resolveOrCreateTraceId(HttpServletRequest request) {
        String traceId = request.getHeader(TRACE_ID_HEADER);
        if (traceId == null || traceId.isEmpty()) {
            traceId = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        }
        return traceId;
    }

    private String extractBody(byte[] content) {
        if (content == null || content.length == 0) {
            return "";
        }
        return new String(content, StandardCharsets.UTF_8);
    }
}