package bucles;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3 tipos de bucles: for, while y do while
		//necesitamos al menos una variable de control --> i, j, k...
		//hay que inicializar la variable de control, que va a aparecer
		//en la condicion de continuidad y que se va a modificar dentro del bucle
		
		
		//while hay que iniciar la variable antes de entrar en el bucle
		
		int i = 7;
		
		while (i<100) {
			
			if (i%7==0) {
				System.out.print(i + " ");
			
			}
			i++; //el i++ lo ponemos en el bucle while, no en el if, sino se queda en el 7
		}// fin del bucle while
	
		
		
		
	}

}
