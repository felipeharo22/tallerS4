package ejercicio315;

public class FrecuenciasCardiacas {


    private String nombre;
    private String apellido;
    private int anio;
    private int mes;
    private int dia;
    private String fecha;



    public FrecuenciasCardiacas(String nombre, String apellido, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public void fechaOrden (int anio, int mes, int dia){

        this.fecha=(anio+"/"+mes+"/"+dia);

    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    public int calcularEdad(int anio){


        return 2026-anio;

    }

    public int frecuenciaMax (int edad){


        return 220-edad;

    }

    public double frecuenciaEsperada (int frecuenciaMax){

        return (frecuenciaMax*0.65);
    }

}
