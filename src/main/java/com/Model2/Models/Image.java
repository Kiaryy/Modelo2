package com.Model2.Models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "localidad")

@SuperBuilder
public  class Image {
    private long id;
    private String denominacion;
}