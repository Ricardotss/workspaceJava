import java.util.Scanner;

public class FINAL {
	
  


	public static void main(String[] args) {
		
		Casa casa = new Casa();
	

		try (Scanner p = new Scanner(System.in)) {
			String comodo = ""; 
			System.out.println("Para sair digite 'sair' ");
			
			
		


			while (!comodo.equals("SAIR")) {
				
				System.out.println("Para qual comodo você quer ir ");
				boolean existeComodo = false;
				
				comodo = p.next().toUpperCase();

				for (Comodos c : Comodos.values()) {
					if (comodo.equals(c.name())) {
						existeComodo = true;
					}
				}

				if (existeComodo == false) {
					System.out.println("Nao existe corno");
				} else {
					
					System.out.println("Você está no " + comodo);
					
					
					
					if (comodo.equals("Quarto")) {
						
						casa.getQuarto().liga(comodo, true);
						
					}
					
				}
			}
		}
	}
}
		