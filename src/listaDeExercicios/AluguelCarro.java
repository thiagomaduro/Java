package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AluguelCarro {

	public static void main(String[] args) {
		/* Fa�a um programa em Java que calcule e exiba o valor do desconto
		 * e o valor a ser pago pelo cliente de v�rios carros. O desconto dever� ser
		 * calculado de acordo com o ano do ve�culo. At� 2000 desconto de 12% e acima de
		 * 2000 desconto de 7%. O sistema dever� perguntar se deseja continuar
		 * calculando novos descontos at� que a resposta seja: "( N ) N�o )". Informar o
		 * total de carros com ano at� 2000 e o total de carros no geral.
		 */

		double valorCarro, valorDesc2000, valorDesc2001, anoVeiculo;
		String resp = new String();
		Scanner scanner = new Scanner(System.in);

		try {
			do {
				System.out.print("Digite o valor do carro que deseja: ");
				valorCarro = scanner.nextDouble();

				System.out.print("Digite o ano do carro: ");
				anoVeiculo = scanner.nextDouble();
				//At� 2000 desconto de 12%
				if (anoVeiculo <= 2000) {
					valorDesc2000 = valorCarro * (12.0 / 100.0);
					System.out.printf("O seu desconto nesse carro � de %.2f \n \n", valorDesc2000);
					// Desconto de 7%
				} else if (anoVeiculo > 2000) {
					valorDesc2001 = valorCarro * (7.0 / 100);
					System.out.printf("O seu desconto nesse carro � de %.2f  \n \n", valorDesc2001);
				}

				System.out.print("Deseja continuar calculando novos desontos? [S/N]");
				resp = scanner.next();
			} while (!resp.equals("n"));
			System.out.println("Obrigado e volte sempre");

		} catch (InputMismatchException erro) {
			System.out.println("Digite um valor v�lido! " + erro);

		}
		scanner.close();

	}
}
