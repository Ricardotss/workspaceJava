package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInterger {
	
		public static void main(String[] args) {
			
			
			int idade = 29; 
			Integer idadeRef = Integer.valueOf(29);
			System.out.println(idadeRef.doubleValue());
			
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			
			System.out.println(Integer.SIZE);
			System.out.println(Integer.BYTES);
			
			
			
			String s = args[0];
			
			
			int numero = Integer.parseInt(s);
			System.out.println(numero);
		}

}
