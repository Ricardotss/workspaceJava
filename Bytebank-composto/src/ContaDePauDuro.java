public class ContaDePauDuro<Cliente>{
	
    static double saldo; 
    int agencia;
    static int numero;
    Cliente titular;

    public void deposita(double valor) {
    	ContaDePauDuro.saldo += valor;
    }
    
 
    public boolean saca(double valor) {
    	return true;
    }

    public boolean transfere(double valor, ContaDePauDuro destino, ContaDePauDuro origem)  {
    	return true;
    }

    public static double pegaSaldo() {
        return saldo;
    }


	public static void numero(int i) {
		// TODO Auto-generated method stub
		
	}
    
}