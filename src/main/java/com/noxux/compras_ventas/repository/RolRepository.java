package com.noxux.compras_ventas.repository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.noxux.compras_ventas.entity.Rol;
@Repository
public interface RolRepository extends ListCrudRepository<Rol, Integer> {

}