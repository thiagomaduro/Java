package listaDeExercicios;

import java.util.Scanner;

public class LeiaValores {

	public static void main(String[] args) {
		
		/* Fa�a um algoritmo que leia os valores de A, B e C e fa�a a seguinte opera��o de acordo com os valores de
		cada um deles (n�o se esque�a de imprimir o resultado)
		� Se A for o maior: B + C
		� Se B for o maior: A * C
		� Se C for o maior: A - B
		 */
		Double A, B, C;
		Double resultadoA, resultadoB, resultadoC;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = scanner.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = scanner.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = scanner.nextDouble();
		
		if(A > B && A > C) {
			
		resultadoA = B + C;
				System.out.println("O valor de A � maior, ou seja,  B + C �: " + resultadoA);
			
		}else if(B > A && B > C) {
			
		resultadoB = A * C;
		System.out.println("O valor de B � maior, ou seja, A * C �: " + resultadoB);
		
		}else if(C > A && C > B) {
			
			resultadoC = A - B;
			System.out.println("O valor de C � maior, ou seja, A - B � igual a: " + resultadoC);
			
		}else if(A >= B && A >= C) {
			
			System.out.println("Valor n�o aceito");
		}
		
		
		
		scanner.close();
		
	}
}
