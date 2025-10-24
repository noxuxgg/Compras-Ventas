package com.noxux.compras_ventas.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.noxux.compras_ventas.entity.Rol;
@Repository
public interface RolRepository extends ListCrudRepository<Rol, Integer> {

    //Query Methods
    List<Rol> findByNombre(String nombre);

    //SQL NATIVO
    @Query(value = "SELECT * FROM rol", nativeQuery = true)
    List<Rol> findAllRoles();

    @Query(value = "SELECT * FROM rol WHERE nombre like '?1'", nativeQuery = true) //El ?1 quiere decir que es el primer parametro encontrado
    List<Rol> getRolByNombre(String nombre);
    
    //JPQL
    @Query(value = "SELECT Rol FROM Rol")
    List<Rol> findAllRolesJpql();

}