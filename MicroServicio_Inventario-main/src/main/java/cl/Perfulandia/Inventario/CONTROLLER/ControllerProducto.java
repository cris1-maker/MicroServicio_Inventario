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
<<<<<<< HEAD
@RequestMapping("/api/v1/Perfulandia/producto")
=======
@RequestMapping("/api/v1/producto")
>>>>>>> 0856636 (Arreglos que me dio el profesor)
public class ControllerProducto {

    @Autowired
    private ProductoService productoService;

<<<<<<< HEAD
    @GetMapping("/Listar")
    public ResponseEntity<List<Producto>> listaProductos(){
        List<Producto> productos = productoService.ListarProductos();
=======
    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listarProductos(){
        List<Producto> productos = productoService.listarProductos();
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
        
    }

<<<<<<< HEAD
    @PostMapping("/Agregar")
    public ResponseEntity <Producto> guardar (@RequestBody Producto producto){
        Producto productoNuevo = productoService.GuardarProductos(producto);
=======
    @PostMapping("/agregar")
    public ResponseEntity <Producto> guardar (@RequestBody Producto producto){
        Producto productoNuevo = productoService.guardarProductos(producto);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        return ResponseEntity.status(HttpStatus.CREATED).body(productoNuevo);
    }

    @GetMapping("{id}")
    public ResponseEntity<Producto> buscarProducto (@PathVariable long id){
        try{
<<<<<<< HEAD
            Producto producto = productoService.BuscarPorIdId(id);
=======
            Producto producto = productoService.buscarPorId(id);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.ok(producto);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("cod/{cod}")
    public ResponseEntity<Producto> buscarPorCod (@PathVariable String cod){
        try{
<<<<<<< HEAD
            Producto producto = productoService.BuscarPorCod(cod);
=======
            Producto producto = productoService.buscarPorCod(cod);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.ok(producto);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/actualizar/{id}")
<<<<<<< HEAD
    public ResponseEntity<Producto> actualizarProducto(@PathVariable int id, @RequestBody Producto producto) {
    try {
        Producto pro = productoService.BuscarPorIdId(id);
        if (pro == null) {
            return ResponseEntity.notFound().build();
        }

        // Evitar cambiar el ID desde el cuerpo
=======
    public ResponseEntity<Producto> actualizarProducto(@PathVariable long id, @RequestBody Producto producto) {
    try {
        Producto pro = productoService.buscarPorId(id);
        if (pro == null) {
            return ResponseEntity.notFound().build();
        }
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        pro.setNombreProducto(producto.getNombreProducto());
        pro.setMarca(producto.getMarca());
        pro.setCod(producto.getCod());
        pro.setPrecioProducto(producto.getPrecioProducto());

<<<<<<< HEAD
        productoService.GuardarProductos(pro);
=======
        productoService.guardarProductos(pro);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        return ResponseEntity.ok(pro);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    }

<<<<<<< HEAD
    //@PutMapping("Actualizar/{id}")
    //public ResponseEntity<Producto> actualizarProducto (@PathVariable int id , @RequestBody Producto producto){
        //try {
            //Producto pro = productoService.BuscarPorIdId(id);
            //pro.setProductoId(producto.getProductoId());
            //pro.setNombreProducto(producto.getNombreProducto());
            //pro.setMarca(producto.getMarca());
            //pro.setCodigoDeBarras(producto.getCodigoDeBarras());
            //pro.setPrecioProducto(producto.getPrecioProducto());
            //productoService.GuardarProductos(pro);
            //return ResponseEntity.ok(producto);
        //} catch (Exception e) {
            //return ResponseEntity.notFound().build();
        //}
    //}

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable long id){
        try {
            productoService.EliminarProducto(id);
=======
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable long id){
        try {
            productoService.eliminarProducto(id);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}