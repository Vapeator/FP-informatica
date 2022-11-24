
public class MetodosArraysFacturas {

	//Metodo que guarda una factura en una matriz de facturas
	
	public static boolean guardarFactura(Factura f, Factura facturas[]) {
		
		for (int i=0;i<facturas.length;i++) {
			if (facturas[i]==null) {
				facturas[i]=f;
				return true;
			}
			
		}
		return false;
	}
	
	//Programamos un metodo que permite visualizar por consola una matriz de facturas
	
	public static void mostrarFacturas(Factura facturas[]) {
		for (Factura f : facturas) {
			if (f != null) {
				System.out.println(f);
			}
		}

	}
	
	//Metodo que busque una factura a partir del codigo
	
	public static Factura buscarFactura(String codigo, Factura fs[]) {
		
		for (Factura f: fs) {
			if(f!=null) {//tenemos q hacer esto para los q no sean null, sino nos va a saltar nullpointerException
				if(f.getCodigo().equals(codigo)) {
					return f;
				}
			}
		}
		return null;
		
	}
	
	//Metodo que elimina factura
	
	public static boolean eliminarFactura(String codigo, Factura fs[]) {
		
		for (int i=0;i<fs.length;i++) {
			if(fs[i]!=null) {//si es diferente de null
				if(fs[i].getCodigo().equals(codigo)) {
					fs[i]=null;
				//reordenar la matriz, pasando todas las posiciones null para el final:	
					return true;
				}
			}
		}
		return false;
		
		
	}
	
	
	
}
