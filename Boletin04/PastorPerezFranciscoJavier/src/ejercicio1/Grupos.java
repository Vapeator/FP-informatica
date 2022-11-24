package ejercicio1;

public class Grupos {

	private String nombre;

	private int tiempoActuacion;

	private int popularidad;

	private float coste;
	

	
	
//A.	
	public Grupos() {
			super();
		}

//B.
	public Grupos(String nombre, int tiempoActuacion, int popularidad, float coste) {
		//super();
		this.nombre = nombre;
		this.tiempoActuacion = tiempoActuacion;
		setPopularidad(popularidad);
		this.coste = coste;
	}

//C.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoActuacion() {
		return tiempoActuacion;
	}

	public void setTiempoActuacion(int tiempoActuacion) {
		this.tiempoActuacion = tiempoActuacion;
	}

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		
		if(popularidad>10 || popularidad<0) {
			this.popularidad=0;//this.popularidad?
		}else {
			this.popularidad = popularidad;
		}
		
	}

	public float getCoste() {
		return coste;
	}

	public void setCoste(float coste) {
		this.coste = coste;
	}

//D.	
	
	public float precioFinal(float coste) {
		
		float costeTotal;

		costeTotal = coste + ((coste * popularidad) / 100);

		return costeTotal;

	}

//E.	
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", tiempoActuacion=" + tiempoActuacion + ", popularidad=" + popularidad
				+ ", coste=" + coste + ", coste total=" + precioFinal(coste);
	}
	

}
