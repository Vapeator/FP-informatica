package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores: +, -, *, /, %, +=, -=, *=, /=, ++, --
		
		int resultado= 8 + 9;
		short x=23000, y=20000;
		int resultado2 = x + y;
		//da problema xq los operadores convierten las variables de short
		//a otro cuando lo hacemos desde short o byte, en este caso a int
		// asi que podria ponerlo como int directamente
		// int resultado2 = x + y
		//o hacer una conversion directamente asi:
		short resultado3= (short) (x + y);
				
		System.out.println("Resultado3 : "+ resultado3);
		// el resultado q da es -22536, poque intenta eliminar los bytes de tipo superior
		//quedando ese resultado inesperado. Eso pasa con todos los operadores matematicos
		// tb pasa con las variables float al pasarlas a int
		
		float r = 4.5f;
		int i= 20;
		//int resultado4 = (int) (r*i);
		float resultado4=r*i;
		//es mejor pasarlo a float directamente
		System.out.println("resultado 4 :" + resultado4);
//si dos valores tienen diferentes tipos de datos, java promocionara
//del mas pequeño al mas grande de los dos
//es decir, si sumo un byte y un short, los convierte a int		
		
		float f1 = 5.6f;
		double d1= 6.7;
		float res5= (float) (f1+d1);
		//asi me llora, tendria que ponerlo asi
		double res6= f1+d1; 
		
//Las variables mas pequeñas byte short y char se convierten en enteros cada vez
// que son utilizadas con estos operadores
						
		byte x2=9;
		short z = 8;
		int res = x2*z;
		int res2 = x2+z;
		int res3 = x2+z;		

// tenemos q ponerlos a int xq se ven afectados x la segunda regla:
// siempre hay dos soluciones, forzar el cast o utilizar directamente el 
// valor de la variable que corresponda, los cast son peligrosos
		
//operador cociente
		
		
		int n1= 10;
		//int resultado7= n1/3;// asi nos va a dar 3, xq int solo es para enteros
		//por lo cual habria que poner en float uno de los operadores
		float resultado7= n1/3f;
		//tb podriamos convertir el n1 asi
		float resultado8=(float)n1/3;
		System.out.println("Resultado7: "+ resultado7);
		int n2= 0 ;
		int resultado9 = 0;
		try {
			resultado9= n1/n2;
		}
		catch (ArithmeticException a) {
			System.out.println("No se puede dividir por cero");
		}//esto es de tema 7, pero es interesante ver try y cathc
		catch (Exception e) {
			System.out.println("No se pudo realizar la division");
		}//esto es de tema 7, pero es interesante ver try y cathc
		double x11= 9,x22=0;
		double resultado10 = x11/x22; 
		
		System.out.println("Resultado10 :" + resultado10);
	//nos da una excepcion de error en tiempo de ejecucion
	//xq no es capaz de divir entre cero
		
//Operador resto:%, nos da el resto de una division entera.
		
		int v1=450;
		int resto = 450 % 3;
		System.out.println("Resto: "+ resto);
		
		
	}
	
}
;