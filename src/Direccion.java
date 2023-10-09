public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    //TODOS LOS GET
    public String getDireccion() {
        return this.direccion;
    }
    // todos los set
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // El toString
    public String toString() {
        return "Direccion: " + this.direccion;
    }
}
