package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// conversão do kwanza para dólar. sabendo que o cambio é: 1 USD = 400 kz 
		double kw, dolar;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversão de Kwanza para Dólar");
		
		try {
			System.out.print("Digite o valor em Kwanza que deseja converter em Dolár: ");
			kw = scanner.nextDouble();
			dolar = kw * 400.0;
			System.out.printf("O valor de Kwanza em Dólar é %.2f ", dolar);
		} catch (InputMismatchException erro){
			System.out.println("Você digitou um caracter incorreto. Tente novamente! " + erro);
			} 
	

			


		scanner.close();

	}
}
