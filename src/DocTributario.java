import java.util.Date;

public class DocTributario {

    private OrdenCompra compra;
    private Direccion direccion;

    private String numero;
    private String rut;
    private Date fecha;


    // Metodo de Inicizalizacion
    public DocTributario(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra compra) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.compra = compra;
        this.direccion = direccion;

    }

    //TODOS LOS GET
    public Direccion getDireccion() {
        return this.direccion;
    }
    public String getNumero() {
        return this.numero;
    }
    public OrdenCompra getCompra() {
        return this.compra;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public String getRut() {
        return this.rut;
    }

    //TODOS LOS SET
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }


    // Metodo toString pedido por el profesor
    public String toString() {
        return "Numero: " + this.numero + " Rut: " + this.rut + " Fecha: " + this.fecha.toString(); // no se agrega compra ni direccion, no son necesarios
    }
}