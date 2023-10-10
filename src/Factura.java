import java.util.Date;

public class Factura extends DocTributario {

    //INICIALIZACION Y SE LO PASA A DOCTRIBUTARIO
    public Factura(String numero, String rut, Date fecha, OrdenCompra compra , Direccion direccion) {
        super(numero, rut, fecha, direccion, compra);
    }

    //factura Y SE LO PASA A DOCTRIBUTARIO
    public String toString() {
        return "Factura " + super.toString();
    }
}
