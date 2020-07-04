package examen.logic;

public class Documento {
    String id;
    String descripcion;
    double monto;
    double timbre;
    String idTipo; 
    String descripcionTipo;

    public Documento() {
    }

    public Documento(String id, String descripcion, double monto, double timbre, String idTipo, String descripcionTipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
        this.timbre = timbre;
        this.idTipo = idTipo;
        this.descripcionTipo = descripcionTipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }
    
    

    @Override
    public String toString() {
        return "Documento{" + "id=" + id + ", descripcion=" + descripcion + ", monto=" + monto + ", timbre=" + timbre + '}';
    }
    
    
}
