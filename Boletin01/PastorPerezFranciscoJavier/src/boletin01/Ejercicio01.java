package boletin01;

import java.lang.reflect.Array;
//importamos de la biblioteca de java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ejercicio 1
		//primero declaramos la matriz, la creamos con double porque al
		//haber raices cuadradas va a dar un double
		
		double [] matriz= new double[10];
//a.	
		//creamos el random, para ello importamos al principio
		// damos tambien valor a la posicion cero
		
		int x = (int)(Math.random()*10+1);
		
		matriz[0]=x;
		
		
		System.out.println("Valor positicion 0 es "+ matriz[0]);
		
//b.damos valor a la posicion 1
		
		matriz[1]= matriz[0]+20;
		System.out.println("Valor posicion 1 es: "+ matriz[1]);
		
//c.primero sumo los numeros elevados a su respectivo correspondiente y despues hago la raiz de la suma
		
		double c= Math.pow(matriz[0],3) + Math.pow(matriz[1],2);
		
		
		matriz[2]= Math.sqrt(c);
		
		System.out.println("Valor posicion 2 es: "+ matriz[2]);
		
//d.sumamos los valores de las 3 primeras posiciones y calculamos la media dividiendo entre 3
		double d= matriz[0]+ matriz [1] + matriz [2];
		
		matriz [3]= d/3;
		
		System.out.println("Valor posicion 3 es: "+ matriz[3]);	
		
//e. Para poder utilizar JOptionPane, hay que importarlo también
		
		matriz [4]= Double.parseDouble (JOptionPane.showInputDialog("Introduzca un numero"));
		
		System.out.println("Valor posicion 4 es: "+ matriz[4]);
		
//f.El ultimo valor del array es el tamaño del array -1, ya que el cero se tiene en cuenta
		
		matriz [5]= 5;
		matriz [6]= 6;
		matriz [7]= 7;
		matriz [8]= 8;
		matriz [9]= 9;
		
		
//g. No podemos copiar la matriz directamente haciendo matriz = copia, ya que de esa forma iguala los valores, no hace una copia. Es decir, si modificamos la matriz, tambien 
		//modificaremos la copia, y no es lo que queremos, por eso utilizaremos el copyOf
		double copia []= Arrays.copyOf(matriz, matriz.length);
		
//h.Utilizamos sort para ordenar la matriz
		Arrays.sort(copia);
		
		System.out.println ("La matriz queda de la siguiente manera: "+ Arrays.toString(matriz));	
		System.out.println ("La copia queda de la siguiente manera: "+ Arrays.toString(copia));	
		
//i.
		double ValorBuscado=matriz[0];
		
		int posicion = Arrays.binarySearch(matriz, ValorBuscado);
		
		int posicioncopia = Arrays.binarySearch(copia, ValorBuscado);
		
		// en la matriz original, como no está ordenada, probablemente no
		//funcione bien la busqueda
		
		System.out.println("la posicion en el original es : "+posicion);
		
		System.out.println("la posicion en el original es : "+posicioncopia);
	
//j. Utilizamos el equals para verificar si son iguales
		// no se si es mejor hacer una variable fuera del system.out y despues ingresarla, 
		//me refiero a hacer esto:
		//boolean iguales= Arrays.equals(matriz, copia);
		//System.out.println(iguales);
		//o si es indiferente ponerlo dentro del sysout. Entiendo q al no volver a usarla, da igual crear o no la variable.
	
		System.out.println("Son iguales? " + Arrays.equals (matriz,copia));
		
		
//k.Para poder sacarlo por pantalla tenemos que pasarlo a String
		
		System.out.println(Arrays.toString(matriz));
		
		System.out.println(Arrays.toString(copia));

	
//Ejercicio 2	

		//declaramos el Scanner y las variables que queremos utilizar
		
		String Iban;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el nº de cuenta");
		Iban = lector.nextLine();
		
		//a.
		String CodigoPais= Iban.substring(0, 2);
		
		System.out.println("El código de Pais es: " + CodigoPais);
		//b.
		
		String DigitoControl= Iban.substring(2, 4);
		
		System.out.println("El digito de control es: " + DigitoControl);
		//c.
		
		String CodigoCaja= Iban.substring(4, 8);
		
		System.out.println("El código de la Caja es: " + CodigoCaja);
		
		//Aprovecho para crear la sucursal
		
		String Sucursal= Iban.substring(8, 12);
		
		System.out.println("El código de la Sucursal es: " + Sucursal);
		
		
		//d.
		
		String DigitoControl2= Iban.substring(12, 14);
		
		System.out.println("El digito control es nuevamente: " + DigitoControl2);
		
		System.out.println("Coinciden los digitos de control?" + DigitoControl.equals(DigitoControl2));
		
		//e.
		
	
		String NumeroCuenta= Iban.substring(14, 24);
		
		System.out.println("El numero de cuenta es: " + NumeroCuenta);
		
		//f.
		
		System.out.println("El IBAN tiene una longitud de " + Iban.length() + " caracteres");
		
		//g.
		
		System.out.println("El IBAN empieza por es? " + CodigoPais.equalsIgnoreCase("es"));
		
		//h. 		
		
		int DigitoControlBinario = Integer.parseInt(DigitoControl);
		
		System.out.println("El dígito de control en binario sería:" + Integer.toBinaryString(DigitoControlBinario));

//ejercicio 3
	
	
	String frase =JOptionPane.showInputDialog("Escriba una frase");
	
	System.out.println("La frase es: "+ frase);
	
//a. Primero lo separamos utilizando split para separar cada vez que haya un espacio y, como nos devuelve una matriz de strings, podemos contarlo con array.length
	
	String separada []= frase.split(" ");

	System.out.println("El nº de palabras en la frase son: " + separada.length);

//b. 	Eliminamos los espacios y contamos las letras
	
	int sinEspacios= frase.replace(" ", "").length();
	
	System.out.println("La frase tiene estas letras sin contar espacios " + sinEspacios);

//c.	Utilizamos un boolean para que nos devuelva true si es digito y false si no
	
	boolean esDigito= Character.isDigit(frase.charAt(0));
	
	System.out.println("El primer caracter es un digito? " + esDigito);
	
//d. 
	
	System.out.println("El primer espacio esta en la posicion: " + frase.indexOf(" "));
	
	
	}

}
