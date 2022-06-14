package com.myfb.postservice.confiig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class PostConfiguration {
    @Value("${rest.call.connection.timeout:}")
    private Long connectionTimeout;
    @Value("${rest.call.connection.timeout:}")
    private Long readTimeout;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMinutes(connectionTimeout))
                .setReadTimeout(Duration.ofMinutes(readTimeout))
                .build();
    }
}
