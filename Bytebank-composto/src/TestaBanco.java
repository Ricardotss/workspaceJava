
public class TestaBanco {

	public static void main(String[] args) {
			Cliente paulo = new Cliente();
			paulo.cpf = "232-325-678-32";
			paulo.profissao = "programador";
			
			ContaDePauDuro contaDoPaulo = new ContaDePauDuro();
			contaDoPaulo.deposita(100);
			
			contaDoPaulo.titular = paulo;
			System.out.println(contaDoPaulo.titular);
			System.out.println(contaDoPaulo.titular);
			System.out.println(paulo);
			
			
	}
}
