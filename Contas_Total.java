import java.util.Scanner;

public class Contas_Total {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("valor da conta de luz:");
		Double ContaLuz = scanner.nextDouble();
		
		System.out.print("Valor Conta de água");
		Double ContaAgua = scanner.nextDouble();
		
		System.out.print("Valor Conta de telefone");
		Double ContaTelefone = scanner.nextDouble();
		
		System.out.print("Valor Escola do filho");
		Double EscolaFilho = scanner.nextDouble();
		
		System.out.print("Valor Fatura do cartão");
		Double FaturaCartao = scanner.nextDouble();
		
		System.out.print("Valor Gastos com supermercado");
		Double ValorMercado = scanner.nextDouble();
		
		Double Total = ContaAgua + ContaLuz + ContaTelefone + EscolaFilho + FaturaCartao + ValorMercado;
		
		System.out.println("Total gasto: " + "R$"+Total);
		
		
	}
	
	
}
