package com.truongbn.security.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.TreeMap;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("스마트 목 API 문서") // 타이틀
                .version("1.0") // 문서 버전
                .description("잘못된 부분 이나 오류 발생 시 바로 말씀해 주세요.") // 문서 설명
                .contact(new Contact() // 연락처
                        .name("소완튼")
                );

        SecurityScheme jwtSecurityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT")
                .in(SecurityScheme.In.HEADER)
                .name("Authorization");

        SecurityScheme refreshTokenSecurityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.APIKEY)
                .in(SecurityScheme.In.HEADER)
                .name("Refresh-Token");

        Components components = new Components()
                .addSecuritySchemes("bearerToken", jwtSecurityScheme)
                .addSecuritySchemes("Refresh-Token", refreshTokenSecurityScheme);


        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList("bearerToken").addList("Refresh-Token"))
                .addServersItem(new Server().url("/"))
                .components(components)
                .info(info);
    }

    @Bean
    public OpenApiCustomizer sortSchemasAlphabetically() {
        return openApi -> {
            Map<String, Schema> schemas = openApi.getComponents().getSchemas();
            openApi.getComponents().setSchemas(new TreeMap<>(schemas));
        };
    }

}
