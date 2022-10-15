
public class TestaValores {

		public static void main(String[] args) {
			int total = 0;
			Conta2 conta2 = new Conta2(1337, 24226);
			total++;
			
			System.out.println(conta2.getAgencia());
			
			conta2.setAgencia(1232123);
			
			Conta2 conta3 = new Conta2(1337, 16549);
			
			System.out.println(conta2.total);
			
			System.out.println(conta2.getTotal());
		}
}
