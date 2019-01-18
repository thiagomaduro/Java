package listaDeExercicios;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		/* Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rios inferiores a R$ 500,00. Fa�a
um algoritmo que receba o sal�rio do funcion�rio e mostre o valor do sal�rio reajustado ou uma mensagem,
caso ele n�o tenha direito ao aumento */
		Scanner scanner = new Scanner(System.in);
		double sal, salReajuste;
		
		System.out.println("Informe seu sal�rio: ");
		sal = scanner.nextDouble();
		
		if(sal <= 500) {
			
		salReajuste = sal + (sal * (30.0 / 100.0));
		System.out.println("Seu sal�rio foi reajustado e a partir de hoje voc� receber�: " + salReajuste);
			
		}else {
			System.out.println("Infelizmente n�o podemos reajustar seu sal�rio no momento.");
		}
		
		scanner.close();
	}
}
