package cl.Perfulandia.Inventario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Producto")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProductoId;
    
    @Column(unique=true,length = 20,nullable = false)
    private String codigoDeBarras;

    @Column(nullable = false)
    private String NombreProducto;
    
    @Column(nullable = false)
    private String Marca;

    @Column(nullable = false)
    private double precioProducto;
}