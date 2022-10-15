import java.util.Scanner;

public class Desconto_Frete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor produto: ");
		double ValorProduto = scanner.nextDouble();
		
		if (ValorProduto >= 100) {
			System.out.println("Valor final + frete gratis: " + ValorProduto);
		} else {
			System.out.println("Valor final + frete: " + (ValorProduto + 15));
		}
		

	}

}
