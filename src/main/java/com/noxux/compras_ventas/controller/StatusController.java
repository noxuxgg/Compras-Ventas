package com.noxux.compras_ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {
    @GetMapping("/status")
    public String statusApp() {
        String status = "Application Running";
        return status;
    }
    

}
