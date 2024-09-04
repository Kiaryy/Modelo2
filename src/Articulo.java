import java.util.HashSet;
import java.util.Set;

public class Articulo {

    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedida;
    private Imagen imagen;
    private Set<Promocion> promociones;

    // Constructor
    public Articulo(Long id, String denominacion, Double precioVenta, Double precioCompra,
                    Integer stockActual, Integer stockMaximo, UnidadMedida unidadMedida) {
        this.id = id;
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.unidadMedida = unidadMedida;
        this.promociones = new HashSet<>();
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Imagen getImagen() {
        return imagen;
    }

    // Métodos
    public void restock(Integer quantity) {
        this.stockActual += quantity;
    }

    public void addPromocion(Promocion promocion) { // Asociar a una promoción
        if (this.promociones.add(promocion)) { // add retorna True si el elemento aún no está presente
            promocion.addArticulo(this); // Establece relación bidireccional
        }
    }

    public void removePromocion(Promocion promocion) { // Remover asociacion a una promoción
        if (this.promociones.remove(promocion)) {
            promocion.removeArticulo(this); // Actualiza la relación
        }
    }
}
