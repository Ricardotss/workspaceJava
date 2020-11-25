package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta2 cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta2 cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println(lista.size());
        
        Conta2 ref = (Conta2) lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        System.out.println("Tamanho:" + lista.size());
        
        Conta2 cc3 = new ContaCorrente(23, 131);
        lista.add(cc3);

        Conta2 cc4= new ContaCorrente(33, 223);
        lista.add(cc4);
        
        for(int i = 0; i < lista.size(); i++) {
        	Object oRef = (lista.get(i));
        	System.out.println(oRef);
        }

        	for(Object oRef : lista) {
        		System.out.println(oRef);
        	}
	}

}
