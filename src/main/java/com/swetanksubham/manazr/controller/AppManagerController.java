package com.swetanksubham.manazr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swetanksubham.manazr.utils.JsonResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/app")
@AllArgsConstructor
public class AppManagerController {
    @GetMapping("/list")
    public JsonResponse<List<String>> getAppList() {
        final List<String> appList = Arrays.asList("App1", "App2");
        return new JsonResponse<>(appList);
    }
}
