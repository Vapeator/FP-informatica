package repaso;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int matriz [][]= new int [5][5];
		
		Matrices2D.llenarMatriz(matriz);
		
		System.out.println("matriz generada: ");
		
		Matrices2D.printar(matriz);
		
		Matrices2D.modificarMatriz(matriz);
				
		System.out.println("Matriz modificada: ");
			
		Matrices2D.printar(matriz);
		
		System.out.println("Matriz sin nº primos: ");
		
		Matrices2D.eliminarPrimos(matriz);
		Matrices2D.printar(matriz);
		
		int valorBuscado=10;
		int matrizBusqueda[][]= {{1,10,4},{8,9,10},{5,1,2}};
		int posicion[]=Matrices2D.buscarValor(matrizBusqueda, valorBuscado);
		Matrices2D.printar(matrizBusqueda);
		System.out.println("El 10 esta en la posicion: ");
		System.out.println("Fila "+posicion [0]);
		System.out.println("Columna " + posicion[1]);
		
		
		
		
		
		
	}

}
