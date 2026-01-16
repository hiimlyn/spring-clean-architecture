package lynx.com.api.config;

import lombok.AllArgsConstructor;
import lynx.com.api.config.interceptor.ESTraceIdInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AllArgsConstructor
public class ESWebConfig implements WebMvcConfigurer {

    private final ESTraceIdInterceptor traceIdInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(traceIdInterceptor)
                .addPathPatterns("/**");
    }
}
