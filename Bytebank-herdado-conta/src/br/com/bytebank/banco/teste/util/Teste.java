package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Clientes2;
import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	private static final char[] Conta2 = null;

	public static void main(String[] args) {


        Conta2 cc1 = new ContaCorrente(22, 33);
        Clientes2 clienteCC1 = new Clientes2();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta2 cc2 = new ContaPoupanca(22, 44);
        Clientes2 clienteCC2 = new Clientes2();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta2 cc3 = new ContaCorrente(22, 11);
        Clientes2 clienteCC3 = new Clientes2();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta2 cc4 = new ContaPoupanca(22, 22);
        Clientes2 clienteCC4 = new Clientes2();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
        
        
        List<Conta2> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta2 conta2 : lista) {
			System.out.println(Conta2);
		}
        
        NumeroContaComparator comparator = new NumeroContaComparator();
        TitularContaComparator titularComparator = new TitularContaComparator();
        lista.sort(comparator);
         
         System.out.println("================");
         
         for (Conta2 conta2 : lista) {
 			System.out.println(Conta2);
 		}
	}

}

class TitularContaComparator implements Comparator<Conta2> {
	@Override
	public int compare(Conta2 c1, Conta2 c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c1.getTitular().getNome();
		return	nomeC1.compareTo(nomeC2);
		
	}
}



	class NumeroContaComparator implements Comparator<Conta2> {

		@Override
		public int compare(Conta2 c1, Conta2 c2) {
			
			return c1.getNumero() - c2.getNumero();
			
//			if(c1.getNumero() < c2.getNumero()) {
//				return -1;
//			}
//			if(c1.getNumero() > c2.getNumero()) {
//				return 1;
//			}
//			
//			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	