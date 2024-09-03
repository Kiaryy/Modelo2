package model2.augusto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString  // Sin parámetros, incluye todos los campos
@SuperBuilder  // Usa @Builder si no necesitas soporte para herencia
public class UnidadMedida {
    private Long id;
    private String denominacion;
}
