package ejercicio1;

public class Jugador {
	
//los objetos se pueden relacionar de dos maneras, por composicion o
//por herencia	
	
	private String codigo;
	private String nombre;
	private int puntos;// el tipo de acceso por defecto es de paquete
	private static String competicion;//esto lo añadio al final
	private LocalDate fechaCreacion;//las fechas no entran en el examen
	
	//constructor por defecto
	public Jugador() {
		super();
	}
	
	//Sobrecarga del constructor
	public Jugador (String codigo, String nombre, int puntos) {
		
		//this.codigo=codigo;
		setCodigo(codigo);//llamo al metodo setCodigo para validar el formato
		this.nombre=nombre;
		this.puntos=puntos;
		
	}
	
	//Metodos de acceso
	//::Atributo codigo
	
	public String getCodigo() {
		
		return this.codigo;
		
		
	}
	
	public void setCodigo(String codigo) {
		
		if (codigo.length()==2)	{
			if(Character.isLetter(codigo.charAt(0)) && (Character.isDigit(codigo.charAt(1)){
				
			}
			
		}
		/* podriamos hacer asi tb
		 * codigo.matches("[A-Za-z][0-9]")
		 * this.codigo=codigo;
		 */
	}
	

	@Override//es opcional ponerlo, es para informar al compilador
	
	//Modificaremos el comportamiento del metodo toString
	
	public String toString() {
		return this.nombre+" "+this.codigo+" "+ this.puntos;		
	}
	
	public static String getCompeticion (String competicion) {
		
		return competicion;
	}
	
	public static void setCompeticion (String competicion) {
		Jugador.competicion= competicion;
		
	}
	
	public void actualizarPuntos(int puntos) {
		this.puntos+=puntos;
	}
	
	//Metodo que recibe dos jugadores y devuelve el que tiene mas puntos
	
	public static Jugador comparaPuntos(Jugador j1, Jugador j2) {
		if(j1.getPuntos()>j2.getPuntos()) {
			return j1;
		}else {
			return j2;
		}
	}
	
}
