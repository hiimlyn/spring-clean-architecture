package lynx.com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot Application Entry Point.
 * 
 * Located in API module as the entry point for the application:
 * - API is the outermost layer for web requests
 * - Depends on infrastructure for JPA/database implementations
 * - Assembles all modules together
 */
@SpringBootApplication(scanBasePackages = {"lynx.com"})
@EnableJpaRepositories(basePackages = "lynx.com.infrastructure")
@EntityScan(basePackages = "lynx.com.infrastructure")
public class ESApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESApplication.class, args);
    }

}
