package br.com.bytebank.banco.modelo;

//modelo.CalculadorDeImpostos => FQN
public class CalculadorDeImposto {

	
		private double totalImposto;
		
		public void registra (CalculadorDeImposto seguro) {
			Object t;
			double valor = ((Object) t).getValorImposto();
			this.totalImposto += valor;
		}
			public double getTotalImposto() {
				return totalImposto;
			
		}
}
