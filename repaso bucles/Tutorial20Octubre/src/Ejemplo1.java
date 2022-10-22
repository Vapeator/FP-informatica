import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[]= new int [20];
		
		
		Random aleatorio= new Random();
		
		matriz [0] =aleatorio.nextInt(50);
		matriz [0] =aleatorio.nextInt(50);
		
		//los bucles permiten repetir el algoritmo n veces cambiando el indice
		// al que acceder
		
		
		int i=0;
//while		
		
		while (i<20) {
			
			matriz [i] = aleatorio.nextInt(50);
			
			i++;
				
		}
		
// for		
		for (int posicion=0; posicion<matriz.length; posicion++) {
			
			System.out.print(matriz[posicion] + " ");
			
		}
		
//Quiero mostrar por pantalla los divisores del nº en la posicion cero
// supongamos q es 20: tendremos q hacer 20/1 . 20/2. 20/3...
//si el resto de esa operacion da cero, implica q es divisor de 20
		
		int j=1;
		
		while (j<=matriz[0] ) {
			if(matriz[0]%j==0) {
				
				System.out.println(j + " es divisor de " + matriz[0]);
				
			}
			j++;
			
		}
//ahora hacemos el mismo algoritmo, poniendo cuantos divisores, en lugar de cuales
//cuantos divisores tiene el ultimo numero del array
		
		int contadorDivisores=0;
	//podriamos reinicializar la j, aunque podriamos usar otra variable	
		for( int valor =1;valor<=matriz[matriz.length-1];valor++) {
			if(matriz[matriz.length-1] %valor==0) {
				
				contadorDivisores++;
				
				}
			}
		
		System.out.println( matriz[matriz.length-1] + " tiene " + contadorDivisores+ " divisores");
	
//Ejemplo bucles anidados
		System.out.println();
		System.out.println("******Ejemplos bucles anidados***************");
		
		int x=1;
		for(int posicion=0; posicion<matriz.length/2;posicion++) {
		System.out.println("Divisores de " + matriz[posicion]);
		x=1; //hay que RESETEAR la x, xq sino viene viciada del bucle while
		//MUY IMPORTANTE RESETEARLA		
		while (x<=matriz[posicion] ) {
			if(matriz[posicion]%x==0) {
			
				System.out.print(x + " ");
				
			}//cerramos el if
			x++;
			
		}//cerramos el while
		System.out.println();
		}//cerramos el for
	
	
	}

}
