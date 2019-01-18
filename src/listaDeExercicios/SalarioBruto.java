package listaDeExercicios;

import java.util.Scanner;

public class SalarioBruto {
		public static void main(String[] args) {
		/* Escreva um programa efetuar o cálculo do salário bruto e do salário
		líquido de um empregado. Os dados fornecidos são:
		- O valor do salário hora
		- O número de horas trabalhadas no mês
		- O percentual de desconto do INSS */
			
		Scanner scanner = new Scanner(System.in);
		double salario, salarioHora, horasTrabalhadas, salarioLiquido;

		
		
		System.out.println("Digite seu salário: ");
		salario = scanner.nextDouble();
		
		salarioHora = (salario / 22) / 8;
		horasTrabalhadas = 22 * 8; //Verificar lógica depois
		salarioLiquido = salario - (salario * (8.0 / 100));
		System.out.println("Seu salário bruto é: " + salario);
		System.out.println("seu salário líquido é: " + salarioLiquido );
		System.out.printf("Seu salário por hora é %.2f \n", salarioHora);
		System.out.printf("Suas horas trabalhas são %.1f " , horasTrabalhadas);
		
	}
	

	
		
		
	
}
