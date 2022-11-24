package ejercicio1;

import java.time.LocalDate;

public class Jugador {
// hay que tener una zona para los metodos constructores y otras para los metodos y otras para los metodos auxiliares	
//los objetos se pueden relacionar de dos maneras, por composicion o
//por herencia	
	
	//Atributos (Datos) de esta clase
	private String codigo;
	private String nombre;
	private int puntos;// el tipo de acceso por defecto es de paquete
	private static String competicion;//esto lo añadio al final imaginemos que todos ls jugadores tienen q pertenecer a la misma competicion
	// si lo dejo asi es un atributo de instancia, pero yo quiero que todos esten en la misma competicion
	//seria un atributo de clase, no de cada jugador, se los distingue poniendo la palabra static
	//a los atributos de tipo static no se accede desde una referencia, sino desde la propia clase
	private LocalDate fechaCreacion;//las fechas no entran en el examen como es privada necesito set y get
	//no es static xq cada jugador tendrala suya propia, no es de la clase
	

	//constructor por defecto
	public Jugador() {
		super(); // esto lo haria el programa por defecto si yo no lo añado
		fechaCreacion=LocalDate.now(); //esto da el dia de hoy
	}
	
	//Sobrecarga del constructor, normalmente interesa sobrecargarlo
	//para poder añadir datos iniciales a las variables
	
	public Jugador (String codigo, String nombre) {
		
		// para apuntar al atributo no podemos usar codigo=codigo; porque
		//no los distingue, usamos el this. para diferenciar el codig del objeto
		//atributo de la clase del codigo del constructor
		//this.codigo -> atributo clase(los de arriba de todo) = codigo; (el de este metodo constructor)
		
		//this.codigo=codigo;
		setCodigo(codigo);//llamo al metodo setCodigo para validar el formato, que hemos programado
		//en el metodo que esta despues, podriamos programarlos aqui tb, pero es mejor programarlo aparte
		this.nombre=nombre;
		//this.puntos=puntos; xq el ej pone que sin puntos, x lo q el valor inicial sera cero
		//tb se quitan de los parametros del metodo
		fechaCreacion=LocalDate.now();
		
	}
	
	//Metodos de acceso, 
	
//para poder dar formato a lo que quiero añadir
//al codigo, se pone el atributo en privado para no poder acceder
//desde fuera de la clase.
//::Atributo codigo

	//B.
	
	public String getCodigo() {
	//normalmente se llaman get+atributo al que quiero acceder	
	//este metodo me permite leer
		return this.codigo;
		
		
	}

//aqui damos el formato del codigo que queramos establecer
//este es el metodo de escritura por asi decirlo. Solo guardara valores que cumplan con
//lo aqui estipulado. Es el unico trozo de codigo que da acceso a la variable codigo
	public void setCodigo(String codigo) {
		
		if (codigo.length()==2)	{//tiene que tener 2 caracteres
			if(Character.isLetter(codigo.charAt(0)) && (Character.isDigit(codigo.charAt(1)))){
				
				this.codigo=codigo;
				
			}
			
		}
		
		/* podriamos hacer asi tb con expresiones regulares: (q no hay q saberselo, pero viene bien)
		 * if(codigo.matches("[A-Za-z][0-9]")){
		 * 
		 * this.codigo=codigo;
		 * }
		 */
	}
	
//todos los entornos de desarrollo tienen una opcion de generar los set y los get automaticamente
//habria que ir a source -> generate getters and setters, seleccionas los que quieras y le das a generar
			
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//C. lo que dice es q añadas el get puntos pero no el set puntos
	
	public int getPuntos() {
		return puntos;
	}
//D.
	public void actualizarPuntos(int puntos) {
		this.puntos+=puntos;
	}
	
	/*public void setPuntos(int puntos) {// habria que validarlo xq no se pueden poner
	//numeros negativos
		
		
		this.puntos = puntos;
	}*/
	

	//todas las clases de java heredan de la clase object, ahora hacemos el override
	//para poder modificar como funciona el toString
	
	
@Override	
	public String toString() {
	return "Codigo= "+ codigo+ " nombre="+nombre+", puntos= "+puntos;
}
	
	
//tb podriamos generar un toString con el propio entorno. Igual que haciamos con get y set
//Source-> generate toString-> seleccionar los campos que queremos visualizar
//y te genera un toString estandar con lo que le pides:
	
	/*@Override		pordriamos modificarlo como quisieramos
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", puntos=" + puntos + "]";
	}*/

//explicacion static: cada vez que creo un objeto de tipo jugador, se crea en memoria 
// una copia de los valores que tengo definidos en la clase, cada jugador tiene su propio
//codigo nombre y puntos y cada referencia se hace a traves de j1.  j2. o j3.	
	
//Metodos estaticos que me dan acceso a la variable static competicion	
	
	public static String getCompeticion () {
	//dentro del ambito static, no puedo usar el puntero this. xq no depende de un objeto
		
		return competicion;
	}
	
	public static void setCompeticion (String competicion) {
		//este metodo permite modificar la competicion a la q pertenecen los jugadores
	//tampoco podemos usar el this. por lo q hay q llamarlo desde 	
		//por lo q lo llamamos desde el nombre de la clase.atributo
		//tb podriamos hacerlo desde el entorno desde SOurce
		Jugador.competicion= competicion;
		
	}
	
	
	
	//Metodo que recibe dos jugadores y devuelve el que tiene mas puntos
//hay q ponerlo como static xq sino me obliga a crear objetos jugador	
	public static Jugador comparaPuntos(Jugador j1, Jugador j2) {
		if(j1.getPuntos()>j2.getPuntos()) {//puedo usar getPuntos o puntos, xq estoy en la propia clase
			return j1;
		}else {
			return j2;
		}
	}
	
	//para trabajar con feclas LocalTime LocalDate
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/*lo quitamos para que no se modifique despues de crear el jugador
	 * public void setFechaCreacion(LocalDate fechaCreacion) {
	 */
	 //this.fechaCreacion = fechaCreacion;*/
	
	
}
