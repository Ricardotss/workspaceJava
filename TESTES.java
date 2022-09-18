import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class TESTES {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String Nome = Scanner.next();
		
		System.out.print("Digite sua idade: ");
		double Idade = Scanner.nextDouble();
		
		
		System.out.println("Seu nome é " + Nome + ", sua idade é " +Idade );
		
	}

}
