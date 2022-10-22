package buclesAnidados;

public class ForAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mostrar por pantalla n filas de n asteriscos
		int n = 3;
		for (int i=0;i<n;i++) {//si i es menor q n entra en el bucle j
		for (int j = 0; j < n; j++) {//si j es menor q n imprime un *
		System.out.print("*");
		}// llave que cierra bucle j si j es mayor q n hace el print del salto de linea
		System.out.println();
		
		}//llave que cierra bucle i
	}

}
