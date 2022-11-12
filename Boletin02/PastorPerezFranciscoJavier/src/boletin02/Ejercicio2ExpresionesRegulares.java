package boletin02;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Ejercicio2ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String matriz[]= new String[5];
		
		
		int posicion=0;		
		
		
		
		
		for (int j=0;j<matriz.length;j++) {
			
			String mail = JOptionPane.showInputDialog("Introduce un mail");
			
			matriz[j]=mail;
			Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
		     Matcher mat = pat.matcher(mail);
		       if(mat.find()){
		          System.out.println("Correo Válido");
		       }else{
		          System.out.println("Correo No Válido");
		          matriz[j]="ERROR";
		          
		     }

			
	}
		
		System.out.println(Arrays.toString(matriz));	
		
//b.
		
		
		
		String buscarMail=JOptionPane.showInputDialog("Introduzca el mail a buscar");
		
		for (int j=0;j<matriz.length;j++) {
						
			
			if(buscarMail.equals(matriz[j])) {
				
				posicion=j;
				System.out.println("El mail " + buscarMail+ " esta en la posicion "+ posicion);
				
			}
		
		}
		
//c.
		
		String gmail= "@gmail.com";
		String yahoo= "@yahoo.com";
		String hotmail= "@hotmail.com";
		int contadorGmail=0;
		int contadorYahoo=0;
		int contadorHotmail=0;
		
		for (int c=0;c<matriz.length;c++) {
			
			if(matriz[c].endsWith(gmail)) {
				contadorGmail++;
			}if (matriz[c].endsWith(yahoo)) {
				contadorYahoo++;
			}if(matriz[c].endsWith(hotmail)) {
				contadorHotmail++;
			}
			
		}
		
		System.out.println("Hay "+ contadorGmail+ " correos de Gmail");
		System.out.println("Hay "+ contadorYahoo+ " correos de Yahoo");
		System.out.println("Hay "+ contadorHotmail+ " correos de Hotmail");

		
//d. 
		
		
		
		double porcentajeGmail= ((double)contadorGmail/ matriz.length)*100;
		
		double porcentajeYahoo=((double)contadorYahoo/matriz.length)*100;
		
		double porcentajeHotmail=((double)contadorHotmail/matriz.length)*100;
		
		System.out.println("Gmail esta representado en un "+ porcentajeGmail+"%, Yahoo en un "+porcentajeYahoo+"% y Hotmail en un "+porcentajeHotmail+"%");
		
		
		
		
}
}