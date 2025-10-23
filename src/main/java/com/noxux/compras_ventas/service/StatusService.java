package com.noxux.compras_ventas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.noxux.compras_ventas.entity.Rol;

@Service
public class StatusService {

    public String statusMessage(){
        String statusMessage = "Application Running";
        return statusMessage;
    }

    public void dataTypes(){
        //PRIMITIVOS
        int edad = 30;
        double precio = 20.50;
        boolean activo = true;
        char vowel = 'A';
        //DATA OBJETO (propio java)
        String nombre = "Fernando";
        Integer edad2Integer = 30;
        //LISTAS
        List<String> productos = new ArrayList<>();
        productos.add("Producto 1");
        productos.add("Producto 2");
        productos.clear();
        //DATA OBJETO (logica de negocio)
        Rol rolAdmin = new Rol("ADMIN", "Rol administrador",1);
        Rol rolGerente = new Rol("GERENTE", "Rol gerente",2);
    }

}
