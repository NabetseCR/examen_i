package examen.logic;


public class Detalle {
    String id;
    double monto;
    double timbre;
    int cantidad;

    public Detalle() {
    }

    public Detalle(String id, double monto, double timbre, int cantidad) {
        this.id = id;
        this.monto = monto;
        this.timbre = timbre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTimbre() {
        return timbre;
    }

    public void setTimbre(double timbre) {
        this.timbre = timbre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
