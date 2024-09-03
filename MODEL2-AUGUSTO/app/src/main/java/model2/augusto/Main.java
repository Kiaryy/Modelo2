/*
 * This source file was generated by the Gradle 'init' task
 */
package model2.augusto;


/*
 * This source file was generated by the Gradle 'init' task
 */

import java.time.LocalDate;
import java.time.LocalTime;
 
import java.util.HashSet;
 
public class Main {
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        UnidadMedida unidad1 = UnidadMedida.builder()
        .id(1L)
        .denominacion("8 porciones")
        .build();
        UnidadMedida unidad2 = UnidadMedida.builder()
        .id(1L)
        .denominacion("4 porciones")
        .build();
        UnidadMedida unidad3 = UnidadMedida.builder()
        .id(1L)
        .denominacion("1 litro")
        .build();

        Imagen imagen1=Imagen.builder()
        .id(1L)
        .denominacion("Pizza grande Hawaiana")
        .build();
        Imagen imagen2=Imagen.builder()
        .id(2L)
        .denominacion("Pizza grande  Napolitana")
        .build();

        Imagen imagen3=Imagen.builder()
        .id(3L)
        .denominacion("Pizza grande Muzza")
        .build();

        Imagen imagen4=Imagen.builder()
        .id(4L)
        .denominacion("Pizza chica Hawaiana")
        .build();

        Imagen imagen5=Imagen.builder()
        .id(5L)
        .denominacion("Pizza chica Napolitana")
        .build();

        Imagen imagen6=Imagen.builder()
        .id(6L)
        .denominacion("Pizza chica Muzza")
        .build();

        Imagen imagen7=Imagen.builder()
        .id(7L)
        .denominacion("Cerveza Andes")
        .build();

        Imagen imagen8=Imagen.builder()
        .id(8L)
        .denominacion("Cerveza Quilmes")
        .build();

        Imagen imahappy1 =Imagen.builder()
        .id(1L)
        .denominacion("Happy Hour")
        .build();

        Imagen imahappy2 =Imagen.builder()
        .id(2L)
        .denominacion("Happy Hour")
        .build();

        Imagen verano1 =Imagen.builder()
        .id(1L)
        .denominacion("Promo verano")
        .build();

        Imagen verano2 =Imagen.builder()
        .id(2L)
        .denominacion("Promo verano")
        .build();

        Imagen invierno1 =Imagen.builder()
        .id(1L)
        .denominacion("promo invierno")
        .build();

        Imagen invierno2 =Imagen.builder()
        .id(2L)
        .denominacion("promo invierno")
        .build();

        Articulo articulo1 = Articulo.builder()
        .id(1L)
        .denominacion("Pizza grande Hawaiana")
        .precioVenta(20D)
        .precioCompra(15D)
        .stockActual(14)
        .stockMaximo(40)
        .unidadMedida(unidad1)
        .imagen(imagen1)
        .build();

        Articulo articulo2 = Articulo.builder()
        .id(2L)
        .denominacion("Pizza chica Hawaiana")
        .precioVenta(15D)
        .precioCompra(10D)
        .stockActual(10)
        .stockMaximo(30)
        .unidadMedida(unidad2)
        .imagen(imagen2)
        .build();

    Articulo articulo3 = Articulo.builder()
    .id(3L)
    .denominacion("Pizza grande Napolitana")
    .precioVenta(20D)
    .precioCompra(15D)
    .stockActual(22)
    .stockMaximo(40)
    .unidadMedida(unidad1)
    .imagen(imagen3)
    .build();

    Articulo articulo4 = Articulo.builder()
    .id(4L)
    .denominacion("Pizza chica Napolitana")
    .precioVenta(15D)
    .precioCompra(10D)
    .stockActual(8)
    .stockMaximo(25)
    .unidadMedida(unidad2)
    .imagen(imagen4)
    .build();

        Articulo articulo5 = Articulo.builder()
        .id(5L)
        .denominacion("Pizza grande Muzza")
        .precioVenta(20D)
        .precioCompra(15D)
        .stockActual(22)
        .stockMaximo(40)
        .unidadMedida(unidad1)
        .imagen(imagen5)
        .build();

        Articulo articulo6 = Articulo.builder()
        .id(6L)
        .denominacion("Pizza chica Muzza ")
        .precioVenta(15D)
        .precioCompra(10D)
        .stockActual(2)
        .stockMaximo(35)
        .unidadMedida(unidad2)
        .imagen(imagen6)
        .build();

        Articulo articulo7 = Articulo.builder()
        .id(7L)
        .denominacion("Cerveza  Andes")
        .precioVenta(5D)
        .precioCompra(3D)
        .stockActual(20)
        .stockMaximo(40)
        .unidadMedida(unidad3)
        .imagen(imagen7)
        .build();

    Articulo articulo8 = Articulo.builder()
    .id(8L)
    .denominacion("Cerveza Quilmes")
    .precioVenta(5D)
    .precioCompra(3D)
    .stockActual(10)
    .stockMaximo(40)
    .unidadMedida(unidad3)
    .imagen(imagen8)
    .build();
    
    HashSet<Imagen> imagenPromo1 =new HashSet<>();
    imagenPromo1.add(imagen1);
    imagenPromo1.add(imagen3);
    imagenPromo1.add(imagen8);
    HashSet<Articulo> articulosPromo1 = new HashSet<>();
    articulosPromo1.add(articulo1);
    articulosPromo1.add(articulo2);
    articulosPromo1.add(articulo8);
    Promocion promocion1 = Promocion.builder()
    .id(1L)
    .denominacion("Promoción Happy Hour  ")
    .FechaDesde(LocalDate.parse("2024-11-02"))
    .FechaHasta(LocalDate.parse("2024-11-02"))
    .HoraDesde(LocalTime.parse("18:00:00"))
    .HoraHasta(LocalTime.parse("23:59:00"))
    .descripcionDescuento("Promo con decuento de 1 Pizza grande Hawaiana,  1 Pizza grande Muzza, 1 Cerveza Quilmes")
    .promoImagen(imagenPromo1)
    .promociones(articulosPromo1)
    .build();

    HashSet<Imagen> imagenPromo2 =new HashSet<>();
    imagenPromo1.add(imagen4);
    imagenPromo1.add(imagen2);
    imagenPromo1.add(imagen7);
    imagenPromo1.add(imagen8);
    HashSet<Articulo> articulosPromo2 = new HashSet<>();
    articulosPromo1.add(articulo2);
    articulosPromo1.add(articulo3);
    articulosPromo1.add(articulo7);
    articulosPromo1.add(articulo8);

        Promocion promocion2 = Promocion.builder()
        .id(2L)
        .denominacion("Promoción Verano")
        .FechaDesde(LocalDate.parse("2024-11-03"))
        .FechaHasta(LocalDate.parse("2024-11-03"))
        .HoraDesde(LocalTime.parse("18:00:00"))
        .HoraHasta(LocalTime.parse("23:59:00"))
        .descripcionDescuento("Promo con decuento de 1 Pizza chica Hawaiana,  1 Pizza grande Napolitana, 1 Cerveza Quilmes y 1 Cerveza Andes")
        .promoImagen(imagenPromo2)
        .promociones(articulosPromo2)
        .build();

        HashSet<Imagen> imagenPromo3 =new HashSet<>();
        imagenPromo1.add(imagen1);
        imagenPromo1.add(imagen6);
        imagenPromo1.add(imagen8);
        HashSet<Articulo> articulosPromo3 = new HashSet<>();
        articulosPromo1.add(articulo1);
        articulosPromo1.add(articulo6);

        articulosPromo1.add(articulo8);

        Promocion promocion3 = Promocion.builder()
        .id(3L)
        .denominacion("Promoción Verano")
        .FechaDesde(LocalDate.parse("2024-11-04"))
        .FechaHasta(LocalDate.parse("2024-11-04"))
        .HoraDesde(LocalTime.parse("18:00:00"))
        .HoraHasta(LocalTime.parse("23:59:00"))
        .descripcionDescuento("Promo con decuento de 1 Pizza grande Hawaiana,  1 Pizza chica Muzza, 1 Cerveza Quilmes")
        .promoImagen(imagenPromo2)
        .promociones(articulosPromo2)
        .build();

        System.out.println("----------Articulos-----------");
        System.out.println(articulo1.getDenominacion());
        System.out.println(articulo2.getDenominacion());
        System.out.println(articulo3.getDenominacion());
        System.out.println(articulo4.getDenominacion());
        System.out.println(articulo5.getDenominacion());
        System.out.println(articulo6.getDenominacion());
        System.out.println(articulo7.getDenominacion());
        System.out.println(articulo8.getDenominacion());
        System.out.println("----------Promociones-----------");
        System.out.println("Promocion 1:");
        System.out.println(promocion1.getDenominacion());
        System.out.println("-----Articulos en Promocion 1----");
        Double total1 = 0D;
         // Se imprime la descripcion de cada articulo y se suma su precio al total de la promocion
        for (Articulo articulo : promocion1.getPromociones()) {
            System.out.println(articulo.getDenominacion());
            total1 += articulo.getPrecioVenta();
        }
        System.out.println("Total: $" + total1);
        System.out.println("-----------------");
        System.out.println("Promocion 2:");
        System.out.println(promocion2.getDenominacion());
        System.out.println("-----Articulos en Promocion 2----");
        Double total2 = 0D;
        for (Articulo articulo : promocion2.getPromociones()) {
            System.out.println(articulo.getDenominacion());
            total2 += articulo.getPrecioVenta();
        }
        System.out.println("Total: $" + total2);
        System.out.println("-----------------");

        System.out.println("Promocion 3:");
        System.out.println(promocion3.getDenominacion());
        System.out.println("-----Articulos en Promocion 3----");
        Double total3 = 0D;
        for (Articulo articulo : promocion3.getPromociones()) {
            System.out.println(articulo.getDenominacion());
            total3 += articulo.getPrecioVenta();
        }
        System.out.println("Total: $" + total3);
        System.out.println("-----------------");

        System.out.println("Promocion de Verano:\nValida desde: " + promocion2.getFechaDesde() + " " + promocion2.getHoraDesde());
        System.out.println("Valida hasta: " + promocion2.getFechaHasta() + " " + promocion2.getHoraHasta());

        if (total1 < total2 && total1 < total3) {
            System.out.println("La promocion mas economica es la numero 1, con un precio de: $" + total1);
        }else if (total2 < total1 && total2 < total3) {
            System.out.println("La promocion mas economica es la numero 2, con un precio de: $" + total2);
        }else{
            System.out.println("La promocion mas economica es la numero 3, con un precio de: $" + total3);
        }

    }
}
