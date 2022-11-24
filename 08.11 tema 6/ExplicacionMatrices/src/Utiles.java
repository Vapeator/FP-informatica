import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utiles {
	
	//Metodo que recibe un String y devuelve un localDate
	
	public static LocalDate pasarStringALocalDate(String cadena) {
		
		//Pasar a LocalDate
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaFactura2 = LocalDate.parse(cadena,formatter2);
				return fechaFactura2;
			
	}

}
