import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[]= new int [20];
		
		
		Random aleatorio= new Random();
		
		int i=0;

		while (i<20) {
			
			matriz [i] = aleatorio.nextInt(50);
			
			i++;
				
		}
		
		System.out.println("Matriz generada");
		
		for (int posicion=0; posicion<matriz.length; posicion++) {
			
			System.out.print(matriz[posicion] + " ");
		}
		
	//Calcular la suma: matriz[0] + matriz[1]+ matriz[2]...
	
		System.out.println();
		
	int suma=0;	
	for (int k=0;k<matriz.length;k++) {
		suma=suma+matriz[k];
		//tb podria ser suma+=matriz[k]
		
	}
	
	System.out.println("La suma es "+ suma);	
	
//calcular la suma de los numeros impares
	
	int sumaImpares=0;
	
	//for each, recorre la posicion desde la cero a la ultima
	//por cada valor copia en matriz
	for(int copia:matriz ) {
		if(copia %2!=0) {
			
			sumaImpares=sumaImpares+copia;
		}
	}
	System.out.println();
	System.out.println("Suma impares " + sumaImpares);
	
}
}