package projetoCasa;

import java.util.Scanner;

public class Lampada {

	private boolean acesa;

	
	public boolean isAcesa() {
		return acesa;
	}

	public void setAcesa(boolean acesa) {
		this.acesa = acesa;
	}

	public void ligalampada(String comodo) {
		
		System.out.println("Digite 'liga/desliga' para acender ou apagar a luz");

		Scanner p = new Scanner(System.in);
		comodo = p.next().toUpperCase();

			if (comodo.equals("LIGA")) {
				System.out.println("Luz ligada");
	
			} else if (comodo.equals("DESLIGA")) {
				System.out.println("Luz desligada");
	
			}

	}


}
