package cl.Perfulandia.Inventario.REPOSITORY;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cl.Perfulandia.Inventario.Modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{
    Optional<Producto> findByCod(String cod);
<<<<<<< HEAD

=======
    
>>>>>>> 0856636 (Arreglos que me dio el profesor)
}