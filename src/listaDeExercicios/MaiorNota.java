package listaDeExercicios;

import java.util.Scanner;

public class MaiorNota {

	public static void main(String[] args) {
		/* Escreva um programa para ler 3 notas diferentes de um aluno e informar
o valor da sua maior nota.
Altere este programa para informar também se a maior nota foi a
primeira, a segunda ou a terceira. */
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, nota3;
		
		System.out.println("informe sua primeira nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("Informe sua segunda nota: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("nforme sua terceira nota: ");
		nota3 = scanner.nextDouble();
		
		if(nota1 > nota2 && nota1 > nota3) {
			System.out.println("Sua maior nota é: " + nota1 + " Ou seja, é sua primeira nota!");
			}else if(nota2 > nota1 && nota2 > nota3) {
				
				System.out.println("Sua maior nota é: " + nota2 + " Ou seja, é a segunda nota!");
			} else if( nota3 > nota1 && nota3 > nota2) {
				System.out.println("Sua maior nota é: " + nota3 + " Ou seja, é a terceira nota!");
			} else if(nota1 == nota2 || nota1 == nota3) {
				System.out.println("Notas repetidas, informe novamente!");
			}
		
		
		
		
	}
}
