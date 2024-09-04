public class UnidadMedida {

    private Long id;
    private String denominacion;
    private Articulo articulo;

    // Constructor
    public UnidadMedida(Long id, String denominacion) {
        this.id = id;
        this.denominacion = denominacion;
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

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
