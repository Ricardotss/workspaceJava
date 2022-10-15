
//nao pode instaciar dessa classe, pq é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf; 
	private double salario;

	//metodo sem corpo, nao há implementação
	
	public double getBonificao() {
		
	
	}
	
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double d) {
		this.salario = d;
	}
	
	
	
}
