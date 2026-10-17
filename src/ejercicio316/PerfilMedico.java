package ejercicio316;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private int anio;
    private int mes;
    private int dia;

    private double altura;
    private double peso;

    private String fecha;

    public PerfilMedico(String nombre, String apellido, String sexo, int anio, int mes, int dia, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.altura = altura;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METODOSSSSS

    public void fechaOrden (int anio, int mes, int dia){

        this.fecha=(anio+"/"+mes+"/"+dia);

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

    public double imc (double peso, double altura){

        return altura/Math.pow(peso,2);


    }

    public String getFecha() {
        return fecha;
    }
}
