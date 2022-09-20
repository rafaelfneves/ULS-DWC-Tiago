package model;

public class Aluno {
	
	private String matricula;
	private String nome;
	private String telefone;
	private String endereco;
	private Curso curso;
	
	// Source -> Generate Construtor using Fields
	public Aluno(String matricula, String nome, String telefone, String endereco, Curso curso) 
	{
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.curso = curso;
		this.curso.adicionarAluno(this);
	}

	//Source -> Generate Get e Set
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
