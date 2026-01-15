package lynx.com.api.config.utils;

import org.slf4j.MDC;

public class ESTraceIdUtil {

    private ESTraceIdUtil() {
        throw new IllegalStateException("Utility class");
    }

    private static final String TRACE_ID_KEY = "traceId";

    public static String getCurrentTraceId() {
        return MDC.get(TRACE_ID_KEY);
    }

    public static void setTraceId(String traceId) {
        MDC.put(TRACE_ID_KEY, traceId);
    }

    public static void clearTraceId() {
        MDC.remove(TRACE_ID_KEY);
    }

    public static boolean hasTraceId() {
        return getCurrentTraceId() != null;
    }
}
