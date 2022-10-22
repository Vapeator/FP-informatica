package matrices2D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class EjemploMatriz2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matrices 2D--> sirven para organizar mejor los datos
		// 4 5 6 |4 es la posicion cero cero/ 5 es la posicion 0 1/ 6 es la posicion 0 2
		// 7 9 2 |7 es es la posicion 1 0/ 9 es la posicion 1 1/ 2 es la posicion 1 2 
		//int [] []= new int[num filas][num columnas]
		int [][] matriz= new int[2][5];
		matriz [0][0]= 9;
		//llenar la matriz de numeros aleatorios
		System.out.println("numero de filas "+ matriz.length);
		System.out.println("numero de columnas :" + matriz[0].length);
		//matriz.length devuelve el nº total de filas en las matrices 2D, en el ejemplo devolveria 2
		//empezamos por la primera fila
		
	for (int indiceFila=0; indiceFila< matriz.length;indiceFila++)	{	
		for (int indiceColumna=0; indiceColumna<matriz[indiceFila].length; indiceColumna++)  {
		
			Random aleatorio = new Random();
			matriz [indiceFila][indiceColumna]= aleatorio.nextInt(20);
			
		}
		}
	

	}
}
