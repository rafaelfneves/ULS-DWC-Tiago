package control;

import model.Aluno;
import model.Curso;

public class Programa {
	// ctrl + shift + O (para importar automaticamente a biblioteca necessaria)
	// Ctrl + shift + F (para identar o código)
	// ctrl + barra de espaço + enter (Para criar o main)
	
	public static void main(String[] args) {
		Curso curso1 = new Curso(1, "Java Básico");
		Curso curso2 = new Curso(2, "Java Avançado");
		
		
		Aluno aluno1 = new Aluno ("123","Dio Brando", "12345678","Rua A, n.1°", curso1);
		Aluno aluno2 = new Aluno ("894","Jonathan Joestar", "24512346","Rua B, n.2° ", curso2);
		Aluno aluno3 = new Aluno ("642","Joseph Joestar", "12346712","Rua C, n.3°", curso2);
		Aluno aluno4 = new Aluno ("753","Giorno Giovanna", "23578962","Rua D, n.4°", curso2);
		
		//curso1.adicionarAluno(aluno1);
		
		
		//IMPRIMIR
		
		for(int i=0;i<5;i++) {
			System.out.print(aluno1);
		}
	}
}
