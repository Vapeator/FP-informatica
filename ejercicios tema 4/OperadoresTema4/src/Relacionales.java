
public class Relacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//>,<,>=,<=,== ,!= (distinti que)
		//Devuelven un valor booleano
		
		int x=9, y=5;
		
		boolean condicion1 = x>y;
		boolean condicion2 = x==y;
		boolean condicion3 = x!=y;
		
		System.out.println("Se cumplen las condiciones " + condicion1);
		System.out.println("Se cumplen las condiciones " + condicion2);
		System.out.println("Se cumplen las condiciones " + condicion3);
		
		//Operadores logicos --> Y logico && que se cumplan las dos condiciones
		//O logico --> || -->que se cumpla una u otra
		//No logico--> !-->Negar la condicion
		
		boolean condicion4= condicion1 && condicion2;
		//sera true cuando la 1 y la 2 sean verdaderas
		boolean condicion5= condicion1 || condicion2;
		//sera true si una de las dos es verdadera
		boolean condicion6= !condicion5;
		//niega lo que esta a su derecha, cuando lo que esta a la derecha es false devuelve true 
		//y cuendo es true devuelve false
		
		System.out.println("Se cumplen las condiciones " + condicion4);
		System.out.println("Se cumplen las condiciones " + condicion5);
		System.out.println("Se cumplen las condiciones " + condicion6);
	}

}
