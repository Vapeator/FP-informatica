package objetosCompuestos;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Para poder crear un coche tengo que tener creado un motor
		//2 opciones:
		//Crear el motor primero:
		Motor m1 = new Motor(320,90,false);// asignamos al objeto motor el nivel m1
		
		Coche c1= new Coche ("Porsche", m1); 
		
		
	//Cambiar el nivel de aceite de mi Porsche
		
		c1.getMotor().setNivelAceite(95);
		System.out.println(c1);
		//tb podriamos acceder desde m1 
		m1.setNivelAceite(0);//
		
		//Otra alternativa es usando instanciacion anonima. Crea objetos sin asignarle una referencia
		
		new Motor (320,50,true);// creas un objeto que no esta referenciado en ninguna variable
		//se crea y se pierde, pero se lo podemos pasar al constructor de la clase coche
		// la instanciacion anonima se usa bastante
		//creo una instancia de la clase motor sin asignarle ninguna referencia externa (m1)
		Coche c2= new Coche ("Ferrari", new Motor(350,88,false));
		//lo creamos directamente al crear el coche, sin instanciar
		//de esta forma solo podemos cambiar el aceite asi; xq no tenemos el motor m2 creado, sino que esta dentro del
		//objeto coche:
		
		c2.getMotor().setNivelAceite(92);
		
		
	}

}
