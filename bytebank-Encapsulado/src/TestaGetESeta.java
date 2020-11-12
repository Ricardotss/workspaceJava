public class TestaGetESeta { 
    public static void main(String[] args) { 
        Conta2 conta = new Conta2(1337, 24226);
        
        System.out.println(conta.getNumero()); 
        
        Clientes2 paulo = new Clientes2();
        //conta.titular = paulo;
        paulo.setNome("Paulo Silveira");
       
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
        //agora em duas linhas:
        Clientes2 titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(Conta2.getTitular());
        
    }

	private static void setProfissao(String string) {
		// TODO Auto-generated method stub
		
	}
    
}