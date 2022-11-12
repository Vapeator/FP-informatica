package boletin02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtraAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabras[] = {"java","desarrollo", "aplicaciones", "informaticas"};
		//se puede introducir el numero de palabras que se quiera
		Random opcion = new Random();
			
		int x = opcion.nextInt(palabras.length); 
		//para coger un numero aleatorio entre el 0 y el numero de elementos en el array
		
		String adivinaLaPalabra= palabras[x];
		
		System.out.println(adivinaLaPalabra);
		
			
		String letrasPalabraSecreta []= adivinaLaPalabra.split("");
		
		boolean finJuego= false;
		
		int intentos=5;
		
		int letrasEnPalabra=letrasPalabraSecreta.length;
		
		for(int i = 0; i<letrasPalabraSecreta.length;i++) {
			
			letrasPalabraSecreta[i]= "_";
					
		}
		
		
		
		Scanner lector = new Scanner (System.in);
		
				
		
		do {
			System.out.println("Te quedan "+ intentos + " intentos");
			
			System.out.println(Arrays.toString(letrasPalabraSecreta));
			
			System.out.println("Introduce una letra");
			
			char letra= lector.next().charAt(0); //xq solo interesa una letra introducida
			
			boolean letraAcertada=false;
			
			//boolean hayGuiones=true;
			
			for (int j=0; j<adivinaLaPalabra.length();j++) {
				
				if(adivinaLaPalabra.charAt(j)==letra) {
					
					letrasPalabraSecreta[j]= Character.toString(letra);
					letraAcertada= true;
					letrasEnPalabra--;
				} 
				
				
				
			}
			
			if(letraAcertada==false) {
				intentos--;
				System.out.println("No has acertado la letra, te quedan "+ intentos + " intentos");
				
			} if  (intentos==0) {
				System.out.println("Has agotado todos los intentos");
				finJuego=true;
			} 
			
					

			
			
			if(letrasEnPalabra==0 ) {
				
				finJuego=true;
				
				System.out.println("Enhorabuena, has ganado!");	
				
				System.out.println("La palabra es: " + adivinaLaPalabra);
				
			}
			
		} while(finJuego==false);
		
		
		
		
		
	}

}
