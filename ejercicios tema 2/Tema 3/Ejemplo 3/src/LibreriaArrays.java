import java.util.Arrays;

public class LibreriaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sintaxis para declarar Arrays
		//Declarar un array de 100 enteros
		
		//int []matriz;//asi seria sin tamaño
		int []matriz = new int[10];
		//asi tenemos 100 zonas de memoria tipo int que voy a poder referenciar
		//el primer valor tiene el indice 0, el 2º el 1, etc
		
		System.out.println("Posicion 0 :" + matriz [0]);
		//nunca se trabaja con el nombre de la matriz, siempre matriz y el nº de posicion que quiero q me dfevuelva el valor
		//Si quiero modificar alguno de los valores
		matriz [0]= 9;
		matriz [1]= 19;
		//etc
		// ültimo indice al que podemos acceder, el tamaño -1
		//en este caso el 9
		matriz [9]= 15;
	//matriz [10]= 900; -->ArrayIndexOutOfBoundsException
		
		//array de chars
		
		char[] caracteres = new char [10];
		String carac = "QERQWEREWR";
		//Declarar array e iniciarlizarlo a valores diferentes del por defecto
		
		double d [] = {4.5 , 6.7, 2.3, 7.8, 9.1 };
		//asi le estamos dando valores en la declaracion, por lo que no hace falta ponerle valores
		char []letras = { 'Q', 'W', 'Z' , 'I'};
		String palabras []= {"telefono", "mariposa", "murcielago", "ordenador"};
		
		//El tamaño de un array: length
		
		int tamanhoMatrizd= d.length;
		System.out.println (tamanhoMatrizd);
		
		//Ordenar de menor a mayor un array de enteros
		
		Arrays.sort(d);
		//quiero ver todos los valores de d por consola
		//no puedo poner el nombre del array
		//System.out.println(d); esto no sirve
		// habria que poner la posicion
		
		System.out.println(d[0]+","+d[1]);
		
		System.out.println(Arrays.toString(d));
		
		//Hacer una copia de un Array. ya que al hacer cosas asi se modifican los datos
		
		int original []= {5,1,3,0,25,2,8, 9, 2};
		int copia[]= new int [original.length];//asi tiene el mismo tamaño que el anterior
		int copia2[] = original;
		copia = original;
		
		//si hacemos esto no estamos copiando realmente los arrrays de uno a otro
		//estamos usando la misma memoria a la que aputa la original, por lo que si cambia una cambia la otra
		
		Arrays.sort(original);
		
		System.out.println (Arrays.toString(original));
		System.out.println (Arrays.toString(copia));
		
		int original2 []= {9,8,7,6,5,4,3,2,1};
		int copia3 []= Arrays.copyOf(original2, original2.length);
		//esto genera un array diferente con los mismos valores
		//asi tenemos dos arrays diferentes
		System.out.println (Arrays.toString(original2)); 
		Arrays.sort(original2);
		
		System.out.println("********************");
		System.out.println ("Original2: "+Arrays.toString(original2));
		System.out.println ("copia3 : "+Arrays.toString(copia3));
		
		
		//BynarySearch --> realizar busquedas en Arrays Ordenados.
		
		int array1[]= {8,4,5,7,2,1};
		int valorBuscado= 4;
		//para buscarlo primero tengo que ordenarlo
		Arrays.sort(array1);
		int posicion= Arrays.binarySearch(array1, valorBuscado);
		System.out.println("posicion: "+ posicion);
		//si no esta ordenado no garantiza que funcione bien
		//el 0 es un espacio
		
		//para comparar si dos arrays son iguales --> equals
		
		int a1[]= {1,2};
		int a2[]= {2,1};
		System.out.println(Arrays.equals(a1, a2));
		
		int a3[]= {1,2};
		int a4[]= {1,2};
		System.out.println(Arrays.equals(a3, a4));
		
	}

}
