package bloqueEjercicios1;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class MTDNumeros {

	
	public static boolean esPerfecto(int numero) {

		int suma = 0;

		for (int i = 1; i < numero; i++) {

			if (numero % i == 0) {
				suma = suma + i;

			} // cierre if

		} // cierre for
		if (numero == suma) {

			return true;
		} else {

			return false;
		}

	}
	
	
	public static int mcm (int num1, int num2, int num3) {
		
		int maximo;
		int i;
		
		maximo = num1;
		 
        if ( num2 > maximo )
            maximo = num2;
 
        if ( num3 > maximo )
            maximo = num3;
        
        i = maximo;
        
        while ((i % num1 != 0) || (i % num2 != 0) || (i % num3 != 0))
            i++;
 
        //System.out.println( i );
        
        return i;
		
	}
	
		public static float formula ( float r1, float r2) {
		
		
				
		float operacion = (r1*r2)/(r1+r2);
		
		System.out.println("El resultado en ohmnios es: ");
		
		return operacion;
		
		}
		
		
		
		public static float formula ( float r1, float r2, int uds) {
		
		float resultadoOhmios=0;
			
		float operacion = (r1*r2)/(r1+r2);
		
		if ( uds==1) {
			
			resultadoOhmios=operacion*((float)(Math.pow(10, 6)));
			
			System.out.print("El resultado en microOhmnios  es: ");
			
		}else if ( uds==2) {
			
			resultadoOhmios=operacion*((float)(Math.pow(10, -3)));
				
			System.out.print("El resultado en Kiloohmnios es: ");
		}else {
			
			System.out.print("Error, las unidades tienen que ser 1 o 2: ");
		}
		
		return resultadoOhmios;
		
	}
	
		public static void mediaModificada (int matriz[]) {
			
			int suma=0;
			
			int contador=0;
						
			for(int i=0;i<matriz.length;i++) {
				
								
				if(matriz[i]>0) {
					
					suma=suma+matriz[i];
					contador++;
					
				}if(matriz[i]<0) {
					
					matriz[i]= Math.round(suma/contador);
					
				}
			}
		}
		
		
		public static float media (float matriz[]) {
			
			float suma=0;
			float media=0;	
			
			for (int i=0;i<matriz.length;i++) {
				
				suma=suma+matriz[i];
				
			}
			
			media=suma/matriz.length;
			
			System.out.println(String.format("%.2f", media));
			
			return media;
		}
		
		public static float media (int matriz[]) {
			
			float suma=0;
			float media=0;	
			
			for (int i=0;i<matriz.length;i++) {
				
				suma=suma+matriz[i];
				
			}
			
			media=suma/matriz.length;
			
			System.out.println(String.format("%.2f", media));
			
			return media;
		}
		
		public static void redondeo (float matriz[], boolean condicion) {
			
			float matrizLocal[]= new float[matriz.length];
			
			for(int i=0; i<matriz.length;i++) {
				
				if(condicion==false) {
					
					matrizLocal[i]=(float)Math.ceil(matriz[i]);
					
				}else {
					
					matrizLocal[i]=(float)Math.floor(matriz[i]);
				}
				
			}
			
		}
		
		public static int[] redondeos (float matriz[], boolean condicion) {
			
			int matrizLocal[]= new int[matriz.length];
			
			if (condicion==false) {
				
				for(int i = 0; i<matriz.length;i++) {
					
					matrizLocal[i]=(int)Math.ceil(matriz[i]);
					
				}
				return matrizLocal;
				
			}else {
				
				for(int i = 0; i<matriz.length;i++) {
					
					matrizLocal[i]=(int)Math.floor(matriz[i]);
				}
			
				return matrizLocal;
			}
			
			
			
			
			
		}
		 
		
		
		public static void matriz2DMod(int matriz[][]) {
			int filas = matriz.length;
			int columnas = matriz[0].length;

			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {

					if (i == 0 && j == 0) {
						matriz[0][0] = matriz[i][j];
					} else if (matriz[i][j] != 0) {

						matriz[i][j] = (int) (Math.pow((i * j), 3) / (2 * (i + j)));

					} // cierre if
				} // cierre 2º for
			} // cierre 1º for
		}// cierre clase

		public static void printar2D(int m[][]) {

			int filas = m.length;
			int columnas = m[0].length;

			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();

			}

		}
		
		public static void matriz2DMedia(int matriz[][]) {
			// float media[]=new float[matriz.length];
			int filas = matriz.length;
			int columnas = matriz[0].length;
			int suma = 0;
			int posicion = 0;
			float mediaFila;
			float mayorMedia = 0;
			for (int i = 0; i < filas; i++) {
				suma = 0;
				for (int j = 0; j < columnas; j++) {

					suma = suma + matriz[i][j];

				}
				mediaFila = suma / filas;

				System.out.println("La media de la fila " + i + " es " + mediaFila);
				if (mediaFila > mayorMedia) {
					posicion++;
					mayorMedia = mediaFila;
				}

			}

			System.out.println("La media más alta es: " + mayorMedia + " y está en la fila: " + (posicion - 1));
		}
	
		public static boolean matriz2DRepetidas(float matriz[][]) {
			Boolean repetidas = false;
			for (int i = 0; i < matriz.length; i++) { 
				for (int j = 0; j < matriz[i].length; j++) { 
					if (j == i) {
						j++; 
					}		
					if (j == matriz.length) { 
						break;
					} else {
						repetidas = Arrays.equals(matriz[j], matriz[i]); // Comparamos si la fila se encuentra repetida.
						if (repetidas==true) { 
							
							return true;
							
						}
					}
				}

			}
			return repetidas;
		}

		
		

		public static void repes(float[][] matriz) {

			int filas = matriz.length;
			
			int columnas = matriz[0].length;
			
			int contador = 0;
			
			boolean repetidas= false;

			for (int i = 0; i < filas; i++) {
				contador=0;
				repetidas=false;
				for (int j = 0; j < matriz[i].length; j++) {

					if (matriz[i][j]== matriz[i][j]) {
						contador++;
						//repetidas = true;
						
						

					}
					}
				}
			if (contador==columnas) {
				repetidas=true;
				System.out.println(repetidas);
			}else {
				System.out.println(repetidas);
			}
			}	
			
		
		
		public static void reees(float[][] matriz) {
			boolean repetidas=false;
			//int filaColumna=0;
			
			int filas = matriz.length;
			int columnas = matriz[0].length;
			/*int i=1;
			
			int limite= (repetidas) ? columnas:filas;
			*/
			for ( int i =0;i<filas;i++	) {
				for(int j = 0;j<columnas;j++) {
		
					if(matriz[i][j]==matriz[i][j+1]) {
						
						repetidas=true;
						System.out.println(repetidas);
					}
					
				}
	
			}
			
			
			
			
			
			
			
			
		}
		
}
