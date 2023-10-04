package com.swetanksubham.manazr.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "manazr.app")
@Getter
@Setter
public class ApplicationProperties {
    private String name;
    private ApplicationInfoProperties info = new ApplicationInfoProperties();
}
