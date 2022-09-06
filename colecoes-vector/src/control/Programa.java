package control;

import model.Departamento;
import model.Empregado;

public class Programa {

	public static void main(String[] args) {
		Departamento depto = new Departamento("SI", "Sistemas de Informação");

		// Objetos da classe Empregado referenciam um departamento
		Empregado emp1 = new Empregado("234578", "João", depto);
		Empregado emp2 = new Empregado("234213", "Maria", depto);
		
		// Um Objeto da classe Departamento referencia mais de um empregado
		depto.addEmpregado(emp1);
		depto.addEmpregado(emp2);
		
		System.out.println("Capacity: "+depto.getListaEmpregados().capacity());
		System.out.println("Size: "+ depto.getListaEmpregados().capacity());
	}
}
