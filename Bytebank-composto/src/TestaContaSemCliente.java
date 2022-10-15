
public class TestaContaSemCliente {

		public static void main(String[] args) {
		
		
		ContaDePauDuro contaDaMarcela = new ContaDePauDuro();
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular = "Marcela";
		System.out.println(contaDaMarcela.titular);
		
			
			
				

				}
				
	}
