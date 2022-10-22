package dia28Septiembre;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wrappers --> variables complejas que permiten añadir
		//funcionalidad a variables simples
		// como: int --> Integer, char -->Character, float -->Float
		//, double-->Double...
		
		//pasar numero a string
		int numero = 3678952;
		
		String numeroString= Integer.toString(numero);
		int digitos = numeroString.length();
		
	
		
		//pasar string a numero
		
		String temperatura = "45.53";
		
		float temperaturaFloat= Float.parseFloat(temperatura);
		System.out.println("Temperatura float: "+temperaturaFloat);
		//int temperaturaInt=Integer.parseInt(temperatura);
		
		System.out.println("Mayor numero de tipo int: "+Integer.MAX_VALUE);
		
		//Character --> isDigit, isLetter permite saber que tipo de caracter
		//esta guardado en una variable tipo char
		
		char caracter= 't';
		boolean digito = Character.isDigit(caracter);
		boolean letra = Character.isLetter(caracter);
		System.out.println("Caracter es digito? "+digito);
		
		//Programa que indica si el ultimo caracter de un String es una Letra-
		
		String dni="09876542W";
		
		char ultimoCaracter= dni.charAt(dni.length()-1);
		boolean lastCaracter= Character.isLetter(ultimoCaracter);
		
			
		//otra forma
		 //boolean lastCaracter2=Character.isLetter(dni.length()-1).charAt(0);
		 
		 System.out.println("Es una letra? "+lastCaracter);
		
		//boolean ultimoCaracter= Character.isLetter(dni.substring(dni.length()-1);
				
				
		
		
		
		
		
		
		
	}

}
