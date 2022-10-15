public class Conta2 {
    private double saldo;
    private int agencia;
    private int numero;
    private static Clientes2 titular; 
    static int total = 0;
    
    public Conta2(int agencia, int  numero) {
    	
    	Conta2.total++;
    	System.out.println("O total de contas é " + total);
    	this.agencia = agencia;
    	this.numero = numero;
		System.out.println("Estou criando uma conta" + this.numero);
	}
    public void deposita(double valor) {
    	this.saldo += valor;
    }


    public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor; 
    	return true ;
    }
		return false;}

    public boolean transfere(double valor, Conta2 destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    	}
    	return false;
    }

    public double getSaldo() {
		return this.saldo;
    }

    public int getNumero() { 
        return this.numero;
    }

    public void setNumero(int Numero) { 
        this.numero = Numero;
    }    
    	public int getAgencia() {
    		return this.agencia;
    	}
    	public void setAgencia(int agencia)  {
    		if(agencia <= 0) {
    			System.out.println("não pode valor menor igual a zero");
    			return;
    		}
    		this.agencia = agencia;
   }
    	public void setTitular(Clientes2 titular) {
    		Conta2.titular = titular;
    	}
    	
    	public static Clientes2 getTitular() {
			return titular;
    	}
    	
    public static int getTotal() {
    	return Conta2.total;
    }
    	
    
}
