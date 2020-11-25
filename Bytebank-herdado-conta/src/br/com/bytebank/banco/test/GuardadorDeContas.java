package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta2;

public class GuardadorDeContas {

		private Conta2 [] referencias;
		private int porsicaoLivre;
		
		public GuardadorDeContas() {
			this.referencias = new Conta2[10];
			this.porsicaoLivre = 0;
		}
		
		public void adiciona(Conta2 ref) {
			this.referencias[this.porsicaoLivre] = ref;
			this.porsicaoLivre++;
			
		}

		public int getQuantidadeDeElementos() {
			return this.porsicaoLivre;
		}

		public Conta2 getReferencia(int pos) {
			return this.referencias[pos];
		}
}
