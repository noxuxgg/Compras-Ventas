package com.noxux.compras_ventas.dto.response;

import java.time.format.DateTimeFormatter;

import com.noxux.compras_ventas.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponse {
    
    private Integer id;

    private String nombres;

    private String apellidos;

    private String fechaNacimiento;

    private String telefono;

    private String direccion;

    private String dni;

    private String correo;

    private String username;

    public static UsuarioResponse fromEntity(Usuario usuario){
        return UsuarioResponse.builder()
        .id(usuario.getId())
        .nombres(usuario.getNombres())
        .apellidos(usuario.getApellidos())
        .fechaNacimiento(usuario.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
        .telefono(usuario.getTelefono())
        .direccion(usuario.getDireccion())
        .dni(usuario.getDni())
        .correo(usuario.getCorreo())
        .username(usuario.getUsername())
        .build();
    }

}
