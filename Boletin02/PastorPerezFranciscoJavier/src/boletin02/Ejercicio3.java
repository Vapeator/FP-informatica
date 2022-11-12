package boletin02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		
		Scanner entrada = new Scanner (System.in);
				
		int numero = 0;
		int puntos=0 ,puntos2=0, puntos3=0;
		int intentos = 0;
		boolean seguirJugando=true;
		
		
do {	
		
		
		int dificultad = Integer.parseInt(JOptionPane.showInputDialog("Elija el nivel de dificultad de 1 a 3, utiliza cualquier otro numero para salir"));
		
		intentos=0;
		
		switch (dificultad) {
		
		case 1:
			
			int aleatorio= (int)(Math.random()*15+1);
			
			do {
				
				
				System.out.println("Introduzca un numero");
				
				numero = entrada.nextInt();
				
				System.out.println(aleatorio); //lo pongo para hacer comprobaciones
				
				intentos++;
								
				if (intentos <3 && numero!=aleatorio) {
					
					System.out.println("Te quedan " + (3-intentos) + " intentos.");
				
				if(aleatorio<numero ) {
					
					System.out.println("El numero es menor" );
					
				} else if (aleatorio>numero) {
					
					System.out.println("El numero es mayor");
				} 
				} 
				
				
			}while (numero != aleatorio && intentos <3) ;
			
			if (intentos == 1) {
				
				puntos= 10;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos + " puntos. ");
			}else if (intentos == 2) {
				
				puntos =7;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos+ " puntos. ");
				
			} else if (intentos == 3 && numero==aleatorio) {
				
				puntos =5;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos+ " puntos. ");
			}else if (intentos ==3) {
				
				System.out.println("No te quedan mas intentos");
			}
			
			

		
		break;
		
		
		case 2:
			
			int aleatorio2= (int)(Math.random()*30+1);
			
			do {
				
				
				System.out.println("Introduzca un numero");
				
				numero = entrada.nextInt();
				
				System.out.println(aleatorio2); //lo pongo para hacer comprobaciones
				
				intentos++;
								
				if (intentos <4 && numero!=aleatorio2) {
					
					System.out.println("Te quedan " + (4-intentos) + " intentos.");
				
				if(aleatorio2<numero ) {
					
					System.out.println("El numero es menor" );
					
				} else if (aleatorio2>numero) {
					
					System.out.println("El numero es mayor");
				} 
				} 
				
				
			}while (numero != aleatorio2 && intentos <4) ;
			
			if (intentos == 1) {
				
				puntos2=30;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos2+ " puntos. ");
			}else if (intentos == 2) {
				
				puntos2=20;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos2+ " puntos. ");
				
			} else if (intentos == 3 ) {
				
				puntos2=10;
				
				System.out.println("Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos2+ " puntos. ");
			}else if (intentos ==4 && numero==aleatorio2) {
				
				puntos2=7;
				
				System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos2+ " puntos. ");
			}else if (intentos ==4) {
				
				System.out.println("No te quedan mas intentos");
			}
			
			
			break;
			
			
			case 3:
				
				int aleatorio3= (int)(Math.random()*50+1);
				
				do {
					
					
					System.out.println("Introduzca un numero");
					
					numero = entrada.nextInt();
					
					System.out.println(aleatorio3); //lo pongo para hacer comprobaciones
					
					intentos++;
									
					if (intentos <5 && numero!=aleatorio3) {
						
						System.out.println("Te quedan " + (5-intentos) + " intentos.");
					
					if(aleatorio3<numero ) {
						
						System.out.println("El numero es menor" );
						
					} else if (aleatorio3>numero) {
						
						System.out.println("El numero es mayor");
					} 
					} 
					
					
				}while (numero != aleatorio3 && intentos <5) ;
				
				if (intentos == 1) {
					
					puntos3 =50;
					
					System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido "+ puntos3 +" puntos. ");
				}else if (intentos == 2) {
					
					puntos3=35;
					
					System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos3+ " puntos. ");
					
				}else if (intentos == 3) {
					
					puntos3= 20;
					
					System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos3+ " puntos. ");
					
				} else if (intentos == 4 ) {
					
					puntos3=15;
					
					System.out.println( "Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos3+ " puntos. ");
				}else if (intentos ==5 && numero==aleatorio3) {
					
					puntos3=7;
					
					System.out.println("Lo has conseguido en " + intentos + " intentos, has conseguido " +puntos3+ " puntos. ");
					
				}else if (intentos ==5) {
					
					System.out.println("No te quedan mas intentos");
				
				}
		
				break;
				
				default:
					
					System.out.println("Gracias por jugar!");
				
					seguirJugando=false;
				
		}
	}while (seguirJugando==true)	;
				
				
		
		
		


	}
}
