package dia28Septiembre;

import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner esta en java.util
		
		Scanner lector = new Scanner (System.in);
		float nota;
		String curso;
//para leer un float
		System.out.println("Introduzca la nota del alumno:");
		nota = lector.nextFloat();
		//ponemos la nota abajo en la consola
		
		System.out.println("La nota introducida es: "+nota);
//para leer Strings
		curso = lector.next();
		System.out.println("El curso es: "+curso);
	

		//si usamos un . revienta
		
		
	}
	

}
