package br.com.bytebank.banco.modelo;
import br.com.bytebank.banco.test.GuardadorDeContas;

public class Teste {

		public static void main(String[] args) {
			GuardadorDeContas guardador = new GuardadorDeContas();
			
			Conta2 cc = new ContaCorrente(22, 11);
			guardador.adiciona(cc);
			
			Conta2 cc2= new ContaCorrente(22, 22);
			guardador.adiciona(cc2); 
			
			int tamanho = guardador.getQuantidadeDeElementos();
			System.out.println(tamanho);
			
			Conta2 ref = guardador.getReferencia(0);
			System.out.println(ref.getNumero());
		
		}
}
