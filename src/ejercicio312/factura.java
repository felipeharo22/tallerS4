package ejercicio312;

public class factura {
    private String numPieza;
    private String descPieza;
    private int cantidad;
    private double precio;

    public factura(String numPieza, String descPieza, int cantidad, double precio) {
        this.numPieza = numPieza;
        this.descPieza = descPieza;
        setCantidad(cantidad);
        setPrecio(precio);

    }


    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public void setDescPieza(String descPieza) {
        this.descPieza = descPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad<0){
            this.cantidad=0;
        }
        else {
            this.cantidad = cantidad;
        }

    }

    public void setPrecio(double precio) {

        if (precio<0){
            this.precio = 0;
        }
        else {
            this.precio = precio;
        }
    }



    public String getNumPieza() {
        return numPieza;
    }

    public String getDescPieza() {
        return descPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double obtenerMontoFactura(){
        double monto = cantidad*precio;
        return monto;
    }
}
