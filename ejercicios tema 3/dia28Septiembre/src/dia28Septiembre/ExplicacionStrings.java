package dia28Septiembre;

import java.util.Arrays;

public class ExplicacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		char caracter = 'w';
		//necesita comillas simples, sino me lo identifica como un string
		
		//String empieza con mayus, es una variable compleja
		//ademas de aportar un valor,me permiter realizar funciones
		
		String mensaje ="Hola Caracola"
				+ "";
		String mensaje2= new String ("De una vez!");
		int matriz []= {1,5,4,3,2};
		int tamanho = matriz.length;
		
		//Métodos:
// length() cuenta el nº de caracteres
		
		int numeroCaracteres= mensaje.length();
//si pulsas ctrl+espacio sale el asistente, para poder autocompletar
		
		System.out.println("Nº de caracteres : " + numeroCaracteres);
		//sysout+ctrl espacio autocompleta a system.out...
		//la diferencia entre los dos lengyh es
		
//charAt (indice)--> caracter que ocupa esa posicion
		
		char primeraletra =mensaje.charAt(0);
		
		System.out.println("La primera letra: " + primeraletra);
		
//Programa que obtiene el ultimo caracter de un string:
		
		char ultimo = mensaje.charAt(mensaje.length()-1);
		System.out.println("Ultimo caracter : "+ ultimo);
		
//indexOf (char c) y lastIndexOf (char c)
		
		// Para buscar primera aparicion de la letra a
		
		int posicionLetraA= mensaje.indexOf("a");
		System.out.println("La letra a esta en la posicion: "+posicionLetraA);
		
		int posicionSubString= mensaje.indexOf("ol");
		System.out.println("La subcadena \"ol\" aparece en la posicion: "+ posicionSubString);
		
		int posicionLetra2 = mensaje.indexOf("z");
		
		System.out.println("El caracter z esta en la posicion: " + posicionLetra2);
		
//sobrecarga del IndexOf (String c, int fromIndex)
		//Buscar la segunda aparicion de un caracter
		//asi buscamos a partir de una determinada posicion:
		//int posicion2LetraA= mensaje.indexOf("a",3);	
		
		//asi lo hacemos de una forma mejor
		
		mensaje = "HalaCelta";
		 int posicion2LetraA= mensaje.indexOf("a", mensaje.indexOf("a")+1);
		
	    System.out.println("Posicion segunda A:" + posicion2LetraA);
	
	    
	    //lastIndexOf (ch c) --> devuelve la ultima posicion
	    
	    int ultimaPosicion=mensaje.lastIndexOf("a");
	    
	    System.out.println("La ultima posicion de la a es: "+ultimaPosicion);
	    
	    //subString (int indice)
	    
	    String subCadena = mensaje.substring(2);
	    System.out.println(subCadena);
	    
	    String subCadena2= mensaje.substring(2,5);
	    System.out.println(subCadena2);
	    
	    //Obtener la ultima String
	    
	    mensaje="Obtener la ultima palabra.";
	    
	    String ultimaPalabra= mensaje.substring(mensaje.lastIndexOf(" ")+1);
	    
	    System.out.println(ultimaPalabra);
	    
// split (separador) --> trocea el string original en subcadenas a partir
// de el separador y me devuelve una matriz de strings
	    
	    String trocitos [] = mensaje.split(" ");
	    String segundaPalabra = trocitos [1];
	    	    
	   System.out.println("Palabras "+Arrays.toString(trocitos));
	   //asi imprimimos solo una palabra
	   System.out.println("Palabras "+trocitos[1]);
	    //los signos de puntiacion se tienen en cuenta, hay forma de ignorarlos
	    // nos lo dira mas adelante
// obtener la segunda palabra de un string
	   String primeraPalabra = mensaje.split(" ") [0];
	   String segundaPalabra2 = mensaje.split(" ") [1];
	   System.out.println(segundaPalabra);
	   
	// obtener la primera letra de la segunda palabra de un String
	   
	   String ejemplo="Me gusta Java";
	   char primeraLetraSegundaPalabra = mensaje.split(" ") [1].charAt(0);
	   System.out.println(primeraLetraSegundaPalabra);
	   
	   //replace (char c, char n) -->
	   
	   mensaje= "Hala Celta";
	   mensaje=mensaje.replace('a', 'o');
	   
	   System.out.println("Ejemplo metodo replace: ");
	   //para simular el comportamiento de strings dinamicos: StringBuilder
	   System.out.println(mensaje);
	
	   //concatenar strings
	   
	   String a1="Hola";
	   String a2="Adios";
	   
	   String union= a1+" "+a2;
	   //ponemos " " para añdir un espacio
	   String union2= a1.concat(a2);
	   // siquisieramos añadir en la segunda
	   //String union2= a1.concat(" ".concat(a2));
	   // mas facil String union2=a1.concat(" "+a2);
	System.out.println(union);
	System.out.println(union2);
	
	//startsWith y endsWith devuelve un boolean que nos dice si empieza o no por una letra
		
	boolean condicion = mensaje.startsWith("a") || mensaje.startsWith("A");
	boolean condicion2 = mensaje.endsWith("a") || mensaje.endsWith("A");
	
	System.out.println(condicion);
	
	//equals / equalsIngoreCase
	
	String c1= "Pedro";
	
	String c2= "pedro";
	
	System.out.println("iguales?" +c1.equals(c2));
	
	System.out.println("iguales?" +c1.equalsIgnoreCase(c2));
	
	//Operador ==, puedo pero no debo usarlo
	//el operador compara referencias, no los valores que estan en el string
	//compara si es la misma zona de memoria
	String c3= "Pedro";
	
	String c4= "Pedro";
	
	boolean iguales = c3==c4;
	System.out.println("iguales?" + iguales);
	
	//son dos strings distintos, pero nos devuelve true porque java busca
	//si en memoria hay un string con los mismos caracteres
	
	//podemos utilizar el operador new para darle una nueva zona de memoria
	//String c4= new String ("Pedro");
	
	
	
	
	
	
	
	}

	
}
