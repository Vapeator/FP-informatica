package bucles;

public class EjemploStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejemplos con Strings.
		//Buscar todas las posiciones en las que aparece un caracter en un String
		
		String palabra ="Elefante";
		String caracter="e";
		
		System.out.println(caracter + " está en las posiciones");
		
		for (int i=0; i<palabra.length();i++) {
			
			if (palabra.substring(i, i+1).equalsIgnoreCase(caracter) )	{//si el caracter en la posicion i es igual al caracter buscado
				System.out.println(i + " "); //devuelve la posicion i
			}
			
	
			
		}
		
		
	}

}
