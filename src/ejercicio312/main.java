package ejercicio312;

import java.util.Scanner;

public class main {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Numero de pieza");
       String numPieza=sc.nextLine();
       System.out.println("Descripcion de pieza");
       String descPieza=sc.nextLine();
       System.out.println("Cantidad");
       int cantidad=sc.nextInt();
       System.out.println("Precio");
       double precio=sc.nextDouble();
       sc.nextLine();

       factura f1 = new factura(numPieza,descPieza,cantidad,precio);
       System.out.println("=====FACTURA 1=====");
       System.out.println("Pieza: " + f1.getNumPieza());
       System.out.println("Descripción: " + f1.getDescPieza());
       System.out.println("Cantidad: " + f1.getCantidad());
       System.out.println("Precio unitario: $" + f1.getPrecio());
       System.out.println("Monto total: $" + f1.obtenerMontoFactura());

       System.out.println("Numero de pieza");
        numPieza=sc.nextLine();
       System.out.println("Descripcion de pieza");
        descPieza=sc.nextLine();
       System.out.println("Cantidad");
        cantidad=sc.nextInt();
       System.out.println("Precio");
        precio=sc.nextDouble();

       factura f2 = new factura(numPieza,descPieza,cantidad,precio);
       System.out.println("=====FACTURA 1=====");
       System.out.println("Pieza: " + f2.getNumPieza());
       System.out.println("Descripción: " + f2.getDescPieza());
       System.out.println("Cantidad: " + f2.getCantidad());
       System.out.println("Precio unitario: $" + f2.getPrecio());
       System.out.println("Monto total: $" + f2.obtenerMontoFactura());


   }
}
