package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
	Conta2 conta = new ContaCorrente(123, 321);
	
	conta.deposita(200.0);
	try {
		conta.saca(200.0);
	} catch(SaldoInsuficienteException ex) {
		System.out.println("ex" + ex.getMessage());
		
	}
	
	System.out.println(Conta2.getSaldo()));
	}
}

