package ejercicio1;

import java.util.Scanner;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Establecer competicion, esto lo hizo al final. Se hace desde la clase
		//Jugador.competicion="Torneo regional de Domingueros";//ya no podemos acceder asi
		Jugador.setCompeticion("Torneo Regional de Domingueros");
		
		//hay que utilizar el operador new, para crear un jugador
		//con el constructor
		
		Jugador j1 = new Jugador();
		j1.setCodigo("A3");
		
	//si no pusieramos privado, cualquiera podria modificar la variable del objeto
		//podrian poner j1.codigo="asasdad" sin que cumpliera un formato determinado
		
		j1.actualizarPuntos(10);
		j1.actualizarPuntos(20);//con esto los puntos pasaran a ser 30
		
		Jugador j2= new Jugador();
		j2.setCodigo("A3");
		String codigo;
		Scanner lector= new Scanner (System.in);//esto lo hacemos si 
		//lo queremos meter por consola
		System.out.println("Introduzca el codigo del jugador");
		codigo=lector.next();
		
		Jugador j3= new Jugador(codigo,"Marcos");
		
		
		
		System.out.println("Puntos j1: "+ j1.getPuntos());
		System.out.println("Codigo de j3: " + j1.getCodigo());
		System.out.println("Codigo de j3: " + j3.getCodigo());
		
		
		//Mostrar toda la info de j3 por pantalla
		//System.out.println(j3); no podemos hacer esto
		
		System.out.println("Jugador j3");
		//habria que hacer asi
		System.out.println(j3.getNombre()+" "+ j3.getCodigo()+ " "+ j3.getPuntos());
		
		//despues de usar el override en toString, podriamos usar esto
		System.out.println(j3.toString());
		//tb lo podriamos poner asi
		System.out.println(j3);
		
		System.out.println("Jugador j3");
		//System.out.println(j3+" "+j3.competicion); asi no accedo desde la clase
		//System.out.println(j3+" "+Jugador.competicion);//deberia acceder asi
		//pero primero establezco los metodos de acceso static para poder usarlo desde la clase
		//System.out.println(j3+" "+Jugador.getCompeticion());// si lo dejamos asi llora, xq no puede acceder al valor
		//x lo q hay q usar un metodo static para el set
		//System.out.println(j3+" "+j2.competicion);

		// Metodo hashcode
// todas las referencias que estan apuntando a un objeto, se les asigna un
// codigo
// no puede haber dos referencias con el mismo hashcode, tecnicamente, aunq se
// puede trampear
// todas las variables complejas tienen asociado un codigo hash

// j1=j2; si pusieramos esto, igualando 2 referencias, tendrian el mismo
// hashcode xq apuntan a la misma zona de memoria

		System.out.println("Hashcode de j1: " + j1.hashCode());
		System.out.println("Hashcode de j2: " + j2.hashCode());
		System.out.println("Hashcode de j3: " + j3.hashCode());
		
//cuando un metodo lo quiero ejecutar sin necesidad de crear un objeto, lo pongo como static	
//cuando un metodo lo añado a una clase y es un metodo que no va a trabajar con un objeto en concreto tb le ponemos static		

		System.out.println("Jugador j3");
		System.out.println(j3+" "+Jugador.getCompeticion()+"Fecha creacion: "+ j3.getFechaCreacion());// tienen un .get que se puede usar para obener mes añoy tal
		System.out.println("Jugador j2");
		System.out.println(j2+" "+Jugador.getCompeticion());
		
		
		//Prueba metodo comparaJugadores
		System.out.println("Quien tiene mas puntos j1 o j2?");
		System.out.println(Jugador.comparaPuntos(j1, j2));
		
//los objetos se pueden relacionar de 2 formas: composicion y herencia
//composicion ya lo vimos, objeto esta compuesto por las variables que dimos, codigo nombre etc.
//Herencia es cuando 		
//pag 22 ~ tema, ver resumen conclusiones este tema 6 y el siguiente MUY IMP EXAMEN
		//Que dia se creo el jugador j3
		//objeto jugador compuesto por obj localdate
		int diaCreacion= j3.getFechaCreacion().getDayOfMonth();	
		System.out.println("Dia creacion j3 :"+ diaCreacion);
		
	}

}
