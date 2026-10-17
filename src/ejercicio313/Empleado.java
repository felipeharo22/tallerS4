package ejercicio313;

import jdk.dynalink.beans.StaticClass;

public class Empleado {

   private String primerNombre;
   private String apellidoPaterno;
   private Double salarioMes;
   public static int contadorEmpleados;

    public Empleado(String primerNombre, Double salarioMes, String apellidoPaterno) {
        this.primerNombre = primerNombre;
        setSalarioMes(salarioMes);
        this.apellidoPaterno = apellidoPaterno;
        contadorEmpleados+=1;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public Double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(Double salarioMes) {

        if (salarioMes<0){
            this.salarioMes=0.0;
        }
        else {
            this.salarioMes = salarioMes;
        }


    }

    public void aumento (Double porcentaje){

        this.salarioMes=this.salarioMes+(this.salarioMes*(porcentaje/100));

    }

}
