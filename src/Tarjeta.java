import java.util.Date;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion, OrdenCompra compra) {
        super(monto, fecha, compra);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    //TODOS LO SET
    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //TODOS LOS GET
    public String getTipo() {
        return this.tipo;
    }
    public String getNumTransaccion() {
        return this.numTransaccion;
    }

    public String toString() {
        return "Tarjeta: " + this.tipo + " Transaccion: " + this.numTransaccion + " " + super.toString();
    }
}
