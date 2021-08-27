package com.example.kubernetesspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage(){
        return "Welcome to GKE !!";
    }
}
