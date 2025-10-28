package com.noxux.compras_ventas.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Permiso {
    @Id
    private Integer id;
    
    @Column(name = "per_nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "per_descripcion", length = 100)
    private String descripcion;
    
    @Column(name = "per_recurso", length = 100)
    private String recurso;

    @Column(name = "per_accion", length = 100)
    private String accion;
}