package com.swetanksubham.manazr.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "manazr.contributors")
@Getter
@Setter
public class ContributorsProperties {
    private List<String> dev;
    private List<String> qa;
}
