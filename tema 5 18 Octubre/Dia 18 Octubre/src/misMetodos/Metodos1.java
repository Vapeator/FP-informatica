package misMetodos;

public class Metodos1 {
	
	//no creamos el metodo main
	
	//Metodo que recibe un nº y devuelve true si es par
	//public para poder llamarlo desde cualquier clase
	//static xq no viene desde un objeto
	//boolean xq es el tipo de dato	
	//int numero xq es la variable que va a recibir	
	
	public static boolean esPar (int n) {
		if(n %2==0) {
			
			return true;
		}else {
			return false;
		}
	}	
		//para poder ejecutarlo hay que hacerlo desde el metodo main
		
		
		// asi seria con el operador condicional en una sola linea:
		//return numero %2==0 ? true:false;	
		//tb funciona asi, que es la más optima 
		//return numero %2 ==0;
		
//Metodo que devuelve true si un string empieza por numero
		
		public static boolean validarString(String cadena) {
			
			if (Character.isDigit(cadena.charAt(0))) {
				return true;
			}else {
				return false;
			}
			//un error comun es meter un sysout por el medio para probar
			//pero no deberiamos xq sino saltaria el mensaje cada vez q utiliza el metodo
			//para disminuir el acoplamiento
		}
		
		
		//funcion que imprime por pantalla un saludo
		
		public static void saludar ()	{
//es void xq modifica el valor original, pero no le da un valor nuevo
				
			System.out.println("Hola bienvenido!");
		}

//Funcion que recibe un valor y le suma 10		
		
		public static int sumar10(int valor)	{
//no podemos usar void xq las variables primitivas de java pasan por valor
// x lo q copia el valor de la variable que le estoy pasando. Modifica la variable
//q creo en el metodo, no la original, por lo q desaparece la variable valor
			
		return valor+10;
		
		}
		
//Funcion que recibe un array y le suma 10 a su posicion cero
		
		public static void sumar10(int x[]) {
			
//En este caso si q funciona el void xq los arrays trabajan con referencias			
//y no se copia ningun valor, se modifica la referencia original
			
			x[0]+=10;
			
		}

//funcion que recibe un array de enteros y genera un nuevo array
//con la posicion cero incrementada en 10 uds
			
	public static int[] sumar10bis (int x[])	{
// no podemos llamarlo sumar10, xq coincide el nombre Y el tipo de retorno con el de arriba de los Arrays
		
		int nuevo[]= new int [x.length];
		
		for ( int i=0; i<x.length;i++)	{
			
			nuevo[i]= x[i];
	}
		
		nuevo [0]=nuevo[0]+10;
		
		return nuevo;
		
	}
	
	
}





