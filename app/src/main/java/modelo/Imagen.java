package main.java.modelo;
import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "localidad")  // Excluir localidad para evitar recursión infinita
@SuperBuilder
public class Imagen {
    private long id;
    private String denominacion;
}
