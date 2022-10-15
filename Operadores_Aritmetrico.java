import java.math.BigDecimal;
import java.util.Scanner;

public class Operadores_Aritmetrico {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("selecione o tipo de conta: (1)Adição (2)Multiplicação (3)Subtração (4)Divisão ");
		int conta = scanner.nextInt();
		
		System.out.print("Informe o primeiro numero");
		int Numero1 = scanner.nextInt();
		
		System.out.print("informe o segundo numero");
		int Numero2 = scanner.nextInt();
	//-----------------------------------------------------------------------------
	
		if (conta == 1 ) {
			System.out.println(	Numero1 + " + " + Numero2 + " = " + (Numero1 + Numero2) );
			
		}  if (conta == 2) {
			System.out.println(Numero1 + " * "+ Numero2 + " = " + (Numero1 * Numero2) );
			
		} if (conta == 3) {
			System.out.println(Numero1 + " - "+ Numero2 + " = " + (Numero1 - Numero2) );
			
		}if (conta == 4) {
			System.out.println(Numero1 + " / "+ Numero2 + " = " + (Numero1 / Numero2) );
		}
		
		
		
	}
		
}
