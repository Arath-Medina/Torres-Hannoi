
/**
 * Esta clase simula el comportamiento de un nodo de la pila.
 * 
 * @author arath
 */
public class Nodo {
    
    String dato;
    Nodo arriba;
    Nodo abajo;

    /*
     * Metodos Getter y Setter
     */
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }
}
