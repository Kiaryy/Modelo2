package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder

public class Promocion {
    private long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descpripcionDescuento;
    HashSet<Imagen> promoImagen = new HashSet<Imagen>();
    HashSet<Articulo> promociones = new HashSet<Articulo>();

    
}
