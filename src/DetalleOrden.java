public class DetalleOrden {


    private OrdenCompra compra; // INICIALIZAMOS AUNQUE NO TENGA NADA LA CLASE OrdenCompra
    private int cantidad;
    private Articulo articulo;

    // INICIALIZACION
    public DetalleOrden(Articulo articulo, int cantidad, OrdenCompra compra) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.compra = compra;
    }

    //TODOS LOS GET
    public Articulo getArticulo() {
        return this.articulo;
    }
    public OrdenCompra getCompra() {
        return this.compra;
    }
    public int getCantidad() {
        return this.cantidad;
    }

    // TODOS LOS SET
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
    }

    // METODOS DEL UML
    public float calcPrecio() {
        return this.calcPrecioSinIVA() + calcIVA();
    }
    public float calcPrecioSinIVA() {
        return this.articulo.getPrecio() * this.cantidad;
    }
    public float calcIVA() {
        return this.calcPrecioSinIVA() * 0.19f;
    }
    public float calcPeso() {
        return this.articulo.getPeso() * this.cantidad;
    }

    // METODO toString
    public String toString() {
        return "Detalle de la Orden " + this.cantidad + "X " + this.articulo.getNombre() + " Precio: " + this.calcPrecio() + " " + this.calcPeso() + "kg";
    }
}
