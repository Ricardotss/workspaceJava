import java.util.Scanner;

public class FINAL {

	public static void main(String[] args) {

		Casa casa = new Casa();

			String comodo = "";
			System.out.println("Para sair digite 'sair' ");

			while (!comodo.equals("SAIR")) && !casa.getSala().isFlipeLiga()
											|| !casa.getQuarto().isTvLigada()

				System.out.println("Para qual comodo você quer ir ");
				Scanner p = new Scanner(System.in);
				comodo = p.next().toUpperCase();
				
				boolean existeComodo = true;

				for (Comodos c : Comodos.values()) {

					if (comodo.equals(c.name())) {
						existeComodo = false;
					}
				}

				if (existeComodo == true) {
					System.out.println("Nao existe")				boolean existeComodo = true;
;
				} else {

					System.out.println("Você está no " + comodo);
				}
					
					if (comodo.equals("QUARTO")) {

						casa.getQuarto().ligaTvvalues(comodo, true);

					}

					if (comodo.equals("SALA")) {

						casa.getSala().LigarFliperama(comodo, true);

					}
				
			}
			System.out.println("--------------------------------------------------------------");
			System.out.println("-------------------Voce está saindo de casa ------------------");
			System.out.println("--------------------------------------------------------------");
	}
}
