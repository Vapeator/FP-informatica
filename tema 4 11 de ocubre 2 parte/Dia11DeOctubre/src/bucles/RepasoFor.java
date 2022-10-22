package bucles;

import java.util.Scanner;

public class RepasoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//para saber si un numero es perfecto
		//un numero es perfecto cuando es igual a la suma
		// de sus divisores exceptuando el propio numero
		// ej= 6= 2+3+1 --> perfecto
		// 28 = 14+7+4+2+1
		
		int n, suma = 0;
		boolean error = false; //usamos un boolean para detectar si nos equivocamos
		int contador =0; //para poder poner que puede equivocarse maximo 3 veces
		//try catch es para que no se cierre el programa si cometemos un error
		
		do {//para que pueda volver a introducir numero si se equivoca y mete una letra
			try { //protege la variable, solo podemos meter numeros
			
				error= false;
				Scanner lector= new Scanner (System.in);// el scanner hay que ponerlo dentro del bucle, sinosolo lo podriamos usar una vez, si da error peta
				
				System.out.println("Introduce un numero ");
			
			n = lector.nextInt();
			for (int i = 1; i<= n/2;i++)	{
				if (n %i==0) {
					suma = suma + i; //si tenemos la variable suma sin valor, da error, hay que inicializarla
				}
			}
			System.out.println("La suma de los divisores es " + suma);
			
			if(suma==n) {
				System.out.println("Es perfecto");
			}else {
				System.out.println("No es perfecto");
			}//cierro el else
				
			
			} 
			catch (Exception e) {//si introduzco una letra, nos salta el error por el catch
				System.out.println("Error en el numero introducido");
				error = true;
				contador++;
			}//cierro el catch
			}//cierro la llave del do while
			
		while(error && contador<3);
		
		if (contador == 3) {
			System.out.println("Consumiste tus oportunidades");
		}
	}

}
