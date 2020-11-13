
public class Quarto {

	boolean televisao;
	
		public void liga(String comodo, boolean ligar ) {
		
		System.out.println("Para ligar a TV , escreva 'Liga' ");
			
		
		if (comodo.equals("liga")) {
			System.out.println("Fliperama está ligado");
			
			
		}else if (comodo.equals("desliga")) {
					System.out.println("Fliperama está desligado");
				}
		}
		
			public boolean isTvLigada() {
			return televisao;
			
			}
		
			
		}