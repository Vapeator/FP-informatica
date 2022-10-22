
public class OperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Permite hacer un if else o un if else if en una sola linea
		//Programa que si una variable es >100 la resetea a 0 y si es menor
		//le suma 10
		
		/* asi seria con if else
		 * 
		 * int variable = 200;
		
		if (variable>100) {
			variable=0;
		}
		else {
			variable+=10;
			*/
		int variable = 200;
		
		variable = variable>100 ? 0 : variable +10;
		//condicion ? , si la condicion es cierta escribimos lo que queremos realizar
		// = es el valor que le quiero dar a la variable
		//y lo que queremos es sumarle 10
		
		System.out.println("Variable =" + variable);
		
		//Programa que clasifica una nota como suspenso,aprobado, sobresaliente
		
		String calificacion;
		
		float nota=5.7f;
		
		calificacion = nota < 5 && nota > 0 ? "suspenso" : nota < 7 ? "Aprobado" : "Sobresaliente";
		//si nota menor q 5 y mayor q 0 aprobado
		//menor q 7 y mayor q lo anterior aprobado
		//en caso contrario sobresaliente
		//los : sirven para anidar
		System.out.println("La nota es: " + calificacion);
		// el if else if es mas claro, dice el
		}
	}


