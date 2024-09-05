package modelo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor 
@Setter
@Getter 
@ToString(exclude = "localidad")
@SuperBuilder

public class Articulo{
    private long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private UnidadMedida unidadMedida;
    private Imagen imagen;
}