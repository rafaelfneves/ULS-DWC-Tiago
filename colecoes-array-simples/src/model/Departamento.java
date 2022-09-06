package model;

public class Departamento {

	private String sigla;
	private String nome;
	private Empregado[] listaEmpregados;
	private Empregado gerente;

	public Departamento(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
		this.listaEmpregados = new Empregado[100];
	}

	public void addEmpregado(Empregado novoEmp) {
		for (int i = 0; i < this.listaEmpregados.length; i++) {
			if (listaEmpregados[i] == null) {
				listaEmpregados[i] = novoEmp;
				break;
			}
		}
	}

	public void removeEmpregado(Empregado exEmp) {
		for (int i = 0; i < this.listaEmpregados.length; i++) {
			if (listaEmpregados[i] == exEmp) {
				listaEmpregados[i] = null;
				break;
			}
		}
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

	public Empregado[] getListaEmpregados() {
		return listaEmpregados;
	}

	public void setListaEmpregados(Empregado[] listaEmpregados) {
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
