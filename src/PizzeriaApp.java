import java.time.LocalDate;
import java.time.LocalTime;

public class PizzeriaApp {

    public static void main(String[] args) {

        // 1. Crear la Enumeración TipoPromocion
        TipoPromocion happyHour = TipoPromocion.HAPPY_HOUR;
        TipoPromocion verano = TipoPromocion.VERANO;
        TipoPromocion invierno = TipoPromocion.INVIERNO;

        // 2. Crear unidades de medida
        UnidadMedida porciones8 = new UnidadMedida(1L, "8 porciones");
        UnidadMedida porciones4 = new UnidadMedida(2L, "4 porciones");
        UnidadMedida litro = new UnidadMedida(3L, "1 litro");

        // 3. Crear imágenes para Pizzas y Cervezas
        Imagen imagen1 = new Imagen(1L, "Pizza grande Hawaiana");
        Imagen imagen2 = new Imagen(2L, "Pizza grande Napolitana");
        Imagen imagen3 = new Imagen(3L, "Pizza grande Muzza");
        Imagen imagen4 = new Imagen(4L, "Pizza chica Hawaiana");
        Imagen imagen5 = new Imagen(5L, "Pizza chica Napolitana");
        Imagen imagen6 = new Imagen(6L, "Pizza chica Muzza");
        Imagen imagen7 = new Imagen(7L, "Cerveza Andes");
        Imagen imagen8 = new Imagen(8L, "Cerveza Quilmes");
        Imagen imahappy1 = new Imagen(9L, "Imagen de Happy Hour 1");
        Imagen imahappy2 = new Imagen(10L, "Imagen de Happy Hour 2");
        Imagen verano1 = new Imagen(11L, "Imagen de Verano 1");
        Imagen verano2 = new Imagen(12L, "Imagen de Verano 2");
        Imagen invierno1 = new Imagen(13L, "Imagen de Invierno 1");
        Imagen invierno2 = new Imagen(14L, "Imagen de Invierno 2");
        Imagen cerveza1 = new Imagen(15L, "Cerveza Andes");
        Imagen cerveza2 = new Imagen(16L, "Cerveza Quilmes");

        // 4. Crear artículos y relacionarlos con sus imágenes
        Articulo pizzaGrandeHawaiana = new Articulo(1L, "Pizza grande Hawaiana", 1000.0, 600.0, 50, 100, porciones8);
        pizzaGrandeHawaiana.setImagen(imagen1);

        Articulo pizzaChicaHawaiana = new Articulo(2L, "Pizza chica Hawaiana", 600.0, 350.0, 50, 100, porciones4);
        pizzaChicaHawaiana.setImagen(imagen4);

        Articulo pizzaGrandeNapolitana = new Articulo(3L, "Pizza grande Napolitana", 1100.0, 650.0, 50, 100, porciones8);
        pizzaGrandeNapolitana.setImagen(imagen2);

        Articulo pizzaChicaNapolitana = new Articulo(4L, "Pizza chica Napolitana", 650.0, 370.0, 50, 100, porciones4);
        pizzaChicaNapolitana.setImagen(imagen5);

        Articulo pizzaGrandeMuzza = new Articulo(5L, "Pizza grande Muzza", 900.0, 550.0, 50, 100, porciones8);
        pizzaGrandeMuzza.setImagen(imagen3);

        Articulo pizzaChicaMuzza = new Articulo(6L, "Pizza chica Muzza", 500.0, 300.0, 50, 100, porciones4);
        pizzaChicaMuzza.setImagen(imagen6);

        Articulo cervezaAndes = new Articulo(7L, "Cerveza Andes", 300.0, 200.0, 100, 200, litro);
        cervezaAndes.setImagen(imagen7);

        Articulo cervezaQuilmes = new Articulo(8L, "Cerveza Quilmes", 320.0, 210.0, 100, 200, litro);
        cervezaQuilmes.setImagen(imagen8);

        // 5. Crear promociones y relacionar con artículos e imágenes
        Promocion happyHourPromo = new Promocion(1L, "Happy Hour", LocalDate.now(), LocalDate.now().plusDays(10),
                LocalTime.of(18, 0), LocalTime.of(20, 0), "Descuento en pizzas grandes y cervezas",
                1500.0, happyHour, imahappy1);
        happyHourPromo.addArticulo(pizzaGrandeHawaiana);
        happyHourPromo.addArticulo(pizzaGrandeMuzza);
        happyHourPromo.addArticulo(cervezaQuilmes);

        Promocion veranoPromo = new Promocion(2L, "Verano", LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 31),
                LocalTime.of(12, 0), LocalTime.of(14, 0), "Combo de pizzas y cervezas para verano",
                1800.0, verano, verano1);
        veranoPromo.addArticulo(pizzaChicaHawaiana);
        veranoPromo.addArticulo(pizzaGrandeNapolitana);
        veranoPromo.addArticulo(cervezaQuilmes);
        veranoPromo.addArticulo(cervezaAndes);

        Promocion inviernoPromo = new Promocion(3L, "Invierno", LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 30),
                LocalTime.of(19, 0), LocalTime.of(21, 0), "Combo para el frío",
                1400.0, invierno, invierno1);
        inviernoPromo.addArticulo(pizzaGrandeHawaiana);
        inviernoPromo.addArticulo(pizzaChicaMuzza);
        inviernoPromo.addArticulo(cervezaQuilmes);

        // Mostrar resultados

        // a. Mostrar todas las promociones
        System.out.println("Todas las promociones:");
        mostrarPromocion(happyHourPromo);
        mostrarPromocion(veranoPromo);
        mostrarPromocion(inviernoPromo);

        // b. Mostrar todos los artículos
        System.out.println("\nTodos los artículos:");
        mostrarArticulo(pizzaGrandeHawaiana);
        mostrarArticulo(pizzaChicaHawaiana);
        mostrarArticulo(pizzaGrandeNapolitana);
        mostrarArticulo(pizzaChicaNapolitana);
        mostrarArticulo(pizzaGrandeMuzza);
        mostrarArticulo(pizzaChicaMuzza);
        mostrarArticulo(cervezaAndes);
        mostrarArticulo(cervezaQuilmes);

        // c. Mostrar cada promoción por separado, con artículos relacionados y el precio de venta
        System.out.println("\nDetalle de cada promoción:");
        mostrarPromocion(happyHourPromo);
        mostrarPromocion(veranoPromo);
        mostrarPromocion(inviernoPromo);

        // d. Mostrar el día y horario de la promoción Verano
        System.out.println("\nDía y horario de la promoción Verano:");
        System.out.println("Fecha: " + veranoPromo.getFechaDesde() + " a " + veranoPromo.getFechaHasta());
        System.out.println("Horario: " + veranoPromo.getHoraDesde() + " a " + veranoPromo.getHoraHasta());

        // e. Mostrar cuál es la promoción más económica de las 3
        Promocion promoMasEconomica = obtenerPromocionMasEconomica(happyHourPromo, veranoPromo, inviernoPromo);
        System.out.println("\nLa promoción más económica es: " + promoMasEconomica.getDenominacion() + " con un precio de venta de $" + promoMasEconomica.getPrecioPromocional());
    }

    // Metodo para mostrar detalles de una promoción
    public static void mostrarPromocion(Promocion promocion) {
        System.out.println("Promoción: " + promocion.getDenominacion());
        System.out.println("Descripción: " + promocion.getDescripcionDescuento());
        System.out.println("Precio: $" + promocion.getPrecioPromocional());
        System.out.println("Artículos en la promoción:");
        for (Articulo articulo : promocion.getArticulos()) {
            System.out.println("- " + articulo.getDenominacion() + " ($" + articulo.getPrecioVenta() + ")");
        }
        System.out.println();
    }

    // Metodo para mostrar detalles de un artículo
    public static void mostrarArticulo(Articulo articulo) {
        System.out.println("Artículo: " + articulo.getDenominacion() + " ($" + articulo.getPrecioVenta() + ")");
    }

    // Metodo para obtener la promoción más económica
    public static Promocion obtenerPromocionMasEconomica(Promocion... promociones) {
        Promocion promoMasEconomica = promociones[0];
        for (Promocion promo : promociones) {
            if (promo.getPrecioPromocional() < promoMasEconomica.getPrecioPromocional()) {
                promoMasEconomica = promo;
            }
        }
        return promoMasEconomica;
    }
}
