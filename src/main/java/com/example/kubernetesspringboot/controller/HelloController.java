package com.example.kubernetesspringboot.controller;

import com.example.kubernetesspringboot.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello/gke")
    public String getMessage(){
         return helloService.getMessage();
    }
}
