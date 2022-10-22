package bucles;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//el do while siempre se ejecuta al menos una vez, por eso se ejecuta sobre todo
		//si estoy leyendo algo por teclado y quiero saber si esta mal
		
		int i= 100;
				
		do {
			System.out.println( i + " ");
			i++;
		}
		
		while(i<=20);
	}

}
