package com.Model2.Models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Article {
    private long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private MeasurementUnit unidadMedida;
    private Image image;
    
}