public class Imagen {

    private Long id;
    private String denominacion;
    private Promocion promocion;

    // Constructor
    public Imagen(Long id, String denominacion) {
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

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
}
