package pruebas;

import java.util.Scanner;

import javax.swing.JOptionPane;

import BloqueEjercicios2.MTDCadenas;

public class PrincipalBloque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = false;
		int opcion;

		do {

			System.out.println("Seleccione una opción:");
			System.out.println("Selecciona del 1 al 5 para cada uno de los apartados ");
			System.out.println("Utiliza el 6 para cerrar el programa");
			Scanner apartado = new Scanner(System.in);
			opcion = apartado.nextInt();
			switch (opcion) {

			case 1:

				String numDNI = "";

				System.out.println("La letra de tu DNI es: " + MTDCadenas.dni(numDNI));

				break;

			// String texto=JOptionPane.showInputDialog("Introduzca un texto");

			case 2:

				char caracterBuscado = 'c';

				System.out.println(MTDCadenas.guiones(caracterBuscado));

				break;

			case 3:

				String frase = "casas casas casas";

				char carac[] = { 'c', 'a' };

				System.out.println(MTDCadenas.guiones(frase, carac));

				break;

			case 4:

				String contraseña = "MonteCastelo1";

				System.out.println("El formato es valido? " + MTDCadenas.formato(contraseña));

				break;

			case 5:

				String frase2 = "programacion de metodos informaticos";

				MTDCadenas.sustituir(frase2);

				break;

			case 6:

				System.out.println("Saliendo del programa");
				salir = true;

				break;
			}

		} while (salir == false);

	}

}
