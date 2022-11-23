import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		
		java.util.Scanner Scanner = new Scanner (System.in);
		
		System.out.print("Insira um numero: ");
		Double numero = Scanner.nextDouble();
		
		Double Final = (double) Math.round(numero * numero);
		
		System.out.println("Seu valor é: " + Final);
		
		

	}

}
