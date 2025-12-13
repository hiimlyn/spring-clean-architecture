package lynx.com.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"lynx.com"})
@EnableJpaRepositories(basePackages = "lynx.com")
@EntityScan(basePackages = "lynx.com")
public class ESApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESApplication.class, args);
    }

}
