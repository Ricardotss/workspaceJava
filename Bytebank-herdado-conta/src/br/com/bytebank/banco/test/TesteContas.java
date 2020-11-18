package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import java.lang.*;
 //br.com.bytebank.banco.test.TesteContas


public class TesteContas {
	//java.lang.String
	
	public static void main(String[] args) SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(11, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}

}
