package tiposDeDatos;

public class Enteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Zona de declaracion de variables, es recomendable tenerlas en la misma zona
		//byte b1 si lo ponemos asi no le damos valor, poir lo cual no se puede utilizar
		byte b1 = 0;
		short s1=9;
		int i1 , i2 , i3;
		//asi solo de declara, no se inicializa
		int x1=9,x2=5,x3=8;
		//asi se declara y se inicializa, al darles un valor
		System.out.println(x2);
		//Variable no inicializada ono puede ser utilizada en una instruccion
		//	System.out.println(x2); Si descomentais vereis el fallo
		//Fin de la zona de declaracion de variables
		//esta subrayado en amarillo porque no se estan usando para nada
	
		long l1=900;
		//tb se podria poner asi long l1=900L;
		
		//Modificación de variables
		i1 = 90;
		
		//sumar 1 a la variable x1
		// no se puede usar x1+1; ya que genera un nuevo valor
		// habría que hacer x1=x1+1
		
		x1=x1+1;
		x2=x1+1;
		x3=x2;
		
		//sumarle 1 a b1
		//b1=b1+1;//Si descomentais da error, la explicacion del error 
		//podeis verla en la seccion Promocion numerica de este tema

		
	}

}
