import java.util.Date;

public class Main {


    public static void main(String[] args) {



        final Direccion dir1 = new Direccion("Direccion F");
        final Direccion dir2 = new Direccion("Calle xyz #987");
        final Direccion dir3 = new Direccion("Calle dolar #666");

        final Cliente cl1 = new Cliente("cl1", "11.111.111-1", dir1);
        final Cliente cl2 = new Cliente("cl2", "22.222.222-2", dir2);
        final Cliente cl3 = new Cliente("cl3", "33.333.333-3", dir3);

        final Articulo test1 = new Articulo("test1", "Articulo test 1", 1000, 2f);
        final Articulo test2 = new Articulo("test2", "Articulo test 2", 2000, 3.5f);
        final Articulo test3 = new Articulo("test3", "Articulo test 3", 3000, 10);

        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString());
        System.out.println();

        System.out.println("Articulos:");
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
        System.out.println();

        final String nivel_1 = "iniciando";
        final String nivel_2 = "pagando";
        final String ESTADO_PAGADO = "Finalizado";

        final OrdenCompra Orden01 = new OrdenCompra(new Date(), nivel_1, cl1);
        cl1.addCompra(Orden01);
    }
}





