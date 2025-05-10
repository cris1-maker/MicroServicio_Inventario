package cl.Perfulandia.Inventario.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.Perfulandia.Inventario.Modelo.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal , Long> {
    
}
