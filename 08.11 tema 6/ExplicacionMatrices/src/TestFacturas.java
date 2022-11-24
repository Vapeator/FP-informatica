import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestFacturas {
//si programamos un metodo aqui, solo lo podriamos usar en esta clase
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esta clase va a permitir trabajar con un monton de facturas, para ello creamos una matriz
		
		//Creamos la matriz de facturas:
		
		Factura facturas[]= new Factura [100];
		
		facturas[0]=new Factura ("QW34",LocalDate.now(),345.67f);
		//Guarda en la posicion cero un objeto de tipo factura
		
		facturas[1]= new Factura ("PO45",LocalDate.of(2022, 10, 29),200);
		
		facturas[2]= new Factura ("ty80",LocalDate.of(2022, 11, 12),980);
		
		//Mostrar por pantalla toda la informacion de las facturas
		
		//Usamos un for each, que printe si es diferente de null, osea, solo printa si hay
		//una factura creada en esa posicion
		for (Factura f : facturas) {
			if (f != null) {
				System.out.println(f);
			}
		}

		char opcion;
		boolean salir = false;
		
		do {
			Scanner lector= new Scanner(System.in);
			System.out.println("a. Introducir una nueva factura");
			System.out.println("b. Buscar una factura");
			System.out.println("c. Buscar facturas por fecha");
			System.out.println("d. Eliminar una factura");
			System.out.println("e. Calcular el total facturado");
			opcion= lector.nextLine().charAt(0);
			
			switch(opcion) {
			
			case 'a':
				
				System.out.println("Introduzca el codigo");
				//podriamos hacerlo automaticamente generando una matriz de caracteres
				//y una de digitos y generar aleatoriamente 2 caracteres y 2 digitos
				String codigo= new Scanner(System.in).nextLine();
				//tb podriamos poner String codigo= lector.nextLine();
				System.out.println("Introduzca fecha en formato dd/mm/aaaa");
				String fecha = new Scanner(System.in).nextLine();//
				//para pasar de string a fecha hay que usar dateTimeFormatter
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaFactura= LocalDate.parse(fecha,formatter);
				System.out.println("Introduzca el importe");
				float importe = new Scanner(System.in).nextFloat();
				//ahora que ya tengo los campos del objeto factura,creo el objeto y 
				//lo guardo en la primera posicion vacia
				
				Factura f = new Factura (codigo, fechaFactura, importe);
//Esto compensa meterlo dentro de un metodo:				
				//para guardar en la primera posicion vacia un for
//				for (int i=0;i<facturas.length;i++) {
//					if (facturas[i]==null) {
//						facturas[i]=f;
//						break;
//					}
//				
//			}
				if(MetodosArraysFacturas.guardarFactura(f, facturas)==true) {
					System.out.println("La factura fue guardada con exito");
					MetodosArraysFacturas.mostrarFacturas(facturas);
				}else {
					System.out.println("No hay espacio para esta factura");
				}
				
				
				
				break;
				
			case 'b':
				
				//Buscar una factura a partir del codigo
				System.out.println("Introduzca el codigo de factura");
				String codigoFactura = new Scanner(System.in).nextLine();
				Factura fBuscada= MetodosArraysFacturas.buscarFactura(codigoFactura, facturas);
				if(fBuscada!=null) {
					System.out.println(fBuscada);
				}else {
					System.out.println("La factura no esta en la base de datos");
				}
				
				break;
				
			case 'c':
				//Mostrar facturas de una determinada fecha
				System.out.println("Introduzca la fecha en formato dd/mm/aaaa");
				String fechaBuscada= new Scanner(System.in).nextLine();
				//Pasamos a localDate, lo podriamos haber hecho con un metodo
				
				LocalDate ld= Utiles.pasarStringALocalDate(fechaBuscada);
				
				for ( Factura fac : facturas) {
					if(fac!=null) {
						if(fac.getFecha().isEqual(ld)) {
							System.out.println(fac);
						}
					}else {
						break;
					}
				}
				
				break;
				
			case 'd':
				//Eliminar una factura
				System.out.println("Introuduce codigo de la factura que desea eliminar");
				//creamos un scanner dentro directamente
				String codigoFactura2= new Scanner(System.in).nextLine();
				if(MetodosArraysFacturas.eliminarFactura(codigoFactura2, facturas)==true) {
					System.out.println("Factura eliminada con exito");
					MetodosArraysFacturas.mostrarFacturas(facturas);//para que nos muestre el array
					
				}else {
					System.out.println("No se ha podido eliminar la factura");
				}
				
				break;
				
			case 'e':
				//calcular total facturado
				
				float totalFacturado=0;
				
				for(Factura fa : facturas) {//por cada factura fa en facturas
					if(fa!=null) {
						totalFacturado=totalFacturado+fa.getImporte();
						//totalFacturado+=fa.getImporte();
					}
					/*else{ esto no lo podemos poner xq no puede salir de la matriz al no estar ordenada
					 * break;
					 */
				}
				System.out.println("Total facturado: " + totalFacturado);
				
				break;
				
			case 'f':
				
				salir = true;
				
				break;
				
				default:
					
					System.out.println("Opcion no valida. Vuelva a intentarlo, pulse f para salir");
					
					break;
				
			
			}
			
			
			
		}while(salir==false);
		
	}

}
