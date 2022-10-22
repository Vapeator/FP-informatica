package test;

import misMetodos.ParametrosOpcionales;
//Se hace aqui el import
import misMetodos.Metodos1;

public class TestParametrosOpcionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//no puedo ejecutar los metodos definidos en el otro paquete
//para poder usarlos tengo que hacer un import arriba, como si importara
// java.util o scanner lo lo q sea, y podremos usar todos los metodos
// que sean publicos (xq sino solo podria acceder desde ese mismo paquete)
		
		ParametrosOpcionales pa;
		//si no tuviera static tendriamos que crear las variables de este modo, con el nombre
		//de la clase
		//con esto podemos definir nuevas variables, y que funcionalidades tienen
		//esas variables
		//y asi podriamos declararla asi para llamar las funciones:
		
//		pa.calcularMedia(4,5);
		
		Metodos1 m2;
		

	}

}
