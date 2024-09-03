package model2.augusto;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "localidad")  // Excluir localidad para evitar recursión infinita
@SuperBuilder

public class Promocion {
    private long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private TipoPromocion tipoPromocion;
    private HashSet<Imagen> promoImagen=new HashSet<>();
    private HashSet<Articulo> promociones=new HashSet<>();
    
}
