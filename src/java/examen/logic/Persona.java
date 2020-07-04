package examen.logic;

public class Persona {
    String correo;
    String nombre;
    String direccion;
    String contrasenna;

    public Persona() {
    }

    public Persona(String correo, String nombre, String direccion, String contrasenna) {
        this.correo = correo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasenna = contrasenna;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    @Override
    public String toString() {
        return "Persona{" + "correo=" + correo + ", nombre=" + nombre + ", direccion=" + direccion + ", contrasenna=" + contrasenna + '}';
    }
    
    
}
