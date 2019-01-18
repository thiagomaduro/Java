package controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		 int indice =0;
		 while(indice < 3) {
			 nota = scanner.nextDouble();
			 //soma das notas + 1 (que é o valor da nota)
			 somaDasNotas += nota;
			 indice ++; //incrementar o indice pra chegar a 3
			 
		 }
	scanner.close();
	System.out.printf("A média é %.2f", somaDasNotas / 3);
	}
}
