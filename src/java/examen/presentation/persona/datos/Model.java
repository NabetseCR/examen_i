package examen.presentation.persona.datos;

import examen.logic.Persona;

public class Model {

    Persona current;

    public Model() {
        this.current = new Persona();
    }

    public Persona getCurrent() {
        return current;
    }

    public void setCurrent(Persona current) {
        this.current = current;
    }

}
