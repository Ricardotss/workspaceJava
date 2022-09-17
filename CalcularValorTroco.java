import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite valor Produto: ");
			Double valorProduto = scanner.nextDouble();
			
			System.out.print("Digite valor cliente");
			Double valorPassadoPeloCliente = scanner.nextDouble();
			
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
			System.out.println("Troco: " + resultado);
	}	
	
	
	
}
