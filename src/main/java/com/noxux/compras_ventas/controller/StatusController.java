package com.noxux.compras_ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noxux.compras_ventas.service.StatusService;


@RestController
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService){
        this.statusService = statusService;
    }

    @GetMapping("/status")
    protected String statusApp() {
        return statusService.statusMessage();
    }
    

}
