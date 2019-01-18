package listaDeExercicios;

import java.util.Scanner;

public class AprovacaoAluno {
	
	/* Escreva um programa para ler 3 notas de um aluno e informar se
o alunos está aprovado, reprovado ou se deverá fazer a prova
final.
 O aluno será Aprovado a média de suas notas for > 6
O aluno será Reprovado se a média de suas notas for < 4
O aluno deverá fazer a prova se a média de suas notas for >= 4 e < 6
Média das notas: (Nota1 + Nota2 + Nota3) / 3  */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, nota3, mediaNotas;
		
		System.out.println("Digite sua primeira nota desse semestre: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("Digite sua segunda nota desse semestre: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("Digite sua terceira nota desse semestre: ");
		nota3 = scanner.nextDouble();
			
		mediaNotas = (nota1 + nota2 + nota3) / 3;
		
			if(mediaNotas > 6) {
				System.out.println("Parabéns, você está aprovado!");
			}else if(mediaNotas < 4) {
				System.out.println("Você está reprovado. Estude mais!");
			}else if(mediaNotas >=4 && mediaNotas < 6) {
				System.out.println("Você está de recuperação. Retorne amanhã para fazer uma prova!");
			}
		scanner.close();
		
	}

}
