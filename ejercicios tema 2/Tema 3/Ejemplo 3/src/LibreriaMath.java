import java.io.*; //el import se usa aqui
import java.util.*;//el asterisco es para q las coja todas 
public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//la clase random genera nº aleatorio
		Random x =new Random ();
	//	FileReader fr= new FileReader();
		//da error xq no estan en el paquete java.lang
		//si las quiero utilizar tengo que usar el import
		//se usa al principio de tood
		
		//Calcular la raiz cuadrada :math.sqrt(numero);
		int numero = 10;
		//int raiz= Math.sqrt(numero);// da error xq devuelve un dougle
		double raiz = Math.sqrt(numero);
		
		//Calcular potencias: Math.pow(base,exponente)
	//	int potencia = Math.pow(numero,2);
		//si el nº q elevo es decimal puede perder precision, por lo que usariamos dobule
	//	double potencia2= Math.pow(2.5,3)
		
		//redondeo de valores:
		float f1=4.56f;
		int f1Menor= (int) Math.floor(f1);
		System.out.println("fnMenor = "+ f1Menor);
		int f1Mayor = (int) Math.ceil(f1);
		System.out.println("f1Mayor = " + f1Mayor);
		int f1Cercano= Math.round(f1);
		System.out.println("f1Cercano = " + f1Cercano);
	
	//maximo o minimo de dos valores
		
		int x1 = 9, x2= 10 ;
		int menor = Math.min(x1,x2);
		float x3 = 4.5f;
		float menor2 = Math.min(x1, x3);
	// Generar nº aleatorio
		//Math.random genera un numero entre 0 y 1, si lo queremos entre 1 y 10 en entero ponemos asi
		int aleatorio = (int)(Math.random()*10);
		System.out.println(aleatorio);
	//numeros enteros aleatorios con limite
		Random rnd = new Random ();
		int aleatorio1 = rnd.nextInt(20);// aqui ponemos el tope
		System.out.println(aleatorio1);
	}

}
