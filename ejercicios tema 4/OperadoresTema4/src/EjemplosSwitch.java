import javax.swing.JOptionPane;

public class EjemplosSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que presente un menu con 4 opciones al usuario
		//1. Ejercicio1
		//2. Ejercicio2
		//3. Ejercicio3
		//...
		//El usuario escoje un ejercicio y se ejecuta.
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un ejercicio: 1, 2, 3 o 4"));
		
		
		
		switch(opcion) {
		
		case 1:
			//Cada caso es un bloque de codigo independiente. si declaramos variables dentro
			//son locales, es decir, no existen si no se ejecuta ese trozo de codigo
			int x=4,y=opcion+5;
			long potencia =(long)Math.pow(x, y);
			System.out.println("Ejercicio 1:");
			//el break se pone para interrumpir la ejecucion del codigo de cada caso
			break;
		case 2:
			//x ejemplo, aqui no existe la vairable x, no podria usarla
			System.out.println("Ejercicio 2:");
			break;
		case 3:
			System.out.println("Ejercicio 3:");
			break;
		case 4:
			System.out.println("Ejercicio 4:");
			break;
			//si no se cumple ninguno de los casos:(es el equivalente al else del if)
			//a diferencia del else no es obligatorio de q vaya al final
		default:
				System.out.println("Error en la opcion escogida");
//lo de las llaves de cierre se puede complicar, por lo que es bueno hacer un comentario
//en cada una de ellas
				
		}//cierre del switch
	
		
	}//Cierre del main


}//cierre de la clase
