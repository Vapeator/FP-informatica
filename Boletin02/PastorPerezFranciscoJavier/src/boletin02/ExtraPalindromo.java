package boletin02;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ExtraPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String frase =JOptionPane.showInputDialog("Escriba su frase:");
		
		frase = frase.replace(" ", "");
		
		String frase2[] = frase.split("");
		
		int y = 0;
		
		int x ;
		
		String fraseInversa [] = Arrays.copyOf(frase2,frase2.length) ;
		
				
		for(x=frase2.length-1;x>-1;x--, y++ ) {
			
			fraseInversa[x] = frase2[y];
		
			
		}
		System.out.println(Arrays.toString(frase2));
		
		System.out.println(Arrays.toString(fraseInversa));
		
		System.out.println("Es un palíndromo?  " + Arrays.toString(frase2).equals(Arrays.toString(fraseInversa)));

	}

}
