
/**
 * Esta clse simula el comportamiento de una estuctura de datos pila.
 * 
 * @author arath
 */
public class Pila {
    /* Variable que cuenta el numero de nodos en la pila. */
    int contador = 0;
    
    /* Variable tipo Nodo que apunta al nodo de la cima de la pila. */
    Nodo puntero;

    /**
     * Agregar un nodo a la pila.
     * 
     * @param nodo 
     */
    public void push(Nodo nodo) {
        contador++;
        
        if (puntero == null) {
            puntero = nodo;
        } else {
            nodo.setAbajo(puntero);
            puntero.setArriba(nodo);
            puntero = nodo;
        }
    }
    
    /**
     * Eliminar un nodo de la pila.
     */
    public void pop() {
        if (contador > 0) {
            contador--;
            puntero = puntero.getAbajo();
        }
    }
    
    /**
     * Obtener el valor del ultimo nodo de la pila.
     * @return 
     */
    public String peek() {
        return puntero.getDato();
    }
        
    /*
     * Metodos Getter y Setter
     */
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Nodo getPuntero() {
        return puntero;
    }

    public void setPuntero(Nodo puntero) {
        this.puntero = puntero;
    }
}
