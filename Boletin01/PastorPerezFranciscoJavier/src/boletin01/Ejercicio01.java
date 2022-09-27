package boletin01;

//importamos de la biblioteca de java

import java.util.*;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ejercicio 1
		//primero declaramos la matriz, la creamos con double porque al
		//haber raices cuadradas va a dar un double
		
		double [] matriz= new double[10];
//a.	
		//creamos el random, para ello importamos al principio
		//
		
		int x = (int)(Math.random()*10+1);
		
		matriz[0]=x;
		
		
		System.out.println("Valor positicion 0 es "+ matriz[0]);
		
//b.
		
		matriz[1]= matriz[0]+20;
		System.out.println("Valor posicion 1 es: "+ matriz[1]);
		
//c.
		
		double c= Math.pow(matriz[0],3) + Math.pow(matriz[1],2);
		
		
		matriz[2]= Math.sqrt(c);
		
		System.out.println("Valor posicion 2 es: "+ matriz[2]);
		
//d.
		double d= matriz[0]+ matriz [1] + matriz [2];
		
		matriz [3]= d/3;
		
		System.out.println("Valor posicion 3 es: "+ matriz[3]);	
		
//e. Para poder utilizar JOptionPane, hay que importarlo también
		
		matriz [4]= Double.parseDouble (JOptionPane.showInputDialog("Introduzca un numero"));
		
		System.out.println("Valor posicion 4 es: "+ matriz[4]);
		
//f.
		matriz [5]= 5;
		matriz [6]= 6;
		matriz [7]= 7;
		matriz [8]= 8;
		matriz [9]= 9;
		
		
//g.
		double copia []= Arrays.copyOf(matriz, matriz.length);
		
//h.
		Arrays.sort(copia);
		
		System.out.println ("La matriz queda de la siguiente manera: "+ Arrays.toString(matriz));	
		System.out.println ("La copia queda de la siguiente manera: "+ Arrays.toString(copia));	
		
//i.
		double ValorBuscado=matriz[0];
		
		int posicion = Arrays.binarySearch(matriz, ValorBuscado);
		
		int posicioncopia = Arrays.binarySearch(copia, ValorBuscado);
		
		System.out.println("la posicion en el original es : "+posicion);
		
		System.out.println("la posicion en el original es : "+posicioncopia);
	}

}
