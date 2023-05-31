package com.nhnacademy.springbootaccount.configuration;

import java.time.Duration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Web Configuration.
 */
@Configuration
@EnableConfigurationProperties(ServerProperties.class)
public class WebConfiguration {
    /**
     * restTemplate bean.
     * connection timeout, read timeout 을 각각 3초로 설정
     *
     * @param builder builder
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setReadTimeout(Duration.ofSeconds(3L))
                .setConnectTimeout(Duration.ofSeconds(3L))
                .build();
    }
}
