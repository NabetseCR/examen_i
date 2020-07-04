package examen.presentation.documentos;

import examen.logic.Detalle;
import examen.logic.Documento;
import java.util.ArrayList;

public class Model {

    ArrayList<Documento> documentos;
    ArrayList<Documento> documentosad;
    ArrayList<Detalle> detalles;

    public Model() {
        this.reset();
    }

    public void reset() {
        ArrayList<Documento> rowsD = new ArrayList<>();
        ArrayList<Detalle> rowsT = new ArrayList<>();
        this.setDocumentos(rowsD);
        this.setDocumentosAd(rowsD);
        this.setDetalles(rowsT);
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
    
    public void setDocumentosAd(ArrayList<Documento> documentosad) {
        this.documentosad = documentosad;
    }

    public ArrayList<Documento> getDocumentosAd() {
        return documentosad;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }
    
    
    
    public void addDocumento(Documento documento){
        examen.logic.Model domainModel = examen.logic.Model.instance();
        detalles = domainModel.getDetalles();
        if(!verificar(documento.getId())){
            detalles.add(new Detalle(documento.getId(), documento.getMonto(), documento.getTimbre(), 1));
        }else{
           for(int i = 0; i < detalles.size(); i++){
            if(detalles.get(i).getId().equals(documento.getId())){
                detalles.get(i).setCantidad(detalles.get(i).getCantidad() + 1);
            }
        } 
        }
        documentosad.add(documento);
        domainModel.setDetalles(detalles);
    }
    
    public double getTotal(){
        examen.logic.Model domainModel = examen.logic.Model.instance();
        detalles = domainModel.getDetalles();
        double aux = 0;
        for(int i = 0; i < detalles.size(); i++){
            aux = aux + ((detalles.get(i).getMonto() + detalles.get(i).getTimbre()) * detalles.get(i).getCantidad());
        }
        return aux;
    }
    
    public int getCantidad(String id){
        examen.logic.Model domainModel = examen.logic.Model.instance();
        detalles = domainModel.getDetalles();
        for(int i = 0; i < detalles.size(); i++){
            if(detalles.get(i).getId().equals(id)){
                return detalles.get(i).getCantidad();
            }
    }
        return 0;
    }
    
    public double getMonto(String id){
        examen.logic.Model domainModel = examen.logic.Model.instance();
        detalles = domainModel.getDetalles();
        for(int i = 0; i < detalles.size(); i++){
            if(detalles.get(i).getId().equals(id)){
                return (detalles.get(i).getMonto() + detalles.get(i).getTimbre()) * detalles.get(i).getCantidad();
            }
    }
        return 0;
    }
    
    public boolean verificar(String id){
        examen.logic.Model domainModel = examen.logic.Model.instance();
        detalles = domainModel.getDetalles();
        for(int i = 0; i < detalles.size(); i++){
            if(detalles.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}
