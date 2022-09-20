package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private int codigo;
	private String nome;
	
	// Criando lista de Alunos
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();

	// Construtor
	public Curso(int codigo, String nome) 
	{
		this.codigo = codigo;
		this.nome = nome;
		this.listaAlunos = new ArrayList<Aluno>();
	}

	// Get e Set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	//
	
	public void adicionarAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void removerrAluno(Aluno aluno) {
		this.listaAlunos.remove(aluno);
	}
}
