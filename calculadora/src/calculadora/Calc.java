package calculadora;
import java.util.Scanner;

//calculadora com 4 metodos (cada opera��o), pedindo e retornando valores double
public class Calc {
	
	static double soma(double a, double b) {
		return a+b;		
	}
	
	static double subtracao(double a, double b) {
		return a-b;
	}
	
	static double multiplicacao(double a, double b) {
		return a*b;
	}
	
	static double divisao (double a, double b) {
		return a/b;
	}	
	
	public static void main(String [] args) {		
		double n1 = 0;
		double n2 = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor 1:");
		n1 = s.nextDouble();
		System.out.println("Digite o valor 2:");
		n2 = s.nextDouble();		
		
		System.out.println("Soma: "+ soma(n1,n2)+ 
						"\nSubtra��o: " + subtracao(n1,n2) + 
						"\nMultiplica��o: " + multiplicacao(n1,n2) +
						"\nDivis�o: " + divisao(n1,n2));
		
		s.close();
	}
}
