package com.example.demoms;

import org.springframework.web.bind.annotation.GetMapping;


public class Visa {
    @GetMapping("/myvisa")
    public String getData(){
        return ("book slot for Visa");

    }
}

