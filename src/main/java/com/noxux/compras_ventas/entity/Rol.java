package com.noxux.compras_ventas.entity;

import jakarta.persistence.Entity;

@Entity
public class Rol {
    //ATRIBUTOS
    private int identifier;
    private String nombre;
    private String description;
    
    //CONSTRUCTOR
    public Rol(String nombre, String description, int identifier){
        this.identifier = identifier;
        this.nombre = nombre;
        this.description = description;
    }

    //GETTERS and SETTERS
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
