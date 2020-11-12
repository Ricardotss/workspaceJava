public class TesteFuncionario {

        public static void main(String[] args) {
        	
        	Cliente cliente = new Cliente();
        	Cliente.setSalario(3000.0);
        	
        	
        	Gerente nico = new Gerente();
        	nico.setNome("Nico Steppat");
        	nico.setCpf("645352734-9");
        	nico.setSalario(2600.00);
        	
        	System.out.println(nico.getNome());
        	System.out.println(nico.getBonificao());
        	
        	//nico.salario = 3000.0;
          
		}
        }

        