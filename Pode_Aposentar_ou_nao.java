import java.util.Scanner;

public class Pode_Aposentar_ou_nao {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Idade:");
	Double idade = scanner.nextDouble();
	
	System.out.print("Tempo de contribuição");
	Double TempoContribuicao = scanner.nextDouble();
	
	if (idade >=55 && TempoContribuicao >=25) {
		System.out.println("Pode aposentar :) !!");
	} else {
		System.out.println("Não pode apostentar :(");
	}
	
}
}
