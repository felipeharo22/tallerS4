package ejercicio313;

import java.util.Scanner;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado [] empleados=new Empleado[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Nombre empleado "+(i+1));
            String nombre = sc.nextLine();
            System.out.println("Apellido empleado "+(i+1));
            String apellido = sc.nextLine();
            System.out.println("Salario "+(i+1));
            Double salario = sc.nextDouble();

            sc.nextLine();

            empleados[i]=new Empleado(nombre,salario,apellido);




            
        }

        for (int i = 0; i < 2; i++) {

            System.out.println("====INFORMACION EMPLEADO #"+(i+1)+"====");
            System.out.println("Nombre: "+ empleados[i].getPrimerNombre());
            System.out.println("Apellido: "+ empleados[i].getApellidoPaterno());
            System.out.println("Salario Mensual: "+ empleados[i].getSalarioMes());

        }
        System.out.println();
        System.out.println("Aumento salario mensual Empleado 1\nCuanto % desea aumentar?");
        Double porcentaje = sc.nextDouble();
        empleados[0].aumento(porcentaje);
        System.out.println("Salario mensual actual con aumento de "+porcentaje+"% :  "+empleados[0].getSalarioMes()+"\nSalario Anual calculado: "+12*(empleados[0].getSalarioMes()));

        System.out.println();
        System.out.println();
        System.out.println("Aumento salario mensual Empleado 2\nCuanto % desea aumentar?");
        Double porcentaje2 = sc.nextDouble();
        empleados[1].aumento(porcentaje2);
        System.out.println("Salario actual con aumento de "+ porcentaje2 +"% :  "+empleados[1].getSalarioMes()+"\nSalario Anual calculado: "+12*(empleados[1].getSalarioMes()));
        System.out.println();
        System.out.println("Numero de empleados:"+Empleado.contadorEmpleados);

    }
}
