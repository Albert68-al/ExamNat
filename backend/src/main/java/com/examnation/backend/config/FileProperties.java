package com.examnation.backend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.file")
public class FileProperties {
    private String uploadDir;
    private boolean autoCreateDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public boolean isAutoCreateDir() {
        return autoCreateDir;
    }

    public void setAutoCreateDir(boolean autoCreateDir) {
        this.autoCreateDir = autoCreateDir;
    }
}
