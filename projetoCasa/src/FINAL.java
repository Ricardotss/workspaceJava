import java.util.Scanner;

import projetoCasa.Estrutura;

public class FINAL extends Estrutura {

	public static void main(String[] args) {

		Casa casa = new Casa();
		Scanner m = new Scanner(System.in);

			String comodo = "";
			System.out.println("Para sair digite 'sair' ");

			while (!comodo.equals("SAIR") && !casa.getSala().isFlipeLiga()
										  || !casa.getQuarto().isTvLigada())

				System.out.println("Para qual comodo você quer ir ");
				
				boolean existeComodo = true;

				for (Comodos c : Comodos.values()) {

					if (comodo.equals(c.name())) {
						existeComodo = false;
					}
				}

				if (existeComodo == true) {
					System.out.println("Nao existe"); 
					

				} else {

					System.out.println("Você está no " + comodo);
				}
					
					if (comodo.equals("QUARTO")) {

						//boolean lampada() {
						//	return ligalampada();
						
						} casa.getQuarto().ligaTv(comodo, true);
						

					

					if (comodo.equals("SALA")) {

						casa.getSala().LigarFliperama(comodo, true);
						
						

					}
				
	
		System.out.println("--------------------------------------------------------------");
		System.out.println("-------------------Voce está saindo de casa ------------------");
		System.out.println("--------------------------------------------------------------");

		}
}
