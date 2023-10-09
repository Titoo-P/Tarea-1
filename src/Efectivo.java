import java.util.Date;

public class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }

    public float calcDevolucion() {
        return this.getMonto();
    }

    public String toString() {
        return "Efectivo " + super.toString();
    }

}