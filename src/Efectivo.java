import java.util.Date;

public class Efectivo extends Pago {

    //Inicializacion con OrdenCompra
    public Efectivo(float monto, Date fecha,OrdenCompra compra) {
        super(monto, fecha, compra);
    }


    public float calcDevolucion() {
        return this.getMonto();
    }

    public String toString() {
        return "Efectivo " + super.toString();
    }

}