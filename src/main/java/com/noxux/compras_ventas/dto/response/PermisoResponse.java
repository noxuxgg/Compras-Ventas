package com.noxux.compras_ventas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class PermisoResponse {
    
    private Integer id;
    
    private String nombre;
    
    private String descripcion;
    
    private String accion;

    private String recurso;

}
