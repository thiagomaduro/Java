package listaDeExercicios;

import java.util.Scanner;

public class SalarioBruto {
		public static void main(String[] args) {
		/* Escreva um programa efetuar o c�lculo do sal�rio bruto e do sal�rio
		l�quido de um empregado. Os dados fornecidos s�o:
		- O valor do sal�rio hora
		- O n�mero de horas trabalhadas no m�s
		- O percentual de desconto do INSS */
			
		Scanner scanner = new Scanner(System.in);
		double salario, salarioHora, horasTrabalhadas, salarioLiquido;

		
		
		System.out.println("Digite seu sal�rio: ");
		salario = scanner.nextDouble();
		
		salarioHora = (salario / 22) / 8;
		horasTrabalhadas = 22 * 8; //Verificar l�gica depois
		salarioLiquido = salario - (salario * (8.0 / 100));
		System.out.println("Seu sal�rio bruto �: " + salario);
		System.out.println("seu sal�rio l�quido �: " + salarioLiquido );
		System.out.printf("Seu sal�rio por hora � %.2f \n", salarioHora);
		System.out.printf("Suas horas trabalhas s�o %.1f " , horasTrabalhadas);
		
	}
	

	
		
		
	
}
