package repaso;

public class Recursividad {

//calcular factorial de un numero
//5!= 5*4*3*2*1
//0! y 1! es = 1

	// private para llamarlo solo desde la propia clase
	// protected para acceder desde clases hijas(esto lo veremos en herencias)

	public static long factorial(int n) {
		long resultado = 1;

		if (n == 0)
			return 1;// esto se puede hacer siempre y cuando en el if solo vaya una linea de codigo
		// lo quiso hacer asi, pero realmente se puede hacer con un if else y ya, sin
		// necesidad del for
		// metiendo el for dentro del else
		for (int i = 1; i <= n; i++) {

			resultado = resultado * i;
		}

		return resultado;
	}

	// ahora lo vemos con recursividad
//siempre tiene que tener un caso q sea base, en este caso n==0
	public static long factorialRecursivo(int n) {
		long f;
		if (n == 0) {
			f = 1;
		} else {
			f = n * factorialRecursivo(n - 1);
			//tb podriamos poner: return n * factorialRecursivo(n - 1);
		}
		return f;
	}
}