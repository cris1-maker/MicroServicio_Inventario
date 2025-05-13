package cl.Perfulandia.Inventario.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.Perfulandia.Inventario.Modelo.Producto;
import cl.Perfulandia.Inventario.REPOSITORY.ProductoRepository;
import jakarta.transaction.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductoService {
    @Autowired
    ProductoRepository ProductoRepository;

   

    public List<Producto> ListarProductos() {
        return ProductoRepository.findAll();
    }

    public Producto GuardarProductos(Producto producto) {
        return ProductoRepository.save(producto);
    }

    public Producto BuscarPorCod(String cod) {
        return ProductoRepository.findByCod(cod).orElse(null);
    }

    public Producto BuscarPorIdId(long id) {
        return ProductoRepository.findById(id).get();
    }

    public void EliminarProducto(long id) {
        ProductoRepository.deleteById(id);
    }
}
