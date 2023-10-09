public class Articulo {
    private String nombre;
    private String descripcion;
    private float precio;
    private float peso;

    //inicializa
    public Articulo(String nombre, String descripcion, float precio, float peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.peso = peso;
    }

    // todos los gets:

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public float getPrecio() {
        return this.precio;
    }
    public float getPeso() {
        return this.peso;
    }

    //todos los set:

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    // toString??
    public String toString() {
        return "Articulo " + this.nombre + " " + this.descripcion + " " + " Precio: " + this.precio + " Peso: " + this.peso;
    }
}