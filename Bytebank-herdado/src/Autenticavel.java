
//contrato Autenticavel 
	//Quem assinar o contrato necessita implementar
//metodo setSenha
//metodo autentica

public abstract interface Autenticavel {
	
	
	
	public abstract void setSenha(int senha);
	
	

		public boolean autentica (int senha);



		double getBonificacao();
		
}

