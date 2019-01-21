package listaDeExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PorcentagemIpi {

	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que l�: - a porcentagem do IPI a ser acrescido no valor
		 * das pe�as - o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as
		 * 1 - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 O
		 * algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
		 * F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 */

		double ipi, valor1, quant1, valor2, quant2;
		Scanner ler = new Scanner(System.in);

		try {
			System.out.print("Digite o valor unit�rio da pe�a 1: ");
			valor1 = ler.nextDouble();
			System.out.print("Digite a quantidade de pe�as 1: ");
			quant1 = ler.nextDouble();
			System.out.print("Digite o valor da pe�a 2: ");
			valor2 = ler.nextDouble();
			System.out.print("Digite a quanrtidade de pe�as 2: ");
			quant2 = ler.nextDouble();

			System.out.print("Digite a porcentagem de IPI a ser acrescido: ");
			ipi = ler.nextDouble();

			double result = (valor1 * quant1 + valor2 * quant2);
			ipi = (ipi / 100.0 + 1);
			double total = result * ipi;

			System.out.printf("O valor das pe�as deu %.2f e o valor de IPI � %.2f e o total a ser pago � %.2f", result,
					ipi, total);
		} catch (InputMismatchException erro) {
			System.out.print("Digite um valor v�lido!");
		}

		ler.close();
	}
}
