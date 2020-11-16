import java.util.Scanner;

public class Quarto {

	boolean televisao;
	
		public void ligaTv(String comodo, boolean ligar ) {
			
			

				System.out.println("Digite 'liga' para ligar a televisão  ou 'Desliga' para desligar o Televisão");
				
				Scanner p = new Scanner(System.in);
				comodo = p.next().toUpperCase();

		
		if (comodo.equals("LIGA")) {
			System.out.println("Televisão está ligado");
			
			
		}else if (comodo.equals("DESLIGA")) {
					System.out.println("Televisão está desligado");
				}
		}
		
			public boolean isTvLigada() {
			return televisao;
			
			}
		
			
		}