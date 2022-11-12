package BloqueEjercicios2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MTDCadenas {

	public static String dni(String numero) {

		int divisor = 23;

		numero = JOptionPane.showInputDialog("Escribe los nº de tu DNI");

		int numeroDNI = Integer.parseInt(numero);

		char letrasNIF[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		int resto = numeroDNI % divisor;

		if (resto > 0 && resto <= 22) {

			String letra = Character.toString(letrasNIF[resto]);

			return letra;
		} else {

			return " ";
		}
	}

	public static String guiones(char letra) {

		String frase = JOptionPane.showInputDialog("Introduzca un texto");

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != letra) {

				frase = frase.replace(frase.charAt(i), '-');
				// break;
			}

		}

		return frase;
	}

	public static String guiones(String frase, char... letra) {

		char matriz[] = frase.toCharArray();

		String frase1 = "";

		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			contador = 0;
			for (int j = 0; j < letra.length; j++) {

				if (letra[j] != frase.charAt(i)) {
					contador++;

				}
			}
			if (contador < letra.length) {
				frase1 += matriz[i];
			} else {
				frase1 += '-';
			}

		}

		return frase1;
	}

	public static boolean formato(String palabra) {

		boolean formato = false;

		Pattern patron = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");

		Matcher coincide = patron.matcher(palabra);

		if (coincide.matches()) {

			formato = true;

		}

		return formato;

	}



	public static void sustituir(String frase) {

		// String[] letras=frase.split("");
		char matriz[] = frase.toCharArray();

		for (int i = 0; i < matriz.length; i++) {

			if (frase.charAt(i) == 'i') {

				matriz[i] = '1';
			} else if (matriz[i] == 'o') {
				matriz[i] = '0';
			} else if (matriz[i] == 'a') {
				matriz[i] = '*';
			}

		}
		System.out.println("Como Array");

		System.out.println(Arrays.toString(matriz));

		System.out.println("Como String");

		String respuesta = String.valueOf(matriz);

		System.out.println(respuesta);

		String respuesta2[] = respuesta.split(" ");

		System.out.println(respuesta2.length);

		String code[] = new String[respuesta2.length];

		String binario[] = new String[respuesta2.length];

		for (int j = 0; j < respuesta2.length; j++) {

			code[j] = Integer.toString(respuesta2[j].hashCode());

			binario[j] = Integer.toBinaryString(respuesta2[j].length());

			respuesta2[j] = code[j] + "-" + " " + "-" + respuesta2[j] + "-" + " " + "-" + binario[j];

			
		}

		System.out.println("Como Array");

		System.out.println(Arrays.toString(respuesta2));

		System.out.println("Como String");

		StringBuilder sb = new StringBuilder();

		// Esto lo hice para pasarlo a String, no se si era necesario

		for (String respuestaFinalString : respuesta2) {

			sb.append(Arrays.toString(respuesta2)).append(frase.length());
			System.out.print(respuestaFinalString);

		}

	}

}
