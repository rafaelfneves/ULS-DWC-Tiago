package model;

import java.util.Vector;

public class Departamento {

	private String sigla;
	private String nome;
	private Vector listaEmpregados;
	private Empregado gerente;

	public Departamento(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
		this.listaEmpregados = new Vector();
	}

	public void addEmpregado(Empregado novoEmp) {
		this.listaEmpregados.add(novoEmp);
	}

	public void removeEmpregado(Empregado exEmp) {
		this.listaEmpregados.remove(exEmp);
		listaEmpregados.capacity();
	}
	// ==========================================================
	// Get Set

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Vector getListaEmpregados() {
		return listaEmpregados;
	}

	public void setListaEmpregados(Vector listaEmpregados) {
		this.listaEmpregados = listaEmpregados;
	}

	public Empregado getGerente() {
		return gerente;
	}

	public void setGerente(Empregado gerente) {
		this.gerente = gerente;
	}

	// =======================================================
}
