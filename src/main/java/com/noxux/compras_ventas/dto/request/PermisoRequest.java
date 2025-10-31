package com.noxux.compras_ventas.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermisoRequest {
    
    // @NotEmpty   // []
    @NotBlank(message = "El nombre es obligatorio")   // ""
    @Size(max = 50, message = "Los nombre deben tener máximo 50 caracteres")
    private String nombre;

    @NotBlank
    @Size(max = 100, message = "La descripción deben tener máximo 100 caracteres")
    private String descripcion;

    @NotBlank
    @Size(max = 100, message = "El recurso debe tener máximo 100 caracteres")
    private String accion;

    @NotBlank
    @Size(max = 100, message = "La acción debe tener máximo 100 caracteres")
    private String recurso;
}
