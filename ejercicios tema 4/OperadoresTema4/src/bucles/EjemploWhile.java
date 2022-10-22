package bucles;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BUCLES <<> while, for, do while, for para recorrer matrices.
		
		//Se usan para repetir un algoritmo mientras una condicion sea verdadera
		//En esa condicion suelen entrar en juego una o dos variables, que son las variables de control del bucle
		//variable de control del bucle --> i, j, k...
		//la condicion que controla el bucle se llama condicion de continuidad. Mientras sea cierta, se va a ejecutar lo que esta en el bucle
		//si deja de ser cierta el programa sale del bucle
		//3 partes
		//Inicializacion: dar un valor inicial a las variables de control
		//condicion de continuidad:
		//Modificar la variable de control.
		
		//Ej, programa que muestre por pantalla los 20 primeros numeros
		
		int i ;
		//Inicializar al primer valor que quiero ver, en este caso el 1
		i= 1;
		
		while ( i <= 20) {
			// si ponemos print en vez de println nos lo muestra en una linea
			System.out.print(i + " ");
			i++;
			//o i = i+1;
				}
		System.out.println();
		System.out.println("Fin del bucle");
		
		
		
	}

}
