package co.develhope.Swagger02.Configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;


@Configuration
    public class SpringFoxConfig {
    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Math Api",
                "An API that provides services ",
                "1.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("Andrea", "https://develhope.co", "andre_28rm@hotmail.com"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)
                .tags(
                        new Tag("default-controller", "The default controller"),
                        new Tag("math-controller", "The math controller")
                );
    }
}


