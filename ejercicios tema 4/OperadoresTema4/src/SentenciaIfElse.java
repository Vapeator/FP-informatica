import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sentencia if (condicion) {
				//....
				//}
				//else {
				//...
				//}
		
		//Programa que indica si un numero es par
		
		int numero;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca un valor: ");
		numero= lector.nextInt();
		
		if(numero % 2==0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("No es par");
		}
		
		//Programa que lee la edad y la altura de una persona y si la edad es menor que 8 o 
		//la altura menor que 1,35m -->muestra un mensaje de que tiene que usar sistema de proteccion individual
		
		int edad;
		float altura;
		
		System.out.println("Introduzca la edad");
		edad= lector.nextInt();
		System.out.println("Introduzca la altura");
		altura= lector.nextFloat();
		
		if (edad<8||altura<1.35)	{
			System.out.println("Tiene que utilizar SPI");
			
		} else  {
			
			System.out.println("No tiene que usar SPI");
		}
		
		//Programa que determina si un numero pertenece al rango [10-20]
		
		int valor;
		
		System.out.println("Introduce valor rango [10-20]");
		valor=lector.nextInt();
		
		if (valor>=10 && valor<=20) {
			System.out.println("El valor esta en el rango");
			} else	{
				System.out.println("Esta fuera del rango");
			}
			
	}

}
