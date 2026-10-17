package ejercicio315;

import java.util.Scanner;

public class PruebaFC {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====Paciente=====");
        System.out.println();
        System.out.println("Nombre");
        String nombre= sc.nextLine();
        System.out.println("Apellido");
        String apellido= sc.nextLine();
        System.out.println("Año");
        int anio= sc.nextInt();
        System.out.println("Mes");
        int mes= sc.nextInt();
        System.out.println("Dia");
        int dia= sc.nextInt();




        FrecuenciasCardiacas f1 = new FrecuenciasCardiacas(nombre,apellido,anio,mes,dia);

        f1.fechaOrden(anio,mes,dia);

        System.out.println("Informacion Paciente '"+f1.getNombre()+"'");
        System.out.println();
        System.out.println("Apellido:"+f1.getApellido());

        System.out.println("Fecha de nacimiento: "+f1.getFecha());
        System.out.println("Edad: "+f1.calcularEdad(anio));

        System.out.println();
        System.out.println("Frecuencia Max:" + f1.frecuenciaMax(f1.calcularEdad(anio)));
        System.out.println("Frecuencia esperada: "+f1.frecuenciaEsperada(f1.frecuenciaMax(f1.calcularEdad(anio))));


    }
}
