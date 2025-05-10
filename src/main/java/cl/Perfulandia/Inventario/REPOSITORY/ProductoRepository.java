package cl.Perfulandia.Inventario.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.Perfulandia.Inventario.Modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{

}