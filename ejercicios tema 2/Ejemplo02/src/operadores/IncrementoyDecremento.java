package operadores;

public class IncrementoyDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//++ -> Se llaman PostIncremento o Preincremento dependiendo de si estan antes o despues de la variable
		// -- -> PostDecremento o Predecremento
		//suman o restan uno a la variabler sobre la que trabajan
	
	int  x = 10;
	x++; 
	++x;
	x--;
	--x;
	System.out.println("x = "+ x);
//Diferencia entre x++ y ++x
	
	int y = x;
	
	int z = y++;
	//lo mas normal seria hacer asi z=y;
	//int y+=1
	
	int zz=++y;
	
	System.out.println("z :" + z + ", zz : "+ zz);
	//z da 10, porque cuando se pone despues de la variable,
	//primero se hace la asignacion, asi que se modifica despues
	
	
	}

}
