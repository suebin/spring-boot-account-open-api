package com.nhnacademy.springbootaccount.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * backend 서버 호출 URL 설정을 위한 Externalized Configuration.
 */
@ConfigurationProperties(prefix = "backend.server")
@Getter
@Setter
public class ServerProperties {
    private String url;
}
