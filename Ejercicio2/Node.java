package Ejercicio2;

public class Node<T> {
	private T dato;
    private Node<T> next;
    private Node<T> previous;

    public Node(T dato, Node<T> next, Node<T> previous) {
		this.dato = dato;
		this.next = next;
		this.previous = previous;
	}

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

    public Node<T> getPrevious() {
		return previous;
	}

	public void setDato(T dato) {
        this.dato = dato;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

}
