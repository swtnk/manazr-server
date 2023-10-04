package com.swetanksubham.manazr.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "manazr.app.info")
@Getter
@Setter
public class ApplicationInfoProperties {
    private String version;
    private String stage;
}
