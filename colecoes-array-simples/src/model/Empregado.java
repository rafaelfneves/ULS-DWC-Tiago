package model;

public class Empregado {
	
	private String cpf;
	private String nome;
	private Departamento depto;
	
	public Empregado(String cpf, String nome, Departamento dpto) {
		this.cpf = cpf;
		this.nome = nome;
		this.setDepto(depto);
	}
	
	// Get e Set
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	
	
	
	
}
