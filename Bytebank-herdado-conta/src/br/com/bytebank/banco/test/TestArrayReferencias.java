package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Clientes2;
import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
  

public class TestArrayReferencias {

        
        	private static final ContaCorrente[] referencias = null;
			private static final br.com.bytebank.banco.modelo.Conta2 Clientes2 = null;
			static Conta2[] contas = new Conta2 [5];

                //int[] idades = new int[5];
        		public static void main(String[] args) {
        			
        			Object [] referencias = new Object[5];
        			
                ContaCorrente cc1 = new ContaCorrente(22, 11);
                referencias[0] = cc1;

                ContaPoupanca cc2 = new ContaPoupanca(22, 22);
                referencias[1] = cc2;

                Clientes2 cliente = new Clientes2();
                referencias[2] = Clientes2;
                
                //System.out.println(cc2.getNumero());

//                Object referenciaGenerica = Contas2[1];
//                
//                System.out.println(referenciaGenerica.getNumero() );

                Conta2 ref = (Conta2) referencias[1];
                System.out.println(cc2.getNumero());
                System.out.println(ref.getNumero());
        }

}