package control;

import model.Departamento;
import model.Empregado;

public class Programa {

	public static void main(String[] args) {
		Departamento depto = new Departamento("SI", "Sistemas de Informa��o");

		Empregado emp1 = new Empregado("234578", "Jo�o", depto);
		Empregado emp2 = new Empregado("234213", "Maria", depto);
		
		depto.addEmpregado(emp1);
		depto.addEmpregado(emp2);
		
		System.out.println(depto.getListaEmpregados());
	}
}
