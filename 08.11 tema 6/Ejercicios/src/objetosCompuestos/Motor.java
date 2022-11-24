package objetosCompuestos;

public class Motor {

	private int cilindrada;
	private int nivelAceite;
	private boolean diesel;
	
	// para crear el constructor podemos picarlo a mano o ir a Source
	//Generate constructor using fields, y seleccionando los campos que queramos
	//tb podemos construor from superClass
	
	
	public Motor() {//constructor superclass
		//super();//aqui tb se puede quitar de momento
		// TODO Auto-generated constructor stub
	}
	
	
	public Motor(int cilindrada, int nivelAceite, boolean diesel) {
		//super(); se puede quitar SIEMPRE tiene que estar en la primera linea si se pone
		this.cilindrada = cilindrada;
		this.nivelAceite = nivelAceite;
		this.diesel = diesel;
	}



	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public int getNivelAceite() {
		return nivelAceite;
	}


	public void setNivelAceite(int nivelAceite) {
		this.nivelAceite = nivelAceite;
	}


	public boolean isDiesel() {
		return diesel;
	}


	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", nivelAceite=" + nivelAceite + ", diesel=" + diesel + "]";
	}

//ahora vamos a crear la clase coche, para ver como construimos objetos complejos a traves  de objetos mas simples	
	
}
