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
@RequestMapping("/api/v1/Perfulandia/sucursal")
public class ControllerSucursal {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping("/Listar")
    public ResponseEntity<List<Sucursal>> ListarSucursal(){
        List<Sucursal> sucursales = sucursalService.ListarSucursal();
        if (sucursales.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sucursales);
        
    }

    @PostMapping("/Agregar")
    public ResponseEntity <Sucursal> guardar (@RequestBody Sucursal sucursal){
        Sucursal sucursalNueva = sucursalService.GuardarSucursal(sucursal);
        return ResponseEntity.status(HttpStatus.CREATED).body(sucursalNueva);
    }

    @GetMapping("{id}")
    public ResponseEntity<Sucursal> buscarSucursal (@PathVariable long id){
        try{
            Sucursal sucursal = sucursalService.BuscarSucursalId(id);
            return ResponseEntity.ok(sucursal);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Sucursal> actualizarProducto (@PathVariable int id , @RequestBody Sucursal sucursal){
        try {
            Sucursal suc = sucursalService.BuscarSucursalId(id);
            suc.setId(sucursal.getId());
            suc.setNombre(sucursal.getNombre());
            suc.setDireccion(sucursal.getDireccion());
            sucursalService.GuardarSucursal(suc);
            return ResponseEntity.ok(sucursal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> EliminarSucursal(@PathVariable long id){
        try {
            sucursalService.EliminarSucursal(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
    


    



    



  

   