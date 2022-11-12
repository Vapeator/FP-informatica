package objetos;

public class Cliente {
	
	//Definimos los datos que necesitamos de cada cliente
	String dni; //valor por defecto null
	String nombre;
	private float saldoTotal;//valor por defecto cero,con esto conseguimos que no se pueda acceder directamente a modificar el saldo
	boolean vip;// va a temer false por defecto
	
	//ademas de datos podemos añadir metodos que trabajen con estos datos

	//Constructores: para dar datos iniciales:
	//no tienen tipo de retorno (void)
	//el nombre tiene que ser exactamente igual que la clase
	//este es el constructor de cliente que crea java si yo no añado ninguno
	
	public Cliente() {
		super();
	}
	
	//ejemplo para crear un cliente y q sea vip
	
	public Cliente (float saldo , boolean vip)	{
		saldoTotal= saldo;
		this.vip=vip;// this.nombredelobjeto:para distinguir entre el objeto y el metodo 
		
	}
	
	
	//Interfaz del objeto, metodos publicos	
	// no ponemos static xq se llaman desde el objeto
	
	public float consultaSaldo()	{
		return saldoTotal;
	}
	
	//si alguien quiere modificar el saldo solo lo va a poder hacer con los metodos
	public void quitarDinero(float cantidad) {
	//usamos el metodo para poder acceder al saldo y trabajar con el	
		if (saldoTotal - cantidad >=0)	{
			saldoTotal-=cantidad;
		}
	}
	
	public void ingresarDinero (float cantidad)	{
		
		saldoTotal+=cantidad;
	}
	
	
}
