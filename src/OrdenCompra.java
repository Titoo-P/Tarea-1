import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {

    private DocTributario doc;
    private final ArrayList<Pago> pagos;
    private final ArrayList<DetalleOrden> ordenes;

    private Cliente cliente;
    private String estado;
    private Date fecha;


    // INICIALIZA
    public OrdenCompra(Date fecha, String estado, Cliente cliente) {
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.doc = null;
        this.pagos = new ArrayList<>();
        this.ordenes = new ArrayList<>();
    }


    // add metodos. (Recibi ayuda externa en esta parte)
    public void addPago(Pago pago) {
        this.pagos.add(pago);
    }
    public void addDetalleOrden(Articulo articulo, int cantidad) {
        this.ordenes.add(new DetalleOrden(articulo, cantidad, this));
    }


    //TODOS LOS GET
    public Date getFecha() {
        return this.fecha;
    }
    public String getEstado() {
        return this.estado;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public DocTributario getDoc() {
        return this.doc;
    }
    public Pago getPago(int indice) {
        if (indice < 0 || indice > this.pagos.size() - 1) return null;
        return this.pagos.get(indice);
    }
    public DetalleOrden getOrden(int indice) {
        if (indice < 0 || indice > this.ordenes.size() - 1) return null;
        return this.ordenes.get(indice);
    }

    //TODOS LOS SET
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setDoc(DocTributario doc) {
        this.doc = doc;
    }


    // METODOS DEL UML OBLIGATORIOS
    public float calcPrecioSinIVA() {
        float price = 0;
        for (DetalleOrden orden : this.ordenes) {
            price = price + orden.calcPrecioSinIVA();
        }
        return price;
    }
    public float calcIVA() {
        float iva = 0;
        for (DetalleOrden orden : this.ordenes) {
            iva = iva +orden.calcIVA();
        }
        return iva;
    }
    public float calcPrecio() {
        return this.calcPrecioSinIVA() + this.calcIVA();
    }
    public float calcPeso() {
        float peso = 0;
        for (DetalleOrden orden : this.ordenes) {
            peso += orden.calcPeso();
        }
        return peso;
    }

    public String toString() {
        return "OrdenCompra " + this.fecha + " Estado: " + this.estado + " Precio: " + this.calcPrecio() + " " + this.calcPeso() + "kg";
    }
}
