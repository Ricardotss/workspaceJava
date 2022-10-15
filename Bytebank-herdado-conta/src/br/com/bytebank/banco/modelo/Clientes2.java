package br.com.bytebank.banco.modelo;
import br.com.bytebank.banco.modelo.*;

public class Clientes2 implements Autenticavel { 
	
	
	private AutenticacaoUtil autenticador;
	public Clientes2() {
			this.autenticador = new AutenticacaoUtil();
	}
    private String nome; 
    private String cpf; 
    private String profissao;
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	} 

   
} 