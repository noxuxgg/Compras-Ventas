package com.noxux.compras_ventas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.noxux.compras_ventas.entity.Rol;
import com.noxux.compras_ventas.repository.RolRepository;

@Service
public class RolService {
    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }
    
    public List<Rol> findAllRoles(){
        return rolRepository.findAll();
    }

}
