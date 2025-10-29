package com.noxux.compras_ventas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noxux.compras_ventas.dto.request.PermisoRequest;
import com.noxux.compras_ventas.dto.response.PermisoResponse;
import com.noxux.compras_ventas.service.PermisoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/permiso")
public class PermisoController {
    private final PermisoService permisoService;
    
    @GetMapping()
    public List<PermisoResponse> findAllPermiso(){
        return permisoService.findAllPermiso();
    }

    @GetMapping("/{id}")
    public PermisoResponse findPermisoById(@PathVariable Integer id){
        return permisoService.findPermisoById(id);
    }

    @PostMapping
    public PermisoResponse createPermiso(@RequestBody PermisoRequest permisoRequest){
        return permisoService.createPermiso(permisoRequest);
    }

    @PutMapping("/{id}")
    public PermisoResponse updatePermiso(@PathVariable Integer id, @RequestBody PermisoRequest permisoRequest){
        return permisoService.updatePermiso(id, permisoRequest);
    }

    @DeleteMapping("/{id}")
    public void deletePermiso(Integer id){
        permisoService.deletePermisoById(id);
    }
}
