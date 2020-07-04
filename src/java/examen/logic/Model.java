package examen.logic;

import java.util.ArrayList;

public class Model {
    
    ArrayList<Persona> personas;
    ArrayList<Documento> documentos;
    ArrayList<Detalle> detalles;
    
    private static Model uniqueInstance;

    public static Model instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }
    
    private Model(){
        personas = new ArrayList();
        
        personas.add(new Persona("miguel@mail.com", "Miguel Ojeda", "Heredia", "111"));
        personas.add(new Persona("marta@mail.com", "Marta Perez", "Alajuela", "222"));
        
        documentos = new ArrayList();
        
        // De tipo 001-Personas Juridicas
        documentos.add( new Documento("001", "Afectacion", 2785, 315, "001", "Personas Juridicas"));
        documentos.add( new Documento("002", "Cedula Juridica", 2785, 315, "001", "Personas Juridicas"));
        documentos.add( new Documento("003", "Historica de Movimientos", 2785, 315, "001", "Personas Juridicas"));

        // De tipo 002-Bienes Inmuebles
        documentos.add( new Documento("004", "Historica de Propiedades", 2515, 115, "002", "Bienes Inmuebles"));
        documentos.add( new Documento("005", "Literal de Inmuebles", 2785, 315, "002", "Bienes Inmuebles"));
        documentos.add( new Documento("006", "Indice de Personas", 2515, 115, "002", "Bienes Inmuebles"));

                
        // De tipo 005-Placas
        documentos.add( new Documento("007", "Solicitud de Placas de Motos y remolques", 10900, 0, "005", "Placas"));
        documentos.add( new Documento("008", "Solicitud de Placas de Vehículo", 17600, 0, "005", "Placas"));
    
        detalles = new ArrayList();
    }
    
    public Persona personaFind(String correo, String contrasenna) throws Exception {
        Persona aux = null;
        for (int i = 0; i < this.personas.size(); i++) {
            if (personas.get(i).getCorreo().equals(correo) && personas.get(i).getContrasenna().equals(contrasenna)) {
                aux = personas.get(i);
            }
        }
        if (aux != null) {
            return aux;
        } else {
            throw new Exception("Persona no existe");
        }
    }
    
    public ArrayList<Documento> documentosFindbyTipo(String codigo){
        ArrayList aux = new ArrayList();
        for (int i = 0; i < this.documentos.size(); i++) {
            if (documentos.get(i).idTipo.equals(codigo)) {
                aux.add(documentos.get(i));
            }
        }
        return aux;
    }
    
    public Documento documentoFindbyId(String id){
        Documento aux = null;
        for (int i = 0; i < this.documentos.size(); i++) {
            if (documentos.get(i).getId().equals(id)) {
                aux = documentos.get(i);
            }
        }
        return aux;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
