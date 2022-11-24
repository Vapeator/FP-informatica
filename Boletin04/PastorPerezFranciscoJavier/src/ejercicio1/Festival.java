package ejercicio1;

import java.util.Iterator;

public class Festival {
	
	private String nombre;
	
	private int duracion;
	
	private float costeTotal;
	
	private Grupos programa[];
	
	
	public Festival(String nombre,int capacidad) {
		
		this.nombre=nombre;
		programa=new Grupos[capacidad];
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public float getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(float costeTotal) {
		this.costeTotal = costeTotal;
	}

	public Grupos[] getPrograma() {
		return programa;
	}

	public void setPrograma(Grupos[] programa) {
		this.programa = programa;
	}
	
//G.	
	
	public void addGrupo(Grupos grupo) {
		// Grupos g= new Grupos(nombre, duracion, costeTotal);

		for (int i = 0; i < programa.length; i++) {
			if (programa[i] == null) {
				programa[i] = grupo;
				this.setCosteTotal(i);
				break;
			}

		}

	}
	
	public Grupos dameGrupo(int posicion) {

		for (int i = 0; i < programa.length; i++) {
			 
			if (programa[i].equals(programa[posicion])) {
				
				return programa[i];
						
		}
		
	}
		return null;
	}
	
	/*@Override con este va, pero solo 2 grupos
	public String toString () {
		
		
	
			
		
		
		return  "Festimad. Grupo 1"
				+ "***************************************"
				+ "Nombre: "+ dameGrupo(0).getNombre()  
				+ "Tiempo de actuación:" +dameGrupo(0).getTiempoActuacion()
				+ "Popularidad: "+ dameGrupo(0).getPopularidad()
				+ "Coste: " + dameGrupo(0).getCoste()
				+ "Coste total: " + dameGrupo(0).precioFinal(dameGrupo(0).getCoste())
				+ "***************************************"
				+"Festimad. Grupo 2"
				+ "***************************************"
				+ "Nombre: "+ dameGrupo(1).getNombre()  
				+ "Tiempo de actuación:" +dameGrupo(1).getTiempoActuacion()
				+ "Popularidad: "+ dameGrupo(1).getPopularidad()
				+ "Coste: " + dameGrupo(1).getCoste()
				+ "Coste total: " + dameGrupo(1).precioFinal(dameGrupo(0).getCoste())
				+ "***************************************";
				
				
		}*/
	
	//@Override
	public String toString () {
	for(int x=0;x<programa.length;x++) {
		
		return "Festimad. Grupo "+x
				+ "***************************************"
				+ "Nombre: "+ dameGrupo(x).getNombre()  
				+ "Tiempo de actuación:" +dameGrupo(x).getTiempoActuacion()
				+ "Popularidad: "+ dameGrupo(x).getPopularidad()
				+ "Coste: " + dameGrupo(x).getCoste()
				+ "Coste total: " + dameGrupo(x).precioFinal(dameGrupo(x).getCoste())
				+ "***************************************";
	}
	
	
	
	}
	
}	
	
	
	


