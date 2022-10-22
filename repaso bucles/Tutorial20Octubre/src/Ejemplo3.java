import java.util.Random;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//matrices 2D
		
		int matriz[][] = new int[3][3];
		//0 0 0-->fila 0
		//0 0 0-->fila 1
		//0 0 0-->fila 2
		
		//Rellenar la primera fila con valores aleatorios
		
		Random aleatorio= new Random();
		int numeroFilas=matriz.length;
		int numeroColumnas=matriz[0].length;
		//el numero de columas nos la da el .length de la matriz q quiera
		//En las matrices 2D el nº de filas nos la da el matriz.length
		
	for(int fila=0;fila<numeroFilas;fila++) {	
		for (int columna=0;columna<matriz[fila].length;columna++)	{
			//seria como poner <3
			matriz[fila][columna]= aleatorio.nextInt(50);
		}
	}	
//este de arriba es el for clasico para recorrer y rellenar la matriz 2D
	
	//calcular la suma de todos los elementos de la matriz
	int suma2D=0;
	for (int i=0;i<matriz.length;i++) {
		for (int j=0; j<matriz[i].length;j++) {
			suma2D=suma2D+matriz[i][j];
		}
	}

	}

}
