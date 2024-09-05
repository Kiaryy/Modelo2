package com.Model2;

import com.Model2.Models.Article;
import com.Model2.Models.Image;
import com.Model2.Models.MeasurementUnit;
import com.Model2.Models.Promotion;

import java.time.LocalDate;
import java.time.LocalTime;
 
import java.util.HashSet;
 
public class Main {

    public static void main(String[] args) {
        MeasurementUnit unidad1 = MeasurementUnit.builder()
        .id(1L)
        .type("8 porciones")
        .build();
        MeasurementUnit unidad2 = MeasurementUnit.builder()
        .id(1L)
        .type("4 porciones")
        .build();
        MeasurementUnit unidad3 = MeasurementUnit.builder()
        .id(1L)
        .type("1 litro")
        .build();

        Image Image1=Image.builder()
        .id(1L)
        .denominacion("Pizza grande Hawaiana")
        .build();
        Image Image2=Image.builder()
        .id(2L)
        .denominacion("Pizza grande  Napolitana")
        .build();

        Image Image3=Image.builder()
        .id(3L)
        .denominacion("Pizza grande Muzza")
        .build();

        Image Image4=Image.builder()
        .id(4L)
        .denominacion("Pizza chica Hawaiana")
        .build();

        Image Image5=Image.builder()
        .id(5L)
        .denominacion("Pizza chica Napolitana")
        .build();

        Image Image6=Image.builder()
        .id(6L)
        .denominacion("Pizza chica Muzza")
        .build();

        Image Image7=Image.builder()
        .id(7L)
        .denominacion("Cerveza Andes")
        .build();

        Image Image8=Image.builder()
        .id(8L)
        .denominacion("Cerveza Quilmes")
        .build();

        Image imahappy1 =Image.builder()
        .id(1L)
        .denominacion("Happy Hour")
        .build();

        Image imahappy2 =Image.builder()
        .id(2L)
        .denominacion("Happy Hour")
        .build();

        Image verano1 =Image.builder()
        .id(1L)
        .denominacion("Promo verano")
        .build();

        Image verano2 =Image.builder()
        .id(2L)
        .denominacion("Promo verano")
        .build();

        Image invierno1 =Image.builder()
        .id(1L)
        .denominacion("promo invierno")
        .build();

        Image invierno2 =Image.builder()
        .id(2L)
        .denominacion("promo invierno")
        .build();

        Article Article1 = Article.builder()
        .id(1L)
        .denominacion("Pizza grande Hawaiana")
        .precioVenta(20D)
        .precioCompra(15D)
        .stockActual(14)
        .stockMaximo(40)
        .unidadMedida(unidad1)
        .image(Image1)
        .build();

        Article Article2 = Article.builder()
        .id(2L)
        .denominacion("Pizza chica Hawaiana")
        .precioVenta(15D)
        .precioCompra(10D)
        .stockActual(10)
        .stockMaximo(30)
        .unidadMedida(unidad2)
        .image(Image2)
        .build();

    Article Article3 = Article.builder()
    .id(3L)
    .denominacion("Pizza grande Napolitana")
    .precioVenta(20D)
    .precioCompra(15D)
    .stockActual(22)
    .stockMaximo(40)
    .unidadMedida(unidad1)
    .image(Image3)
    .build();

    Article Article4 = Article.builder()
    .id(4L)
    .denominacion("Pizza chica Napolitana")
    .precioVenta(15D)
    .precioCompra(10D)
    .stockActual(8)
    .stockMaximo(25)
    .unidadMedida(unidad2)
    .image(Image4)
    .build();

        Article Article5 = Article.builder()
        .id(5L)
        .denominacion("Pizza grande Muzza")
        .precioVenta(20D)
        .precioCompra(15D)
        .stockActual(22)
        .stockMaximo(40)
        .unidadMedida(unidad1)
        .Image(Image5)
        .build();

        Article Article6 = Article.builder()
        .id(6L)
        .denominacion("Pizza chica Muzza ")
        .precioVenta(15D)
        .precioCompra(10D)
        .stockActual(2)
        .stockMaximo(35)
        .unidadMedida(unidad2)
        .Image(Image6)
        .build();

        Article Article7 = Article.builder()
        .id(7L)
        .denominacion("Cerveza  Andes")
        .precioVenta(5D)
        .precioCompra(3D)
        .stockActual(20)
        .stockMaximo(40)
        .unidadMedida(unidad3)
        .Image(Image7)
        .build();

    Article Article8 = Article.builder()
    .id(8L)
    .denominacion("Cerveza Quilmes")
    .precioVenta(5D)
    .precioCompra(3D)
    .stockActual(10)
    .stockMaximo(40)
    .unidadMedida(unidad3)
    .Image(Image8)
    .build();
    
    HashSet<Image> ImagePromo1 =new HashSet<>();
    ImagePromo1.add(Image1);
    ImagePromo1.add(Image3);
    ImagePromo1.add(Image8);
    HashSet<Article> ArticlesPromo1 = new HashSet<>();
    ArticlesPromo1.add(Article1);
    ArticlesPromo1.add(Article2);
    ArticlesPromo1.add(Article8);
    Promotion Promotion1 = Promotion.builder()
    .id(1L)
    .denominacion("Promoción Happy Hour  ")
    .FechaDesde(LocalDate.parse("2024-11-02"))
    .FechaHasta(LocalDate.parse("2024-11-02"))
    .HoraDesde(LocalTime.parse("18:00:00"))
    .HoraHasta(LocalTime.parse("23:59:00"))
    .descripcionDescuento("Promo con decuento de 1 Pizza grande Hawaiana,  1 Pizza grande Muzza, 1 Cerveza Quilmes")
    .promoImage(ImagePromo1)
    .Promotiones(ArticlesPromo1)
    .build();

    HashSet<Image> ImagePromo2 =new HashSet<>();
    ImagePromo1.add(Image4);
    ImagePromo1.add(Image2);
    ImagePromo1.add(Image7);
    ImagePromo1.add(Image8);
    HashSet<Article> ArticlesPromo2 = new HashSet<>();
    ArticlesPromo1.add(Article2);
    ArticlesPromo1.add(Article3);
    ArticlesPromo1.add(Article7);
    ArticlesPromo1.add(Article8);

        Promotion Promotion2 = Promotion.builder()
        .id(2L)
        .denominacion("Promoción Verano")
        .FechaDesde(LocalDate.parse("2024-11-03"))
        .FechaHasta(LocalDate.parse("2024-11-03"))
        .HoraDesde(LocalTime.parse("18:00:00"))
        .HoraHasta(LocalTime.parse("23:59:00"))
        .descripcionDescuento("Promo con decuento de 1 Pizza chica Hawaiana,  1 Pizza grande Napolitana, 1 Cerveza Quilmes y 1 Cerveza Andes")
        .promoImage(ImagePromo2)
        .Promotiones(ArticlesPromo2)
        .build();

        HashSet<Image> ImagePromo3 =new HashSet<>();
        ImagePromo1.add(Image1);
        ImagePromo1.add(Image6);
        ImagePromo1.add(Image8);
        HashSet<Article> ArticlesPromo3 = new HashSet<>();
        ArticlesPromo1.add(Article1);
        ArticlesPromo1.add(Article6);

        ArticlesPromo1.add(Article8);

        Promotion Promotion3 = Promotion.builder()
        .id(3L)
        .denominacion("Promoción Verano")
        .FechaDesde(LocalDate.parse("2024-11-04"))
        .FechaHasta(LocalDate.parse("2024-11-04"))
        .HoraDesde(LocalTime.parse("18:00:00"))
        .HoraHasta(LocalTime.parse("23:59:00"))
        .descripcionDescuento("Promo con decuento de 1 Pizza grande Hawaiana,  1 Pizza chica Muzza, 1 Cerveza Quilmes")
        .promoImage(ImagePromo2)
        .Promotiones(ArticlesPromo2)
        .build();

        System.out.println("----------Articles-----------");
        System.out.println(Article1.getDenominacion());
        System.out.println(Article2.getDenominacion());
        System.out.println(Article3.getDenominacion());
        System.out.println(Article4.getDenominacion());
        System.out.println(Article5.getDenominacion());
        System.out.println(Article6.getDenominacion());
        System.out.println(Article7.getDenominacion());
        System.out.println(Article8.getDenominacion());
        System.out.println("----------Promotiones-----------");
        System.out.println("Promotion 1:");
        System.out.println(Promotion1.getDenominacion());
        System.out.println("-----Articles en Promotion 1----");
        Double total1 = 0D;
         // Se imprime la descripcion de cada Article y se suma su precio al total de la Promotion
        for (Article Article : Promotion1.getPromotiones()) {
            System.out.println(com.Model2.Models.Article.getDenominacion());
            total1 += com.Model2.Models.Article.getPrecioVenta();
        }
        System.out.println("Total: $" + total1);
        System.out.println("-----------------");
        System.out.println("Promotion 2:");
        System.out.println(Promotion2.getDenominacion());
        System.out.println("-----Articles en Promotion 2----");
        Double total2 = 0D;
        for (Article Article : Promotion2.getPromotiones()) {
            System.out.println(com.Model2.Models.Article.getDenominacion());
            total2 += com.Model2.Models.Article.getPrecioVenta();
        }
        System.out.println("Total: $" + total2);
        System.out.println("-----------------");

        System.out.println("Promotion 3:");
        System.out.println(Promotion3.getDenominacion());
        System.out.println("-----Articles en Promotion 3----");
        Double total3 = 0D;
        for (Article Article : Promotion3.getPromociones()) {
            System.out.println(com.Model2.Models.Article.getDenominacion());
            total3 += com.Model2.Models.Article.getPrecioVenta();
        }
        System.out.println("Total: $" + total3);
        System.out.println("-----------------");

        System.out.println("Promotion de Verano:\nValida desde: " + Promotion2.getFechaDesde() + " " + Promotion2.getHoraDesde());
        System.out.println("Valida hasta: " + Promotion2.getFechaHasta() + " " + Promotion2.getHoraHasta());

        if (total1 < total2 && total1 < total3) {
            System.out.println("La Promotion mas economica es la numero 1, con un precio de: $" + total1);
        }else if (total2 < total1 && total2 < total3) {
            System.out.println("La Promotion mas economica es la numero 2, con un precio de: $" + total2);
        }else{
            System.out.println("La Promotion mas economica es la numero 3, con un precio de: $" + total3);
        }

    }
}
