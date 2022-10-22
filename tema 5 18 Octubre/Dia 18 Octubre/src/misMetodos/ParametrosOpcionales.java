package misMetodos;

public class ParametrosOpcionales {

	//Metodo para programar un metodo de n valores, pero quiero poder llamarlo
	//independientemente de el numero de valores que le de
	
	public static double calcularMedia(int ob,int... x)	{
//int ob para que al menos me solicite un valor
//puntos suspensivos para indicar que le vamos a pasar un numero variable
//de parametros, DE ESTA FORMA X ES UNA MATRIZ		
		double media, suma=ob;
		if (x.length==0) {
			
			media=suma;
		}else {
			
		
		for (int i=0;i<x.length;i++)	{
			
			suma = suma +x[i];
		}
		
		media=suma/x.length+1;
		//xq la variable ob no la tiene en cuenta hacemos +1
	}
		return media;		
		
	}
	
	
	public static double suma(int x)	{
		return x+10;
		
		}
	
	public static double suma (int...x)	{
//se puede llamar igual q la primera xq tiene un retorno diferente	
		int suma=0;
		for (int i=0; i<x.length;i++)	{
			suma=suma + x[i];
		
	}
		return suma;
	
	}
	
	
	
	
	
	
}
