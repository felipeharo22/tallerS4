package ejercicio314;

import java.util.Scanner;

public class PruebaFecha {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("===== Capacidades =====");
       System.out.println("Cambiar día, mes, año\n");
       // 1. Pides los datos al usuario
       System.out.print("Año nuevo: ");
       int anio = sc.nextInt();

       System.out.print("Mes nuevo: ");
       int mes = sc.nextInt();

       System.out.print("Día nuevo: ");
       int dia = sc.nextInt();



        Fecha f1= new Fecha(mes,dia,anio);
       System.out.println();





       // 2. Le pasas los datos a la clase
       f1.actualizarFecha(anio, mes, dia);

       // 3. Muestras el resultado
       System.out.println("\nNuevas fechas:");
       f1.mostrarFecha();

       sc.close();

    }
}
