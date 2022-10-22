package boletin02;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Ejercicio 1		
		
	//para el apartado h hago un switch con todo el ejercicio	
		
		int valor;
		int matriz [] = new int [100];
		int i=0;
		Scanner lector= new Scanner(System.in);
		
		for (i=0; i<matriz.length; i++) {
			
			matriz [i]= (int)(Math.random()*100);
			
			
		}
		
		System.out.println(Arrays.toString(matriz));

		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un apartado, del 1 al 8"));	
		
		switch (opcion) {
		
//a.
		case 1:
		
		
		
		int numero;
		
		System.out.println("Introduzca un numero y se devolveran los que sean mayores dentro del array");
				
		numero= lector.nextInt();
		
		
		for (int a=0; a<matriz.length;a++) {
			
		
		if (numero<matriz[a]) {
			
			System.out.print(" " + matriz[a]);
			
		}
		}	
		System.out.println(" ");
		
		break;
//b.
		case 2:
		
		double suma=0; 
				
		double  media;
		
		for (int b =0;b<matriz.length/2;b++) {
			
			suma=suma+matriz[b];
		}
		
		media=suma/(matriz.length/2);
		
		System.out.println("La media es: "+ media);
		
		break;
//c.		
		
		case 3:
		
		int valorBuscado=20;
		int posicion = 0;
		int contador = 0;
		for (int c=0;c<matriz.length;c++) {
			if(matriz[c]> valorBuscado && contador<10) {
				contador++;
				posicion=c;
				
				System.out.println("El numero " + matriz[c] + " es mayor que " + valorBuscado + " y esta en la posicion " + posicion);
			}
			
		}
		
		break;
//d.
		
		case 4:
		
		
		
		System.out.println("Introduce un valor y te doy el primero que sea inferior");
		
		valor = lector.nextInt();
		
		int contador2=0;
		
		for(int d=0;d<matriz.length;d++) {
			
			if (valor>matriz[d] && contador2<1) {
				contador2 ++;
				System.out.println("El primer numero infieror a " + valor + " es " + matriz[d]);
			}
			
		}
		
		break;
		
//e. 
		case 5:
		
		System.out.println("Los numeros primos dentro del array son:");
		
		int f;
		int contador3=0;
		
		for ( f=0;f<matriz.length;f++) {
		
			contador3=0;
			
			for (int e=1;e<=matriz[f];e++) {
								
				if(matriz[f]%e==0) {
					
					contador3++;
				
				}
			
			} 
					
			if (contador3<=2) {
				
				
				System.out.print( +matriz[f] + " ");		
			
		}
	}
		
		break;
//f. 
		case 6:
		
		System.out.println(" ");
		
		 //hago una copia para ordenarla
		
		
		
		int copia[]= Arrays.copyOf(matriz, matriz.length);
		
		Arrays.sort(copia);
		
		System.out.println(Arrays.toString(copia));
			
		int posicion2=0;
		
		for(int g= 0;g<copia.length;g++) {
			
			
			if (g==0) {
				
				posicion2=g;
				
				System.out.println("El numero mas bajo es " +copia[g] +" y esta en la posicion " + posicion2	);
								
				
			}if (g==1) {
				
				posicion2=g;
				
				System.out.println("El segundo numero mas bajo es " +copia[g] +" y esta en la posicion " + posicion2);
				
			}if (g==copia.length-1)  {
				
				posicion2=g;
				
				System.out.println("El numero mas alto es " +copia[g] +" y esta en la posicion " + posicion2);
											
			}if (g==copia.length-2) {
							
					posicion2=g;
				
				System.out.println("El segundo numero mas alto es " +copia[g] +" y esta en la posicion " + posicion2);
				
			}
		}
		
		break;
		
//g. 
		
		case 7:
		
		for(int h=0;h<matriz.length;h++) {
			
			if (matriz[h]%3==0 && matriz[h]%5==0) {
				
				System.out.println("Este numero es multiplo de 3 y 5: " + matriz[h] + " Y en binario se representa con: "+ Integer.toBinaryString(matriz[h]));
			}
			
		}
		
		break;
		
		default:
			
			System.out.println("Error en la opcion introducida");
		
		}
		
	
	}

}
