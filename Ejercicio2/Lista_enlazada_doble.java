package Ejercicio2;

public class Lista_enlazada_doble<T> {
	private int tamano = 0;
	private Node<T> raiz;
	
	public void add(T dato) {
		Node<T> n = new Node<T>(dato);
        
        if (tamano == 0) {
            raiz = n;
        }
        else {
        	this.get(tamano-1).setNext(n);
        	n.setPrevious(this.get(tamano-1));
        }
        tamano++;
    }
	
	public Node<T> get(int indice) {
	    Node<T> aux = raiz;
	    for(int i = 0; i < indice; i++) {
	    	aux = aux.getNext();
	    } 
	    return aux;
	}
	
	public void set(int indice, T dato) {
		Node<T> aux = raiz;
		for(int i = 0; i < indice; i++) {
	    	aux = aux.getNext();
	    }
		aux.setDato(dato);
	}

	public int size() {
		return tamano;
	}
	
	@Override
    public String toString() {
        
        Node<T> aux = raiz.getNext();
        String text = "["+aux.getDato();
        aux = aux.getNext();
        
        while (aux != null) {
            text += ", "+aux.getDato().toString();
            aux = aux.getNext();
        }
        
        return text+"]";
    }
}
