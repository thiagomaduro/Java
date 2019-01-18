package listaDeExercicios;

import java.util.Scanner;

public class DescontoInss {

	public static void main(String[] args) {
		
/*
 * Criar um algoritmo que leia o salário de uma e imprimir o desconto do INSS segundo os dados abaixo:
- menor ou igual a R$ 600 --> isento;
- maior que R$ 600 e menor que R$ 1.200 --> 20%
- maior que R$ 1.200 e menor ou igual a 2.000 --> 25%
- maior que R$ 2.000 --> 30%
 */
		
		Scanner scanner = new Scanner(System.in);
		
		double salario, desc1, desc2, desc3;
		System.out.println("Digite seu salário: ");
		salario = scanner.nextDouble();
		
		if(salario <= 600) {
			
			System.out.println("Você não possui desconto no inss, ou seja, você irá receber: " + salario);
			}else if(salario > 600 && salario < 1200) {
				
					desc1 = salario* (20.0 / 100.0);
					System.out.println("Seu salário possui desconto no INSS de: " + desc1);
				}else if(salario > 1200 && salario < 2000) {
					desc2 = salario*(25.0 / 100.0);
					System.out.println("Seu salário possui desconto no INSS de: " + desc2);
				}else if(salario >= 2000) {
					desc3 = salario*(30.0 / 100.0);
					System.out.println("Seu salário possui desconto no INSS de: " + desc3);
					
				}
		scanner.close();
				
	}
}
