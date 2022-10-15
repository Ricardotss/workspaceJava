package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Clientes2;
import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	private static Object cc;

	public static void main(String[] args) {

//		Conta2 cc1 = new ContaCorrente(22, 11);
//		Conta2 cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);

		ArrayList<Conta2> lista = new ArrayList();

		Conta2 cc = new ContaCorrente(22, 11);
		Clientes2 cliente = new Clientes2();
		lista.add(cc);

		Conta2 cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta2 cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe >>" + existe);

		for (Conta2 conta : lista) {
			System.out.println(conta);
		}
	}
}
