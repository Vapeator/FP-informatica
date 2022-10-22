package test;
import java.util.Arrays;

import misMetodos.Metodos1;
import misMetodos.ParametrosOpcionales;

public class Pruebas {
	
	//en esta zona podriamos definir metodos

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prueba metodo esPar
		
		int numero=9;
		//este valor se opia en ddonde esta n en la funcion
		
		//llamamos a la funcion esPar
		
		boolean par= Metodos1.esPar(numero);

		if(par) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
			
		
//prueba metodo validarString		
		
		if (Metodos1.validarString("3W")) {
			System.out.println("Empieza por digito");
		} else {
			System.out.println("No empieza por digito");
		}
		
		
		//prueba metodo saludar
		
		Metodos1.saludar();
		
		
//Prueba metodo sumar 10
		
		int x = 10;
		x=Metodos1.sumar10(x);
		
		System.out.println("Despues de sumarle 10: " +x);
		
//prueba metodo sumar 10 a array
		
		int matriz[]= {0,1,2,3};
		
		Metodos1.sumar10(matriz);
		
		System.out.println(Arrays.toString(matriz));
		
		
//Prueba metodo sumar10bis
		
		//Hay que declararlo en una funcion 
		
		int nuevo[]=Metodos1.sumar10bis(matriz);
		
		System.out.println(Arrays.toString(nuevo));
		
//Prueba metodo calcular media
		
		double resultado=ParametrosOpcionales.calcularMedia(4, 9);
		double resultado2=ParametrosOpcionales.calcularMedia(3, 9,3);
		double resultado3=ParametrosOpcionales.calcularMedia(1,2,3,4,5,6,7,8,9);
		double resultado4=ParametrosOpcionales.calcularMedia(9);
		System.out.println(resultado+" y " +  resultado2+" y "+  resultado3+ " y " +resultado4);
		
		
		
//Prueba metodo suma parametros opcionales
		
		double res1=ParametrosOpcionales.suma(4);
//si paso un solo valor, entra en la primera q tiene solo una variable		
		
		double res2=ParametrosOpcionales.suma(9,10);
//con mas de un valor va a la otra		
		
		System.out.println("Suma 1 " + res1 + " Suma 2 " + res2);
		
		
		
		
		
		
	}

}
