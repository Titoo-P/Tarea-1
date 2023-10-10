import java.util.ArrayList;

public class Cliente {

    private final ArrayList<OrdenCompra> compras;

    private String nombre;
    private Direccion direccion;
    private String rut;

    // INICIALIZACION
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.compras = new ArrayList<>();
    }


    // TODOS LOS GET
    public OrdenCompra getCompra(int indice) {
        if (indice < 0 || indice > this.compras.size() - 1) return null;
        return this.compras.get(indice);
    }
    public String getRut() {
        return this.rut;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public String getNombre() {
        return this.nombre;
    }

    // TODOS LOS SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Metodos add
    public void addCompra(OrdenCompra compra) {
        this.compras.add(compra);
    }

    // Metodo toString
    public String toString() {
        return "Cliente " + this.nombre + " Rut: " + this.rut + " " + this.direccion.toString();
    }
}
