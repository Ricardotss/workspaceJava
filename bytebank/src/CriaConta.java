public class CriaConta { 

    // atributos
    // métodos

    public int saldo;

	public boolean transfere(double valor, CriaConta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

	private void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
}