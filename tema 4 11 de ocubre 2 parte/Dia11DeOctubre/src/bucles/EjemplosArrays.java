package bucles;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[]= new int[20];
		
		//llenar la primera mitad de las posiciones con valores aleatorios
		//entre 1 y 30
		
		for (int i =0; i< matriz.length/2; i++)	{//declaramos i que sera la posicion de la matriz, la condicion es q sea menor q la mitad del tamaño y si lo es sumanos 1
						
			Random rnd= new Random();
			matriz[i]= rnd.nextInt(31);// el numero q pongamos no lo va a generar, genera el anterior como maximo
						
		}//cerramos bucle for

		System.out.println(Arrays.toString(matriz));
		
		//Algoritmo que busca la posicion de un numero en un array sin necesidad de estar ordenada
		
		int valorBuscado= 8;
		int posicion = -1;
		
		for (int i = 0; i<matriz.length; i++) {
			if(matriz[i]== valorBuscado) {
				posicion = i;
				break;//para salir del bucle de forma precipitada cuendo encuentre el valor
			}
			
		}
			
		if(posicion == -1) {
			
			System.out.println("No esta el numero en la matriz");
			
		} else {
			System.out.println("Esta en la posicion " + posicion);
		}//cerramos else
				
		
		
	}

}
