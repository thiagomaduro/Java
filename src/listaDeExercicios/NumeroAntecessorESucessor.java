package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroAntecessorESucessor {

	public static void main(String[] args) {
		// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
		// antecessor e seu sucessor.
		int numero;
		Scanner ler = new Scanner(System.in);

		try {

			System.out.println("Digite um número: ");
			numero = ler.nextInt();

			System.out.println("O número antecessor de " + numero + " é: " + (numero - 1));
			System.out.println("O número sucessor de " + numero + " é: " + (numero + 1));
		} catch (InputMismatchException erro) {
			System.out.println("Número inválido, tente novamente! " + erro);
		}
		ler.close();
	}

}
