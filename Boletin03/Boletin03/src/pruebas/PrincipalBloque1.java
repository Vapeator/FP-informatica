package pruebas;

import java.util.Arrays;
import java.util.Scanner;

import bloqueEjercicios1.MTDNumeros;

public class PrincipalBloque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RECORDAR HACER SWITCH
		
	boolean salir=false;	
	int opcion;
		
		do {
			
			System.out.println("Seleccione una opción:");
			System.out.println("Selecciona del 1 al 9 para cada uno de los apartados ");
			System.out.println("Utiliza el 10 para cerrar el programa");
			Scanner apartado = new Scanner(System.in);
			opcion = apartado.nextInt();		
		switch(opcion) {
		
//1.		
		case 1:
		int x=28;
				
		
		System.out.println("es perfecto el nº "+ x+ " ? " + MTDNumeros.esPerfecto(x));
		
		break;
//2.
		case 2:
		System.out.println("Introduzca 3 numeros entre 0 y 100");
		
		Scanner lector= new Scanner(System.in);
		
		int num1=lector.nextInt();
		int num2=lector.nextInt();
		int num3=lector.nextInt();
		if(num1<=100 && num1>0 && num2<=100 && num2>0 && num3<=100 && num3>0) {
			System.out.println("el mcm es "+ MTDNumeros.mcm(num1, num2, num3));	
			
		}else {
			
			System.out.println("Error en los datos introducidos");
		}
		
		break;
//3.
		case 3:
		
		float f1=1;
		float f2=2;
						
		System.out.println( MTDNumeros.formula(f1, f2));
		
		int ud=1;
		
		System.out.println( MTDNumeros.formula(f1, f2,ud));
		
		ud=2;
		
		System.out.println( MTDNumeros.formula(f1, f2,ud));
	
		break;
//4.
		case 4:
		
		int matriz[]= {2,4,6,8,-1,-2,-3,-4};
		
		
		MTDNumeros.mediaModificada(matriz);
		
		System.out.print(Arrays.toString(matriz));
		
		break;
//5.		
		case 5:
		
		System.out.println("");
		
		
		float matriz1[]= {3.5f,3.5f,4.2f};
		
		System.out.println("La media es:");
		
		MTDNumeros.media(matriz1);
		

		
		int matriz2[]= {1,2,3,4};
		
		System.out.println("La media es: ");
		MTDNumeros.media(matriz2);
		
		break;
//6.
		case 6:
		
		float matriz3[]= {1.5f,2.5f,3.5f};
		
		float matriz4[];
		
		matriz4=Arrays.copyOf(matriz3,matriz3.length);
		
		boolean condicion=true;
		boolean condicion2=false;
		float suma=0;
		float media=0;
		float suma2=0;
		float media2=0;
		
		//MTDNumeros.redondeos(matriz3, condicion);
		int matriz1Int[]=MTDNumeros.redondeos(matriz3, condicion);
		
		System.out.println("La matriz redondeada por debajo es: " +Arrays.toString(matriz1Int));
		
		
		
		
		//System.out.println(Arrays.toString(MTDNumeros.redondeos(matriz4, condicion2)));
		//System.out.println(Arrays.toString(matriz3));
		
		for (int i=0;i<matriz1Int.length;i++) {
			
			suma=suma+matriz1Int[i];
			
		}
		
		media= suma/matriz1Int.length;
		
		System.out.println("La media es: "+media);
		
		//ahora con el false
		
		int matriz2Int[]=MTDNumeros.redondeos(matriz4, condicion2);
		
		System.out.println("La matriz redondeada por encima es: "+Arrays.toString(matriz2Int));
		
		for (int i=0;i<matriz2Int.length;i++) {
			
			suma2=suma2+matriz2Int[i];
			
		}
		
		media2=suma2/matriz2Int.length;
		
		System.out.println("La media2 es: "+media2);
		
		break;
		
//7.	
		case 7:
		
		int matriz2D[][]= {{5,3,7,9},{6,3,8,15},{10,5,12,11},{19,20,14,13}};
		
		MTDNumeros.matriz2DMod(matriz2D);
		
		MTDNumeros.printar2D(matriz2D);
		
		break;
		
//8.
		case 8:
			
		int matriz2D2[][]= {{3,3,3,3},{4,4,4,4},{5,5,5,5},{6,6,6,6}};
		
		MTDNumeros.matriz2DMedia(matriz2D2);
		
		break;
//9.
		case 9:
			
		float matriz2D3[][]= {{3,3,3,3},{3,5,6,3},{3,3,3,3},{5,4,6,5}};
		
				
		System.out.println(MTDNumeros.matriz2DRepetidas(matriz2D3));
		
		
			
		break;
		
		case 10:
			
			System.out.println("Saliendo del programa");
			salir = true;
			
			
			break;
			
			default:
				
				System.out.println("Error en la opcion introducida");
		
				break;
		}
		}while(salir==false);
		
		
	}

}
