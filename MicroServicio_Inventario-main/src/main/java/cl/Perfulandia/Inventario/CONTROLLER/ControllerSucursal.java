package cl.Perfulandia.Inventario.CONTROLLER;
import org.springframework.web.bind.annotation.RestController;
import cl.Perfulandia.Inventario.Modelo.Sucursal;
import cl.Perfulandia.Inventario.Service.SucursalService;
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
@RequestMapping("/api/v1/Perfulandia/sucursal")
=======
@RequestMapping("/api/v1/sucursal")
>>>>>>> 0856636 (Arreglos que me dio el profesor)
public class ControllerSucursal {

    @Autowired
    private SucursalService sucursalService;

<<<<<<< HEAD
    @GetMapping("/Listar")
    public ResponseEntity<List<Sucursal>> ListarSucursal(){
        List<Sucursal> sucursales = sucursalService.ListarSucursal();
=======
    @GetMapping("/listar")
    public ResponseEntity<List<Sucursal>> listarSucursal(){
        List<Sucursal> sucursales = sucursalService.listarSucursal();
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        if (sucursales.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sucursales);
        
    }

<<<<<<< HEAD
    @PostMapping("/Agregar")
    public ResponseEntity <Sucursal> guardar (@RequestBody Sucursal sucursal){
        Sucursal sucursalNueva = sucursalService.GuardarSucursal(sucursal);
=======
    @PostMapping("/agregar")
    public ResponseEntity <Sucursal> guardarSucursal (@RequestBody Sucursal sucursal){
        Sucursal sucursalNueva = sucursalService.guardarSucursal(sucursal);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
        return ResponseEntity.status(HttpStatus.CREATED).body(sucursalNueva);
    }

    @GetMapping("{id}")
    public ResponseEntity<Sucursal> buscarSucursal (@PathVariable long id){
        try{
<<<<<<< HEAD
            Sucursal sucursal = sucursalService.BuscarSucursalId(id);
=======
            Sucursal sucursal = sucursalService.buscarSucursal(id);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.ok(sucursal);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

<<<<<<< HEAD
    @PutMapping("{id}")
    public ResponseEntity<Sucursal> actualizarProducto (@PathVariable int id , @RequestBody Sucursal sucursal){
        try {
            Sucursal suc = sucursalService.BuscarSucursalId(id);
            suc.setId(sucursal.getId());
            suc.setNombre(sucursal.getNombre());
            suc.setDireccion(sucursal.getDireccion());
            sucursalService.GuardarSucursal(suc);
=======
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Sucursal> actualizarSucursal (@PathVariable long id , @RequestBody Sucursal sucursal){
        try {
            Sucursal suc = sucursalService.buscarSucursal(id);
            suc.setId(sucursal.getId());
            suc.setNombre(sucursal.getNombre());
            suc.setDireccion(sucursal.getDireccion());
            sucursalService.guardarSucursal(suc);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.ok(sucursal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
<<<<<<< HEAD
    public ResponseEntity<?> EliminarSucursal(@PathVariable long id){
        try {
            sucursalService.EliminarSucursal(id);
=======
    public ResponseEntity<?> eliminarSucursal(@PathVariable long id){
        try {
            sucursalService.eliminarSucursal(id);
>>>>>>> 0856636 (Arreglos que me dio el profesor)
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
    


    



    



  

   