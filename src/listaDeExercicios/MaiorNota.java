package listaDeExercicios;

import java.util.Scanner;

public class MaiorNota {

	public static void main(String[] args) {
		/* Escreva um programa para ler 3 notas diferentes de um aluno e informar
o valor da sua maior nota.
Altere este programa para informar tamb�m se a maior nota foi a
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
			System.out.println("Sua maior nota �: " + nota1 + " Ou seja, � sua primeira nota!");
			}else if(nota2 > nota1 && nota2 > nota3) {
				
				System.out.println("Sua maior nota �: " + nota2 + " Ou seja, � a segunda nota!");
			} else if( nota3 > nota1 && nota3 > nota2) {
				System.out.println("Sua maior nota �: " + nota3 + " Ou seja, � a terceira nota!");
			} else if(nota1 == nota2 || nota1 == nota3) {
				System.out.println("Notas repetidas, informe novamente!");
			}
		
		
		
		
	}
}
