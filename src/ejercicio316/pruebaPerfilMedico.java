package ejercicio316;

import java.util.Scanner;

public class pruebaPerfilMedico {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====Paciente=====");
        System.out.println();
        System.out.println("Nombre");
        String nombre= sc.nextLine();
        System.out.println("Apellido");
        String apellido= sc.nextLine();
        System.out.println("Sexo: ");
        String sexo= sc.nextLine();
        System.out.println("Peso(kg):");
        double peso=sc.nextDouble();
        System.out.println("Altura(cm):");
        double altura=sc.nextDouble();
        System.out.println("Año");
        int anio= sc.nextInt();
        System.out.println("Mes");
        int mes= sc.nextInt();
        System.out.println("Dia");
        int dia= sc.nextInt();

        PerfilMedico p1 = new PerfilMedico(nombre,apellido,sexo,anio,mes,dia,altura,peso);

        p1.fechaOrden(anio,mes,dia);

        System.out.println("Informacion Paciente '"+p1.getNombre()+"'");
        System.out.println();
        System.out.println("Apellido:"+p1.getApellido());
        System.out.println("Sexo:"+p1.getSexo());


        System.out.println("Fecha de nacimiento: "+p1.getFecha());
        System.out.println("Edad: "+p1.calcularEdad(anio));
        System.out.println("Peso:"+p1.getPeso()+" kg");
        System.out.println("Altura: "+p1.getAltura()+" cm");
        System.out.println();
        System.out.println("BMI: "+p1.imc(peso,altura));

        System.out.println();
        System.out.println("Frecuencia Max:" + p1.frecuenciaMax(p1.calcularEdad(anio)));
        System.out.println("Frecuencia esperada: "+p1.frecuenciaEsperada(p1.frecuenciaMax(p1.calcularEdad(anio))));

        System.out.println();
        System.out.println("VALORES DE BMI \nBajo peso: menos de 18.5 \nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9 \nObeso: 30 o más");



    }
}
