package ejercicio1;

import java.util.Scanner;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Establecer competicion, esto lo hizo al final
		Jugador.competicion="Torneo regional de Domingueros";
		
		Jugador j1 = new Jugador();
		
		j1.setCodigo("weqwer");
		Jugador j2= new Jugador();
		String codigo;
		Scanner lector= new Scanner (System.in);
		System.out.println("Introduzca el codigo del jugador");
		codigo=lector.next();
		
		Jugador j3= new Jugador (codigo, "Marcos");
		
		System.out.println("Puntos j1: "+ j1.getPuntos());
		System.out.println("Codigo de j1 "+ j1.getCodigo());
		System.out.println("Codigo de j3 "+ j3.getCodigo());
		
		//Mostrar toda la info de j3 por pantalla
		//System.out.println(j3); no podemos hacer esto
		System.out.println("Jugador j3");
		System.out.println(j3.getNombre()+" "+ j3.getCodigo()+ " "+ j3.getPuntos());
		//despues de usar el override podriamos usar esto
		System.out.println(j3.toString());
		System.out.println("Jugador j3");
		System.out.println(j3+" "+j3.getCompeticion()+"Fecha creacion: "+ j3.getFechaCreacion());
		System.out.println("Jugador j2");
		System.out.println(j2+" "+j2.competicion);
		//Metodo hashcode
		//j1=j2;
		System.out.println("Hashcode de j1: "+ j1.hashCode());
		System.out.println("Hashcode de j2: "+ j2.hashCode());
		System.out.println("Hashcode de j3: "+ j3.hashCode());
		
		//Prueba metodo comparaJugadores
		System.out.println("Quien tiene mas puntos j1 o j2?");
		Jugador.comparaPuntos(j1, j2);
		
	}

}
