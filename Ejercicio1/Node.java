package Ejercicio1;

public class Node<T> {
	private T dato;
    private Node<T> next;

    public Node(T dato, Node<T> next) {
        this.dato = dato;
        this.next = next;
    }

    public Node(T dato) {
        this.dato = dato;
    }
    
    public Node() {
        
    }

    public T getDato() {
        return dato;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
