
public class GestorFacturas {
	//esta clase va a tener como atributo una matriz de facturas
	//y le voy a añadir todos los metodos que me permitan trabajar con metodos de facturas
	//todos los metodos aqui escritos trabajan con esta matriz de facturas f[]:
	//reduce el acoplamiento entre la clase principal y mis clases
	private Factura f[];
	
	//Constructores
	
	public GestorFacturas() {
		f = new Factura[50];
	}
	
	public GestorFacturas(int capacidad) {
		f = new Factura[capacidad];
	}

	//Metodos de acceso
	//Metodo que permita pasarle una matriz de facturas y asociarsela
	public void setFactura(Factura f[]) {
		this.f=f;
		}
	public Factura[] getFacturas() {
		return this.f;
	}
	//Metodo que permita guardar factura en el gestor
	public boolean guardarFactura(Factura factura) {
		for (int i = 0; i < f.length; i++) {
			if (f[i] == null) {
				// Busca facturas con el mismo codigo
				if (buscarFactura(factura.getCodigo())==true) {
					//throw new exception("Codigo duplicado");
					
					return false;// tb se podria usar un break;
				} else {
					f[i] = factura;
					return true;
				}
			}
		}
		return false;
	}
		
	public float calcularTotalFacturado() {
		float total = 0;
		for (Factura fac : f) {
			if (fac != null) {
				total += fac.getImporte();
			}

		}
		return total;
	}
	
	public void mostrarFacturas() {
		for(Factura fa:f) {
			if(fa!=null) {
				System.out.println(fa);
			}
		}
	}
	
	
	//ahora vamos a crear una clase principal con el gestor de facturas para ver la diferencia
	
	
	public boolean buscarFactura(String codigo) {
		for( Factura factura:f) {
			if(factura!=null) {
				if(factura.getCodigo().equals(codigo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
