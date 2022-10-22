package dia28Septiembre;

import java.util.Arrays;

public class Enumerados {

	enum Mes{ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO}
	//enum permite definir un determinado grupo de valores para una variable
	//del que no me puedo salir
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int x = 9;
		
		String mes="Enera";
		
		Mes m=Mes.JUNIO;
		
		TipoTrabajador t1 = TipoTrabajador.ELECTRICISTA;
		System.out.println(TipoTrabajador.values()[0]);
		System.out.println(Arrays.toString(TipoTrabajador.values()));
		
		
	}

}
