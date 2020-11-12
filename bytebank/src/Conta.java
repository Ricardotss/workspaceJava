public class Conta { 

    double saldo;
	public String titular;
	// atributos
    // métodos

    public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

	void deposita(double valor) {
		
	}

	public boolean saca(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}