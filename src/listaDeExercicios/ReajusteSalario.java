package listaDeExercicios;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		/* Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Faça
um algoritmo que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem,
caso ele não tenha direito ao aumento */
		Scanner scanner = new Scanner(System.in);
		double sal, salReajuste;
		
		System.out.println("Informe seu salário: ");
		sal = scanner.nextDouble();
		
		if(sal <= 500) {
			
		salReajuste = sal + (sal * (30.0 / 100.0));
		System.out.println("Seu salário foi reajustado e a partir de hoje você receberá: " + salReajuste);
			
		}else {
			System.out.println("Infelizmente não podemos reajustar seu salário no momento.");
		}
		
		scanner.close();
	}
}
