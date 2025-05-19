package com.examnation.backend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.jwt")
public class JwtProperties {
    private String secret;
    private int expirationInMs;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getExpirationInMs() {
        return expirationInMs;
    }

    public void setExpirationInMs(int expirationInMs) {
        this.expirationInMs = expirationInMs;
    }
}
