package dia28Septiembre;

import javax.swing.JOptionPane;

public class LecturaJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//JOptionPane abre una consola
		//ctrl+Shitf+O hace el import necesario
		
		float nota= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota: "));
		//este metodo lo devuelve como un String
		//Para convertir ese string a float, hay que usar el wrapper
		//que permite pasar de un String a un Float
		
		System.out.println("La nota introducida es: "+ nota);
		//si usamos coma revienta
		
	}

}
