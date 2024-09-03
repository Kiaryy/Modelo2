package model2.augusto;


import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor  // Constructor con todos los argumentos
@NoArgsConstructor   // Constructor sin argumentos
@Setter              // Métodos set
@Getter              // Métodos get
@ToString(exclude = "localidad") // Método toString que excluye "localidad"
@SuperBuilder        // Patrón Builder compatible con herencia
public class Articulo {
    private long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private UnidadMedida unidadMedida;
    private Imagen imagen;
    
}