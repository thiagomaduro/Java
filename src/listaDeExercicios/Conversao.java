package listaDeExercicios;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// conversão do kwanza para dólar. sabendo que o cambio é: 1 USD = 400 kz 
		double kw, dolar;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversão de Kwanza para Dólar");
		System.out.print("Digite o valor em Kwanza que deseja converter em Dolár: ");
		kw = scanner.nextDouble();

		dolar = kw * 400.0;

		System.out.println("O valor de Kwanza em Dólar é: " + dolar);

		scanner.close();

	}
}
