package modelo;
import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
public class Imagen {
    private long id;
    private String denominacion;
}
