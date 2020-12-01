package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	private static final char[] Conta2 = null;

	public static void main(String[] args) {

		Conta2 cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);
        Conta2 cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);
        Conta2 cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);
        Conta2 cc4 = new ContaPoupanca(22, 22);
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
         lista.sort(comparator);
         
         System.out.println("================");
         
         for (Conta2 conta2 : lista) {
 			System.out.println(Conta2);
 		}
	}

}

	class NumeroContaComparator implements Comparator<Conta2> {

		@Override
		public int compare(Conta2 c1, Conta2 c2) {
			
			if(c1.getNumero() < c2.getNumero()) {
				return -321;
			}
			if(c1.getNumero() > c2.getNumero()) {
				return 1;
			}
			
			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	