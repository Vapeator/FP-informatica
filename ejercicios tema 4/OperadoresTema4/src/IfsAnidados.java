
public class IfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que me detecte si un numero es multiplo de 3 y de 5
		
				int numero=15;
				//Lo del %3==0 significa que lo divides entre 3 y el resto da cero
				
				if(numero %3==0 && numero % 5 == 0) {
					
					System.out.println("Multiplo de 3 y 5");
				}
				else  {
					
					System.out.println("No es multiplo de 3 y 5 a la vez");
				}
				//ahora anidamos ifs
				if (numero %3 == 0) {
					if(numero %5== 0) {
						//Numero multiplo de 3 y de 5
					System.out.println("Multiplo de 3 y de 5");				
					}		
					else {
						//Este else va con el primer if, los else se ejecutan con los ordenes de los if
						System.out.println("Multiplo de 3 y no de 5");
					}
				}
				else {
					if(numero%5 ==0) {
						System.out.println("Multiplo de 5 pero no de 3");
					}else	{
						System.out.println("multiplo ni de 3 ni de 5");
					}
						//para comprobar paso por paso, podemos establecer un punto de ruptura,
					//damos doble click en la fila que sea, vamos a Run- debug
				}
	}

}
