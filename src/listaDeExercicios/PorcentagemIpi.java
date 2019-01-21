package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PorcentagemIpi {

	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor
		 * das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças
		 * 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 O
		 * algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
		 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 */

		double ipi, valor1, quant1, valor2, quant2;
		Scanner ler = new Scanner(System.in);

		try {
			System.out.print("Digite o valor unitário da peça 1: ");
			valor1 = ler.nextDouble();
			System.out.print("Digite a quantidade de peças 1: ");
			quant1 = ler.nextDouble();
			System.out.print("Digite o valor da peça 2: ");
			valor2 = ler.nextDouble();
			System.out.print("Digite a quanrtidade de peças 2: ");
			quant2 = ler.nextDouble();

			System.out.print("Digite a porcentagem de IPI a ser acrescido: ");
			ipi = ler.nextDouble();

			double result = (valor1 * quant1 + valor2 * quant2);
			ipi = (ipi / 100.0 + 1);
			double total = result * ipi;

			System.out.printf("O valor das peças deu %.2f e o valor de IPI é %.2f e o total a ser pago é %.2f", result,
					ipi, total);
		} catch (InputMismatchException erro) {
			System.out.print("Digite um valor válido!");
		}

		ler.close();
	}
}
