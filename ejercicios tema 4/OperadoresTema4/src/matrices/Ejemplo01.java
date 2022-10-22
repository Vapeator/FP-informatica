package matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[]=new int[100];
		//Hasta ahora para dar valores haciamos asi
		
		matriz [0]= 9;
		matriz [1]=5;
		
		//Guardar valores aleatorios en las posicionesde la 2 a la 100. 
		Random aleatorio = new Random();
		for(int i=2; i<matriz.length;i++) {
			//ponemos matriz.lenght para que se vaya siempre al tamaño de la matriz
			//solo podemos hacer hasta la matriz [99]
			matriz[i]= aleatorio.nextInt(50);
		}
	
		System.out.println(Arrays.toString(matriz));
		
		for (int i=0; i<matriz.length;i++) {
			System.out.print(matriz[i]+ " ");
		}
		//for mejorado sintaxis que me permite recorrer matrices de forma segura, sin preocupoarme por el tamaño de la matriz
		//pero solo para lectura
		
		for (int valor : matriz) {
			
			System.out.print(valor + " ");
			valor = 20;
		}
		System.out.println();
		for (int i=0; i<matriz.length;i++) {
			System.out.print(matriz[i]+ " ");
		
	}

	}
}
