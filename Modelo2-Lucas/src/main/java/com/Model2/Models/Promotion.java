package com.Model2.Models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Setter
@Getter
public class Promotion {
    private long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private PromotionType tipoPromocion;
    private HashSet<Image> promoImagen=new HashSet<>();
    private HashSet<Article> promociones=new HashSet<>();
    
}
