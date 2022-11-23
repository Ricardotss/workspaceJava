import java.util.Scanner;

public class NomeSobrenome {
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome por favor: ");
		String nome = Scanner.nextLine();
		
		System.out.print("Digite seu sobrenome please: ");
		String sobrenome = Scanner.next();
		
		System.out.println("Bem vindo " + nome +" "+ sobrenome + " !");
	}
}

