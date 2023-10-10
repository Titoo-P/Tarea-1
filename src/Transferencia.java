import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date fecha, String banco, String numCuenta, OrdenCompra compra) {
        super(monto, fecha, compra);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    // TODOS LOS SET
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    //TODOS LOS GET
    public String getBanco() {
        return banco;
    }
    public String getNumCuenta() {
        return this.numCuenta;
    }

    // METODO toString
    public String toString() {
        return "Transferencia" + " #Cuenta: "+ this.numCuenta + " Banco: " + this.banco  + " " + super.toString();
    }
}

