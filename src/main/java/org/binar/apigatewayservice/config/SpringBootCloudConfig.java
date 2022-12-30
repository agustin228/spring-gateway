package org.binar.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/films/**")
                        .uri("https://filmservice-production-36c0.up.railway.app/"))
                .route(r -> r.path("/users_movies/**")
                        .uri("https://user-service-production-dafa.up.railway.app/"))
                .route(r -> r.path("/api/auth/**")
                        .uri("https://user-service-production-dafa.up.railway.app/"))
                .route(r -> r.path("/seats/**")
                        .uri("https://seat-service-production-2489.up.railway.app/"))
                .route(r -> r.path("/invoice/**")
                        .uri("https://invoice-service-production-1064.up.railway.app/"))
                .route(r -> r.path("/kafka/**")
                        .uri("https://kafka-production.up.railway.app/"))
                .build();
    }
}
