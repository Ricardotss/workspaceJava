import java.text.BreakIterator;
import java.util.Scanner;

public class exercicio_Soma_Multiplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Olá, qual operação matematica você deseja : (0)Multiplicação |(1)Adição |(2)Divisão|(3)Subtração");
		Double operacao = scanner.nextDouble();
		
			
		if (operacao <=3) {
		
		System.out.println("Digite o primeiro valor");
		Double PrimeiroValor = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor");
		Double SegundoValor = scanner.nextDouble();
		
		if (operacao == 0) {
			Double Multiplicacao = (PrimeiroValor * SegundoValor);
			
			System.out.println("Seu resultado é: " + Multiplicacao);
			
		}
			
		if(operacao == 1) {
			Double Adicao = (PrimeiroValor + SegundoValor);
			
			System.out.println("Seu resultado é: " + Adicao);
		}
		
		if(operacao == 2) {
			Double Adicao = (PrimeiroValor / SegundoValor);
			
			System.out.println("Seu resultado é: " + Adicao);
		}
		if(operacao == 3) {
			Double Adicao = (PrimeiroValor - SegundoValor);
			
			System.out.println("Seu resultado é: " + Adicao);
		}
	
		scanner.close();
		
		}
		
		if(operacao >= 4) {

			System.err.println("Digite um numero valido");
			
		}
	}

	}


