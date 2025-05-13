package cl.Perfulandia.Inventario.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.Perfulandia.Inventario.Modelo.Sucursal;
import cl.Perfulandia.Inventario.REPOSITORY.SucursalRepository;
import jakarta.transaction.Transactional;

import java.util.List;
@Service
@Transactional
public class SucursalService {
    @Autowired
    private SucursalRepository SucursalRepository;

<<<<<<< HEAD
    public List<Sucursal> ListarSucursal() {
        return SucursalRepository.findAll();
    }

    public Sucursal GuardarSucursal(Sucursal sucursal){
        return SucursalRepository.save(sucursal);
    }

    public Sucursal BuscarSucursalId (long id){
        return SucursalRepository.findById(id).get();
    }

    public void EliminarSucursal (long id){
        SucursalRepository.deleteById(id);
    }

    
=======
    public List<Sucursal> listarSucursal() {
        return SucursalRepository.findAll();
    }

    public Sucursal guardarSucursal(Sucursal sucursal){
        return SucursalRepository.save(sucursal);
    }

    public Sucursal buscarSucursal (long id){
        return SucursalRepository.findById(id).get();
    }

    public void eliminarSucursal (long id){
        SucursalRepository.deleteById(id);
    }
>>>>>>> 0856636 (Arreglos que me dio el profesor)
}
