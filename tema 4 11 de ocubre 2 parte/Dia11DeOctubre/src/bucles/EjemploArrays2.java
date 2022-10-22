package bucles;

import java.util.Arrays;
import java.util.Random;

public class EjemploArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temperaturas[] = new float[20];
		float suma = 0, media = 0;
		
		
		for (int i=0; i<temperaturas.length; i++) {
			
			Random aleatorio = new Random();
			temperaturas [i]= aleatorio.nextInt(40) + aleatorio.nextFloat();
			//sumamos el nextFloat xq nos da valores entre 0 y 1, entonces asi tenemos el decimal
			
		}//cerramos el for
		
		//calcular la temperatura media
		
		for (int i= 0;i<temperaturas.length;i++) {
			suma = suma + temperaturas[i];
			//asi se va actualizando la suma con las temperaturas y sumando lo que valia suma antes al nuevo valor
			
			//es igual a poner suma+= temperaturas[i]
			
		}
		
		media = suma/temperaturas.length;
		System.out.println(Arrays.toString(temperaturas));
		System.out.println("La temperatura media es de " + media);
	//for each para leer variables estaticas
		//contar cuantas veces se supero la temperatura media
		
		int contador = 0;
		
		//for(int i=0; i<temperaturas.length; i++) { normalmente lo hariamos asi
		for (float valor: temperaturas) {	// los : es como un "en"	
			if (valor>media) {
				contador++;
			}
		}
		
		
		System.out.println(contador);
	
	}

}
