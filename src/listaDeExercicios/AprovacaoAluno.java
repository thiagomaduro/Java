package listaDeExercicios;

import java.util.Scanner;

public class AprovacaoAluno {
	
	/* Escreva um programa para ler 3 notas de um aluno e informar se
o alunos est� aprovado, reprovado ou se dever� fazer a prova
final.
 O aluno ser� Aprovado a m�dia de suas notas for > 6
O aluno ser� Reprovado se a m�dia de suas notas for < 4
O aluno dever� fazer a prova se a m�dia de suas notas for >= 4 e < 6
M�dia das notas: (Nota1 + Nota2 + Nota3) / 3  */
	
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
				System.out.println("Parab�ns, voc� est� aprovado!");
			}else if(mediaNotas < 4) {
				System.out.println("Voc� est� reprovado. Estude mais!");
			}else if(mediaNotas >=4 && mediaNotas < 6) {
				System.out.println("Voc� est� de recupera��o. Retorne amanh� para fazer uma prova!");
			}
		scanner.close();
		
	}

}
