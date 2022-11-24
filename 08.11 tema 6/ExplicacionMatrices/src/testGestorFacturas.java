import java.time.LocalDate;

public class testGestorFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ahora no hace falta crear ninguna matriz, sino directamente trabajamos con el gestor de facturas
//Una vez tengo el gestor no tengo que programar en clases externas, ni hacer bucles ni nada
//asi el codigo queda muy limpio
//x ejemplo, si no queremos poder guardar facturas con el mismo codigo, deberiamos 
//programarlo en GestorFacturas		
		
		GestorFacturas miGestor= new GestorFacturas();
		
		GestorFacturas otroGestor= new GestorFacturas(30);// con el q teniamos sobrecargado con el int
		
		
		//si quiero añadir una factura a un gestor
		try {
			miGestor.guardarFactura(new Factura("QW34",LocalDate.of(2022, 11, 14),900));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			miGestor.guardarFactura(new Factura("SE88",LocalDate.of(2022, 11, 10),1800));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//programamos en GestorFacturas para que no se puedan duplicar los codigos de factura
		try {
			miGestor.guardarFactura(new Factura("SE88",LocalDate.of(2022, 11, 10),1800));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//si quiero mostrar toda la informacion del gestor o el total facturado
		miGestor.mostrarFacturas();
		System.out.println("Total facturado: "+ miGestor.calcularTotalFacturado());
		
		//Un paso a mayores en calidad seria si nuestras clases nos lanzaran excepciones
		//las excepciones las lanza cuando Java no es capaz de obtener algo o no sabe
		//hacer algo. esto se puede hacer con un try catch que hacemos arriba
	}

}
