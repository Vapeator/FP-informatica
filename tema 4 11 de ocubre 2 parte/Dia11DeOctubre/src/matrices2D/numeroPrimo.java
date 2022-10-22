package matrices2D;

import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realizar un programa que indique si un número es primo o no. Un número es primo
//cuando sólo tiene 2 divisores : el 1 y el mismo número.
		
		int x;
		int contador=0;
		
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		
		x = numero.nextInt();
		
		for ( int i= 1;i <= x; i++)	{
			if( x %i==0){
				contador ++;
				
			}
			
			}
			if( contador <=2) {
				System.out.println("El numero es primo");
		} else 	{
			System.out.println("El numero no es primo");
		}
		
			
//3. Diseñar un programa que calcule el menor de 4 números.
			
			int matriz[]= {4, 2 , 7 , 9,0,0,0,0,0,0};
			int menor= matriz[0];
			
			for(int i = 0; i<matriz.length;i++) {
				if(menor>matriz[i]) {
					menor = matriz[i];
				}
			}
			System.out.println("El menor es "+ menor);
			
			
//Realizar un programa que encuentre las posiciones de un array en las que hay ceros.
			
			for (int i=0; i<matriz. length;i++) {
				if(matriz[i]==0) {
					
					System.out.print(i+ " , ");
				}
			}
	}

}
