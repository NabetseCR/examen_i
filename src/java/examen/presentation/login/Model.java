package examen.presentation.login;

import examen.logic.Persona;

public class Model {
    Persona current;

    public Model() {
        this.reset();
    }

    public void reset() {
        setCurrent(new Persona());
    }

    public Persona getCurrent() {
        return current;
    }

    public void setCurrent(Persona current) {
        this.current = current;
    }
}
