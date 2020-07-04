package examen.logic;

import java.util.ArrayList;


public class Tipos {
    String codigo;
    String descripcion;
    ArrayList<Documento> elementos;

    public Tipos() {
    }

    public Tipos(String codigo, String descripcion, ArrayList<Documento> elementos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.elementos = elementos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Documento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Documento> elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return "Tipos{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", elementos=" + elementos + '}';
    }
    
    
}
