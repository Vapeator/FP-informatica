package repaso;

import java.util.Random;

public class Matrices2D {

//Metodo que recibe una matriz 2D y la llena de valores
//aleatorios entre 1 y 20

	public static void llenarMatriz(int m[][]) {
		Random aleatorio = new Random();
		int filas = m.length;
		int columnas = m[0].length;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				m[i][j] = aleatorio.nextInt(20);

			}

		}
	}

	public static void printar(int m[][]) {

		int filas = m.length;
		int columnas = m[0].length;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();

		}

	}

//Metodo que reciva una matriz 2D y que escriba un cero en todos los elementos
//de la diagonal principal (si es una matriz cuadrada) si no
//en la primera posicion de cada fila

	public static void modificarMatriz(int m[][]) {
		// verificar si la matriz es cuadrada
		int filas = m.length;
		int columnas = m[0].length;
		if (filas == columnas) {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					if (i == j) {
						m[i][j] = 0;
					} // cierre ultimo if

				} // cierre segundo for

			} // cierre primer for
		} else {
			for (int z = 0; z < filas; z++) {
				m[z][0] = 0;
			}

		}

	}

//Metodo que aquellos elementos que almacenen un numero primo los ponga a cero

	public static boolean isPrimo(int n) {
		boolean primo = true;

		for (int i = 0; i <= n / 2; i++) {

			if (n % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

	public static void eliminarPrimos(int m[][]) {

		int filas = m.length;
		int columnas = m[0].length;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				// comprobar si m[i][j] es primo.de aqui podriamos borrar
				boolean primo = true;
				for (int k = 2; k <= m[i][j] / 2; k++) {

					if (m[i][j] % k == 0) {
					
						primo = false;

						break;// rompe el bucle for
					}
				}

				if (primo) {
					m[i][j] = 0;
				}	//a aqui podriamos usar la funcion isprimo
		/*quedando asi
				if (isPrimo(m[i][j])){
				m[i][j]==0;
				*/
			}
		}
	}// cierre del metodo

//Metodo que busca un valor en una matriz y devuelve la posicion

	public static int[] buscarValor(int matriz[][], int valor) {
//ponemos int [] xq tiene q devolver la fila y la columna, x lo q devuelve 2 valores no uno
//si solo quisieramos uno seria int 
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		int posicion[] = new int[2];
		boolean salidaPrecipitada = false;
		pepe: for (int i = 0; i < filas; i++) {
			salidaPrecipitada = false;

			for (int j = 0; j < columnas; j++) {

				if (matriz[i][j] == valor) {
					posicion[0] = i;
					posicion[1] = j;
					salidaPrecipitada = true;
					break pepe;// para salir de los dos for
				}
			}

		}
		return posicion;
	}

/* otra forma de hacerlo
 * 		int filas = matriz.length;
		int columnas = matriz[0].length;
		int posicion[] = new int[2];
		boolean salidaPrecipitada = false;
		for (int i = 0; i < filas; i++) {
			salidaPrecipitada = false;

			for (int j = 0; j < columnas; j++) {

				if (matriz[i][j] == valor) {
					posicion[0] = i;
					posicion[1] = j;
					salidaPrecipitada = true;
					break;
				}
			}
	if(salidaPrecipitada)	{
		break;
		}
		return posicion;
	}	
 */
	
	/* otra forma mas de hacerlo
	 * 		int filas = matriz.length;
			int columnas = matriz[0].length;
			int posicion[] = new int[2];
			boolean salidaPrecipitada = false;
			outerfor:
			for (int i = 0; i < filas; i++) {
				salidaPrecipitada = false;

				for (int j = 0; j < columnas; j++) {

					if (matriz[i][j] == valor) {
						posicion[0] = i;
						posicion[1] = j;
						salidaPrecipitada = true;
						break outerfor;
					}
				}
		if(salidaPrecipitada)	{
			break;
			}
			return posicion;
		}	
	 */
			
	
	
	
	
}
