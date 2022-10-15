import java.util.Scanner;

public class Class_Switch {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o numero de acordo com o dia da semana" );
	int numero = scanner.nextInt();
	
	switch (numero){
	case 1: System.out.println( "Segunda"); 
		break;
	case 2: System.out.println("Terça");
		break;
	case 3: System.out.println("Quarta");
		break;
	case 4: System.out.println("Quinta");
		break;
	case 5: System.out.println("Sexta");
		break;
	case 6: System.out.println("Sabado");
		break;
	case 7: System.out.println("Domingo");
		break;
	default: System.err.println("Digite um numero valido");
	
	}
			
			
			
}
}
