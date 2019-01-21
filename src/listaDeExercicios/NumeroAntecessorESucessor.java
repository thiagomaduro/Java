package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroAntecessorESucessor {

	public static void main(String[] args) {
		// Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu
		// antecessor e seu sucessor.
		int numero;
		Scanner ler = new Scanner(System.in);

		try {

			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();

			System.out.println("O n�mero antecessor de " + numero + " �: " + (numero - 1));
			System.out.println("O n�mero sucessor de " + numero + " �: " + (numero + 1));
		} catch (InputMismatchException erro) {
			System.out.println("N�mero inv�lido, tente novamente! " + erro);
		}
		ler.close();
	}

}
