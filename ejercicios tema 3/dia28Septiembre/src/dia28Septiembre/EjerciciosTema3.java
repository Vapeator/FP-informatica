package dia28Septiembre;

import java.util.Arrays;

enum Estaciones { OTOÑO , INVIERNO , PRIMAVERA , VERANO };

public class EjerciciosTema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Que la fuerza te acompañe";
		
		System.out.println(cadena. substring (cadena. lastIndexOf (" ") + 1));
		
		System.out.println(cadena. indexOf ("e"));
		
		System.out.println(cadena. charAt (0));
		
		String trozos[]= cadena.split (" ");
		
		System.out.println(Arrays.toString(trozos));
		
		System.out.println(cadena.substring(1, 2));
		
//ejemplos enum
		
		Estaciones e = Estaciones . INVIERNO ;
		System. out .println( e .name());
		System. out .println( e .ordinal());
		//devuelve la posicion en la que se encuentra e, en este caso invierno
		System. out .println( Estaciones . values ()[0]);
		System. out .println( Estaciones . values ()[1]);
		System. out .println( Estaciones . values ()[2]);
				
//ejemplos wrappers
		
		int x =900;
		String cadena0 = "234" ;
		int numero = Integer. parseInt ( cadena0 );
		String cadena2 = "3.1416" ;
		double numero2 = Double. parseDouble ( cadena2 );
		// en los strings esta guardado como texto, pero con el parse
		//hacemos que lo devuelva como numero
		System.out.println(numero);
		System.out.println(numero2);
		
		
	}

}
