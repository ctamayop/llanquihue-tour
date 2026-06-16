package cl.llanquihuetour.model;

/**
 *  Representa un tour turístico
 *  Contiene el nombre del tour, su tipo y el precio.
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;

    /**
     * Constructor vacío
     */
    public Tour() {
    }

    /**
     * Constructor con parámetros
     * @param nombre
     * @param tipo
     * @param precio
     */
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTipo: " + tipo +
                "\nPrecio: $" + precio;
    }
}
