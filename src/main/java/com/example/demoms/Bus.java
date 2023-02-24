package com.example.demoms;


import org.springframework.web.bind.annotation.GetMapping;

public class Bus {
    @GetMapping("/mybus")
    public String getData(){
        return ("please book your bus ticket, PAULO TRAVELS");

    }
}
