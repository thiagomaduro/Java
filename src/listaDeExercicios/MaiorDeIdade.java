package listaDeExercicios;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		
		/*
		 * Criar um algoritmo que leia a idade de uma pessoa e informar: Se é maior de idade (> 18); Se é menor de
		 * idade; Se é maior de 65 anos.
		 */
		
		Double idade;
		Double leiaIdade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diga sua idade: ");
		idade = scanner.nextDouble();
		
		if(idade < 18) {
		System.out.println("Você é menor de idade!");
		
		}else if( idade >= 18 && idade < 65 ) {
			
			System.out.println("Você é maior de idade!");
			
		} else if( idade >= 65  ) {
			
			System.out.println("Você é idoso!");
			
		}
		
		
		scanner.close();
		
		
		
	}
}
