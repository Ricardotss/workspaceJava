
import java.util.Scanner;

public class Calcular_IMC {
	public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in); 
	
	System.out.print("Digite seu Peso: ");
	Double Peso = scanner.nextDouble();
	
	System.out.print("Digite sua altura: ");
	Double altura = scanner.nextDouble();
	
	Double resultado = (double) Math.round( Peso / (altura * altura )); 
	
		
	System.out.println("Seu IMC é: " + resultado );

	
	
}
}
