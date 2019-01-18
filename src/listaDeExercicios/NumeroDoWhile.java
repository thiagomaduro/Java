package listaDeExercicios;

import java.util.Scanner;

public class NumeroDoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n, s=0;
		String resp;
		
		do {
			System.out.println("Digite um número: ");
			n = scanner.nextInt();
			
			s += n;
			
			System.out.println("Quer continuar? [S/N] ");
			resp = scanner.next();
		} while(resp.equals("N"));
		
		System.out.println("A soma dos valores é igual a: " + s);
	
		scanner.close();
		
		
		}
	
}
