import java.util.Date;

public class Boleta extends DocTributario {

    //INICIALIZACION Y SE LO PASA A DOCTRIBUTARIO
    public Boleta(String numero, String rut, Date fecha,Direccion direccion ,OrdenCompra compra) {
        super(numero, rut, fecha, direccion, compra);
    }

    //Boleta Y SE LO PASA A DOCTRIBUTARIO
    public String toString() {
        return "Boleta " + super.toString();
    }
}