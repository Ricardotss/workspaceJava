package br.com.bytebank.banco.test;

public class Teste {

	//Array []	
	public static void main(String[] args) {
			
		int[] idades = new int[5];	 
		
			int idade1 = 29;
			int idade2 = 39;
			int idade3 = 19;
			int idade4 = 69;
			int idade5 = 59;
			
			int idade = idades[4];
			
			System.out.println(idade4);
			System.out.println(idades.length);
			
			for(int i = 0; i< idades.length; i++) {
				idades[i] = i * i;
			}
			
			for(int i = 0; i< idades.length; i++) {
				System.out.println(idades[i]);
			
		}
	}
}
