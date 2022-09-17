import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class UnidadesPorcentagem {

	public static void main(String[] args) {
		
	Scanner Scanner = new Scanner(System.in);
	
		System.out.print("Valor do produto: ");
		BigDecimal valor =  Scanner.nextBigDecimal();
		
		System.out.print("Quantidade do produto: ");
		BigDecimal quantidade = Scanner.nextBigDecimal();
		
		BigDecimal subtotal =  (valor.multiply(quantidade));
		
		int Valor1 = quantidade.compareTo(new BigDecimal(10));
		
		if (Valor1 == 1) { 
			 BigDecimal total = (subtotal.subtract ( (subtotal.multiply(new BigDecimal(10)).divide(new BigDecimal(100)))));
			  System.out.println("Valor Final " + total.round(new MathContext(2)));
		}else {
			System.out.println(("Valor Final: " + subtotal));
		}
			
		
		
	
	}
}
