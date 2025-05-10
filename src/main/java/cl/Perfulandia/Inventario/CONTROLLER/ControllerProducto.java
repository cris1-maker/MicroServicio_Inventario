package cl.Perfulandia.Inventario.CONTROLLER;
import org.springframework.web.bind.annotation.RestController;
import cl.Perfulandia.Inventario.Modelo.Producto;
import cl.Perfulandia.Inventario.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
@RestController
@RequestMapping("/api/v1/Perfulandia/producto")
public class ControllerProducto {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/Listar")
    public ResponseEntity<List<Producto>> listaProductos(){
        List<Producto> productos = productoService.ListarProductos();
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
        
    }

    @PostMapping("/Agregar")
    public ResponseEntity <Producto> guardar (@RequestBody Producto producto){
        Producto productoNuevo = productoService.GuardarProductos(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoNuevo);
    }

    @GetMapping("{id}")
    public ResponseEntity<Producto> buscarProducto (@PathVariable long id){
        try{
            Producto producto = productoService.BuscarPorIdId(id);
            return ResponseEntity.ok(producto);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    //@GetMapping("{cod}")
    //public ResponseEntity<Producto> buscarProductoCod (@PathVariable String cod){
        //try{
            //Producto producto = productoService.findAll(cod);
            //return ResponseEntity.ok(producto);
        //}catch(Exception e){
            //return ResponseEntity.notFound().build();
        //}
    //}


    @PutMapping("{id}")
    public ResponseEntity<Producto> actualizarProducto (@PathVariable int id , @RequestBody Producto producto){
        try {
            Producto pro = productoService.BuscarPorIdId(id);
            pro.setProductoId(producto.getProductoId());
            pro.setNombreProducto(producto.getNombreProducto());
            pro.setMarca(producto.getMarca());
            pro.setCodigoDeBarras(producto.getCodigoDeBarras());
            pro.setPrecioProducto(producto.getPrecioProducto());
            productoService.GuardarProductos(pro);
            return ResponseEntity.ok(producto);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable long id){
        try {
            productoService.EliminarProducto(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}