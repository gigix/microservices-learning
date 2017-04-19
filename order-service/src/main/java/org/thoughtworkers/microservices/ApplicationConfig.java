package org.thoughtworkers.microservices;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.thoughtworkers.microservices.rest.OrderService;

import javax.inject.Named;

@Configuration
public class ApplicationConfig {
    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            register(OrderService.class);
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
