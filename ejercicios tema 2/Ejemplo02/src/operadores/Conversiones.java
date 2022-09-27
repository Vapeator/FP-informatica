package operadores;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implicitas --> No necesitan codigo adicional
		//Son siempre seguras xq siempre las puedo almacenar en una de mayor tamaño
		
		byte x = 10;
		short y = x;
		float z = 3.4f;
		double d=z;
		
		//Explicitas --> necesitamos añadir codigo
		//No son seguras
		
		int n = 400;
		byte b = (byte) n;//nos obliga a hacer el cast
		System.out.println(b);//x eso da un valor erroneo
	}

}
