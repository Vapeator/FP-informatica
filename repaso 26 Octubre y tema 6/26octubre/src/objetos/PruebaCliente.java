package objetos;

import java.util.Scanner;

public class PruebaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//me reconoce las variables creadas en cliente
		//en cada clase puedo definir una nueva variable
		//y despues crear los objetos
		//la clase es el molde y el objeto es lo que voy a cargar con datos
		
		
		Cliente c= new Cliente();
		//podemos crear tantos clientes como queramos
		Cliente c2=new Cliente();
		Cliente c3= new Cliente (10000, true);
		
		//acceder a los atributos del objeto referenciado por c
		//usaremos el operador punto.
		System.out.println("Datos del cliente: ");
		System.out.println("Nombre: "+c.nombre);
		System.out.println("Saldo : "+ c.consultaSaldo());
		System.out.println("VIP : "+c.vip);
		
		
		//modificar datos del cliente
		
		c.nombre="Pedro";
		c.dni="12345678R";
		
		//aumentar el saldo
		c.ingresarDinero(1000);//para quitar saldo de la cuenta
		//bajar saldo
		c.quitarDinero(2300);
		
		System.out.println("Nuevo saldo " + c.consultaSaldo());
		//Modificar datos de c2
		
		Scanner lector =new Scanner (System.in);
		
		System.out.println("Introduzca el nombre del cliente");
		c2.nombre= lector.next();
		System.out.println("Introduzca el dni del cliente");
		c2.dni= lector.next();
		System.out.println("Introduzca el ingreso del cliente");
		c2.ingresarDinero(lector.nextInt());
		
	}

}
