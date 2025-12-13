package lynx.com.parent.infrastructure.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.UUID;

@Component
public class ESTraceIdInterceptor implements HandlerInterceptor {

    private static final String TRACE_ID_HEADER = "X-Trace-Id";
    private static final String TRACE_ID_MDC_KEY = "traceId";

    @Override
    public boolean preHandle(@SuppressWarnings("null") HttpServletRequest request,
                             @SuppressWarnings("null") HttpServletResponse response, @SuppressWarnings("null") Object handler) {
        String traceId = MDC.get(TRACE_ID_MDC_KEY);
        if (traceId == null || traceId.isEmpty()) {
            traceId = request.getHeader(TRACE_ID_HEADER);
            if (traceId == null || traceId.isEmpty()) {
                traceId = generateTraceId();
            }
            MDC.put(TRACE_ID_MDC_KEY, traceId);
        }
        response.setHeader(TRACE_ID_HEADER, traceId);
        return true;
    }

    @Override
    public void afterCompletion(@SuppressWarnings("null") HttpServletRequest request,
                                @SuppressWarnings("null") HttpServletResponse response, @SuppressWarnings("null") Object handler,
                                @SuppressWarnings("null") Exception ex) {
        // clear trace id
    }

    private String generateTraceId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    }
}