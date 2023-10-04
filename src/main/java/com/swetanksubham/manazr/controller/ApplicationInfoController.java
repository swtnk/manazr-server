package com.swetanksubham.manazr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swetanksubham.manazr.properties.ApplicationProperties;
import com.swetanksubham.manazr.utils.JsonResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class ApplicationInfoController {
    private final ApplicationProperties applicationProperties;

    @GetMapping("/app-info")
    public JsonResponse<ApplicationProperties> getApplicationProperties() {
        return new JsonResponse<>(applicationProperties);
    }

}
