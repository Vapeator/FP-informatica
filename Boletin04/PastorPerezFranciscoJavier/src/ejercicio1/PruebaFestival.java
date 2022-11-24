package ejercicio1;

import java.util.Scanner;

public class PruebaFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Festival f1= new Festival("Revenidas",100);
		
		Grupos g1= new Grupos("U2",90,9,18000);
		Grupos g2= new Grupos ("Rolling Stones",90,6,20000);
		
		f1.addGrupo(g1);
		f1.addGrupo(g2);

		char opcion;
		boolean salir = false;
		
		do {
			Scanner lector= new Scanner(System.in);
			System.out.println("a. Introducir un nuevo grupo para añador al Festival");
			System.out.println("b. Buscar un grupo y mostrar su posicion en Festival");
			System.out.println("c. Coste total del festival");
			System.out.println("d. Mostrar los 3 grupos mas caros");
			System.out.println("e. Grupos por encima de un nivel de popularidad");
			System.out.println("f. Mostrar toda la informacion del festival");
			
			opcion= lector.nextLine().charAt(0);
			
			
			
			switch(opcion) {
			
			case 'a':
				
				
				
				
				System.out.println("Introduzca el nombre del grupo");
				String nombre = new Scanner(System.in).nextLine();
				System.out.println("Introduzca el tiempo de actuacion");
				int tiempoActuacion= new Scanner(System.in).nextInt();
				System.out.println("Introduzca la popularidad");
				int popularidad = new Scanner(System.in).nextInt();
				System.out.println("Introduzca el coste");
				float coste= new Scanner(System.in).nextFloat();
				
				Grupos g3 = new Grupos (nombre,tiempoActuacion,popularidad,coste);
				
				f1.addGrupo(g3);
				System.out.println(f1.toString());
				
			break;
				
			case 'b':
				
				System.out.println("Introduzca el nombre del grupo");
				String nombreGrupo= new Scanner(System.in).nextLine();
				for (Festival f: ) {
					if(f.getNombre().equals(nombreGrupo)) {
						System.out.println(nombreGrupo);
					}
				}
				
				
				break;
				
			case 'c':
				
				break;	
		
			case 'd':
				
				break;	
				
			case 'e':
				
				break;
				
			case 'f':
				
				break;
				
			default:
			System.out.println("Error en la opcion introducida");
			}
			
			}while(salir==false);
			
	}

}
