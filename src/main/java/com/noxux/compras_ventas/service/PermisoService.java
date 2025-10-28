package com.noxux.compras_ventas.service;

public interface PermisoService {
    List<PermisoResponse> findAllPermiso();
    
    PermisoResponse findPermisoById(Integer id);

    PermisoResponse createPermiso(PermisoRequest permisoRequest);

    PermisoResponse updatePermiso(Integer id, PermisoRequest permisoRequest);

    void deletePermisoById(Integer id);
}
