package bucles;

import java.util.Scanner;

public class EjemploDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//quiero darle 3 intentos para resolverlo
		int ejercicio, contador=0;
		do {
		//si quiero hacerlo con un if lo haria a partir de aqui
			//run debug para poner un puntp de riptura, al correr el programa te da el valor de cada variable
			
			if(contador== 0) {
		System.out.println("Escoja una opcion: ");
			}
			else if(contador ==1) {
				System.out.println("Escoja una opcion: quedan 2 intentos");
			}
			else if (contador==2){
				System.out.println("Escoja una opcion: ultimo intento");
			}
			else {
				System.out.println("buff nada, no vales para meter numeros");
			}
		System.out.println("1.Calcular si un nº es primo");
		System.out.println("2. Identificar numeros perfectos");
		System.out.println("3. Identificar numeros amigos. ");
		
		Scanner lector = new Scanner (System.in);
		
		ejercicio = lector.nextInt();
		
		contador++;

		}
		while ((ejercicio >=4 || ejercicio<1) && contador<3);
		//pongo este if para que si el contador llegue a 3 me de un mesnsaje
		//fuera del bucle esta puesto
		if (contador==3) {
			System.out.println("buff nada, no vales para meter numeros");
		}
		else {
			//Que ejercicio escogio el usuario
			switch(ejercicio) {
			case 1:
				//calcular si un nº es primo
				//Un nº es primo cuando solo es divisible por 1 o por si mismo
				int numero;
				System.out.println("Introduzca un numero y te digo si es primo o no: ");
				//no puedo llamar al scanner xq esta en el bloque do, asi q tego dos opciones
				//sacarla del do y hacerla global o hacer otro lector
				Scanner lector2= new Scanner(System.in);
				
				numero= lector2.nextInt();
				//para saber si es primo trato de detectar divisores entre el 2 y n-1 o 1/2
				boolean primo = true;
				
				for (int i=2; i<numero;i++) {
					if (numero%i ==0) {
						primo = false;
						break;//salimos del bucle xq ya no me interesa seguir encontrando divisores
					}//fin del if interior
				}//fin del bucle for
				
				if(primo) {
					System.out.println("El nº es primo");
				} 
				else {
					System.out.println("El nº no es primo");
				}
				
				break;
				
		case 2:
			break;
		case 3:
			break;
		default:
			break;
				
			
			
			}
		}
			
		//|| escomo decir or
				}
		}
