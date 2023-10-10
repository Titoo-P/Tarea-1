import java.util.Date;

public class Pago {
    private OrdenCompra compra;

    private float monto;
    private Date fecha;

    //INICIALIZACION
    public Pago(float monto, Date fecha, OrdenCompra compra) {
        this.monto = monto;
        this.fecha = fecha;
        this.compra = compra;
    }

    //TODOS LOS GET
    public float getMonto() {
        return this.monto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public OrdenCompra getCompra() {
        return this.compra;
    }

    //TODOS LOS SET
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
    }

    //METODO toString
    public String toString() {
        return "Monto: " + this.monto + " Fecha: " + this.fecha.toString();
    }
}