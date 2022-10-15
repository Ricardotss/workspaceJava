public class TesteSacaNegativo { 
   
	public static void main(String[] args) {
        ContaDePauDuro conta = new ContaDePauDuro();
        conta.deposita(100);
        System.out.println(conta.saca(101));
        System.out.println(conta.saldo);
        
        conta.saldo = conta.saldo - 101;
        System.out.println(ContaDePauDuro.pegaSaldo());
        
        ContaDePauDuro.numero(101);
        
        System.out.println(ContaDePauDuro.pegaSaldo());
        
        ContaDePauDuro.numero = -1322;

	}
}