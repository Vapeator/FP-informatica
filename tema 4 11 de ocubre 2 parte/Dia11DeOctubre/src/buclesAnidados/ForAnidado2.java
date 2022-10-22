package buclesAnidados;

import java.util.Scanner;

public class ForAnidado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cogemos el ejemplo del repaso for para los n perfectos
		Scanner lector= new Scanner(System.in);
		int suma=1, n;
		
		System.out.println("Introduce un numero y te muestro los numeros perfectos que hay por debajo ");
		
		n = lector.nextInt();
		
		for (int numero =6;numero<=n;numero++) {
			//hay que resetear la variable suma, sino se acumula con las del bucle
			suma=1;			
			for (int i = 2; i<= numero/2;i++)	{
				if (numero %i==0) {
					suma = suma + i; //si tenemos la variable suma sin valor, da error, hay que inicializarla
				}
			}//cierre bucle i
			
			if(suma==numero) {
				System.out.println(numero + " Es perfecto");
			}
			
		}//cierro el primer bucle for para que repita el bucle de los numeros perfectos con la variable numero
	}

}



