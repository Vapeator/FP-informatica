package tiposDeDatos;
import java.text.DecimalFormat;
//el asterisco lo ponemos para poder usar cualquiera de los java.text.
// quedaria asi import java.text.*;
public class MostrarPorConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=200;
		float f1=4.558f;

		//Mostrar por pantalla texto y variables

		System.out.println("El valor de X1 es: " + x1 + " euros");

		//para  darle formato hay 3 opciones
		// ver en 02 tipos de datos y operadores
		//pag 18


		System.out.printf("el valor de x1 es %.2f", f1);
		//2f son 2 decimales
		// puedo hacer un salto de pantalla asi
		System.out.println ();
		//pero lo normal es poniendo \n despues del %.2f

		System.out.println("el valor de f1 es: " + f1);

		DecimalFormat df=new DecimalFormat("#.##");
		//ctrl+shift+o y te hace todos los import que se necesiten
		String f1bis = df.format(f1);
		System.out.println("f1bis =" + f1bis);
	}

}
