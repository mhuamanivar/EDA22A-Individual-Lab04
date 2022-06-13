package Ejercicio1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


import com.panayotis.gnuplot.JavaPlot;

public class Principal {

	public static void main(String[] args) throws IOException {
		int tamano;        
		Scanner teclado = new Scanner(System.in);
	    System.out.print( "Introduzca el tamaño máximo de la última lista enlazada: " );
	    tamano = teclado.nextInt();
	    
	    
	    ArrayList<Lista_enlazada<Integer>> casos = new ArrayList<Lista_enlazada<Integer>>();        
	    String archivoInsercion = "insercion_propuesto1.txt";
	    PrintWriter oS = new PrintWriter(archivoInsercion); 
	    
	    for(int n = 1; n <= tamano; n++) {
	    	casos.add(generarPeorCaso(n));
	    }
	    
	    Iterator<Lista_enlazada<Integer>> puntero = casos.iterator();
	    
	    while(puntero.hasNext()){      	
	    	oS.println(String.valueOf(insertionSort(puntero.next())));        	
	    }
	    
	    oS.close();
	    System.out.println("Hola");
	    JavaPlot p = new JavaPlot();
		p.addPlot("\"C:/Users/MEL/eclipse-workspace/EDA_Laboratorio04/insercion_propuesto1.txt\" with lines");
		p.plot();
		
	}
	
	public static Lista_enlazada<Integer> generarPeorCaso(int t) {
		Lista_enlazada<Integer> lista = new Lista_enlazada<Integer>();
		for (int i = 0; i < t; i++) {
			lista.add(t-i);
		}
		return lista;		
	}
	
	public static long insertionSort(Lista_enlazada<Integer> A) {
		int key;
		int i;
		
		long nano_startTime = System.nanoTime(); 
		
		for(int j = 1; j < A.size(); j=j+1) {
			key = A.get(j).getDato();
			i = j - 1;
			
			while(i >= 1 && A.get(i).getDato() > key) {
				A.set(i+1, A.get(i).getDato());
				i--;
			}
			A.set(i+1, key);
		}
		
		long nano_endTime = System.nanoTime();
		
		return nano_endTime - nano_startTime;		
	}
}
