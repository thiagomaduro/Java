package listaDeExercicios;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// convers�o do kwanza para d�lar. sabendo que o cambio �: 1 USD = 400 kz 
		double kw, dolar;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Convers�o de Kwanza para D�lar");
		System.out.print("Digite o valor em Kwanza que deseja converter em Dol�r: ");
		kw = scanner.nextDouble();

		dolar = kw * 400.0;

		System.out.println("O valor de Kwanza em D�lar �: " + dolar);

		scanner.close();

	}
}
