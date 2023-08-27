package ru.stazaev.api.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        Contact contactInfo = new Contact()
                .name("Daniil Stazaev")
                .url("https://vk.com/deeeesp");

        Info apiInfo = new Info().title("MovieGenie API")
                .description("Full API documentation of MovieGenie application")
                .version("v0.0.1")
                .contact(contactInfo);

        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");

        Components apiComponents = new Components()
                .addSecuritySchemes("JWT Authentication", securityScheme);

        return new OpenAPI()
                .info(apiInfo)
                .components(apiComponents);
    }
}