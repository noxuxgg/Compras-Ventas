package com.noxux.compras_ventas.service;

import java.util.List;

import com.noxux.compras_ventas.dto.request.PermisoRequest;
import com.noxux.compras_ventas.dto.response.PermisoResponse;

public interface PermisoService {
    List<PermisoResponse> findAllPermiso();
    
    PermisoResponse findPermisoById(Integer id);

    PermisoResponse createPermiso(PermisoRequest permisoRequest);

    PermisoResponse updatePermiso(Integer id, PermisoRequest permisoRequest);

    void deletePermisoById(Integer id);
}
