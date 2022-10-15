import java.util.Scanner;

import projetoCasa.Estrutura;

public class Sala extends Estrutura {
	

	private static final boolean Fliperama = false;

	public void LigarFliperama(String comodo, boolean ligar) {
		
		boolean Fliperama;
	

		if (comodo.equals("SALA")) {

			System.out.println("Digite 'liga' para ligar o fliperama  ou 'Desliga' para desligar o fliperama");

		}

		
		Scanner p = new Scanner(System.in);
		comodo = p.next().toUpperCase();
		
		if (comodo.equals("LIGA")) {
			System.out.println("Fliperama ligado");

		}
		if (comodo.equals("DESLIGA")) {
			System.out.println("Fliperama desligado "); 
			
		}
		
		getLampada().ligalampada(comodo);
		
	}

	
		

		
		public boolean isFlipeLiga() {
			return Fliperama;

	}
}
