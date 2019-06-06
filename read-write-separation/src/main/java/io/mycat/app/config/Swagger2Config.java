package io.mycat.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        // 为当前包路径
        .apis(RequestHandlerSelectors.basePackage("io.mycat.app.controller"))
        .paths(PathSelectors.any())
        .build();
  }
}