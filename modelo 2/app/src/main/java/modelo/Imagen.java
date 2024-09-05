package modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "localidad")
@SuperBuilder

public  class Imagen{
    private long id;
    private String denominacion;
}