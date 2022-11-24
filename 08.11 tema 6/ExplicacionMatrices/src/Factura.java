import java.time.LocalDate;

public class Factura {
	
	private String codigo;// Esta compuesto por 2 letras y 2 digitos, no añade
	//setCodigo xq no quiere que se pueda modificar una vez creada
	private LocalDate fecha;
	private float importe;
	
	
	//Constructores
	//centramos todas las partes del codigo que acceden a lafecha y al codigo para modificarla
	//las metemos en este codigo
	//La verificacion de los datos, puede hacerse a traves de un metodo private (codigo)
	//o directamente a traves de los set (fecha)
	public Factura(String codigo, LocalDate fecha, float importe) {
		//super(); es del siguiente tema
		if(validarCodigo(codigo)) {
			this.codigo=codigo;
		} //si lo dejo asi, crea la factura aunq metamos mas el codigo
		
		//this.codigo = codigo;
		setFecha(fecha);// si quiero q la fecha no sea posterior al dia de hoy, tengo q programarla en set fecha
		this.importe = importe;
	}

	
	//Metodos de Acceso:
	

	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		//verificar que la fecha es anterior o igual al dia de hoy, solo la guarda si se cumple
		if (fecha.isBefore(LocalDate.now())|| fecha.isEqual(LocalDate.now())) {
			this.fecha = fecha;
		}
		
	}


	public float getImporte() {
		return importe;
	}


	public void setImporte(float importe) {
		this.importe = importe;
	}


	public String getCodigo() {
		return codigo;
	}
	
	//generamos el toString
		
	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", fecha=" + fecha + ", importe=" + importe + "]";
	}

	//Metodo privado para dar el formato del codigo que quiero
	
	private boolean validarCodigo(String codigo) {
		
		if (codigo.matches("[A-Za-z]{2}[0-9]{2}")) {
			return true;
		}else {
			return false;
		}
		//tb podria poner 
		//return codigo.matches("[A-Za-z]{2}[0-9]{2}");
		
	}
	
}
