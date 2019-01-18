package exercicios;

import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		Double valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextDouble();
		
		Double quadrado = valor*valor;
		System.out.println("O valor ao quadrado é: " + quadrado);
		
		Double cubo = valor*valor*valor;
		System.out.println("O valor ao cubo é: " + cubo);
		
		ler.close();
	}
}
