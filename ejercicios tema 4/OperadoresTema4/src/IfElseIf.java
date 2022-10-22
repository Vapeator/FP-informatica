
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que me clasifique un numero en los siguientes rangoos
		//[0-20] ->Grupo A
		//[21-50] ->Grupo B
		//[51-70] ->Grupo C
		//[resto] ->Grupo D
		
		
		int numero = 91;
		if (numero <0){
			System.out.println("Error");
		}
		else if (numero >=0 && numero <=20 ) {
			System.out.println("Grupo A");
		} else if(numero<=50) {
			System.out.println("Grupo B");
		} else if(numero<=70) {
			System.out.println("Grupo C");
		} else {
			System.out.println("Grupo D");
		}
		
		//ahora podemos probar el ejercicio del if anidados con if else if
		//Programa que me detecte si es multiplo de 3 y 5
		
		int numero2=13;
				;
		//Lo del %3==0 significa que lo divides entre 3 y el resto da cero
		
		if(numero2 %3==0 && numero2 % 5 == 0) {			
			System.out.println("Multiplo de 3 y 5");
		}
		else if(numero2 %3==0 ) {
			System.out.println("Multiplo de 3 y no de 5 ");
		}
		else if (numero2 %5==0) {
			 System.out.println("Multiplo de 5 y no de 3");
		} else	{
			System.out.println("No es multiplo ni de 3 ni de 5");
		}
			
				//para comprobar paso por paso, podemos establecer un punto de ruptura,
			//damos doble click en la fila que sea, vamos a Run- debug
		
		
	}
}
