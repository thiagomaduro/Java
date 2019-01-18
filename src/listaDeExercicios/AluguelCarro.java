package listaDeExercicios;

import java.util.Scanner;

public class AluguelCarro {

	public static void main(String[] args) {
		/*
<<<<<<< HEAD
		 * Faça um programa em Java que calcule e exiba o valor do desconto e o valor a
		 * ser pago pelo cliente de vários carros. O desconto deverá ser calculado de
		 * acordo com o ano do veículo. Até 2000 desconto de 12% e acima de 2000
		 * desconto de 7%. O sistema deverá perguntar se deseja continuar calculando
		 * novos descontos até que a resposta seja: "( N ) Não )". Informar o total de
		 * carros com ano até 2000 e o total de carros no geral.
		 */

		double valorCarro, valorDesc2000, valorDesc2001, anoVeiculo;
		String resp = new String();
		Scanner scanner = new Scanner(System.in);

		while (!resp.equals("n")) {
			System.out.print("Digite o valor do carro que deseja: ");
			valorCarro = scanner.nextDouble();

			System.out.print("Digite o ano do carro: ");
			anoVeiculo = scanner.nextDouble();

			if (anoVeiculo <= 2000) {
				valorDesc2000 = valorCarro * (12.0 / 100.0);
				System.out.printf("O seu desconto nesse carro é de %.1f \n \n", valorDesc2000);
			} else if (anoVeiculo > 2000) {
				valorDesc2001 = valorCarro * (7.0 / 100);
				System.out.printf("O seu desconto nesse carro é de %.1f  \n \n", valorDesc2001);
			}
			
			System.out.print("Deseja continuar calculando novos desontos? [S/N]");
			resp = scanner.next();
			}
		System.out.println("Obrigado e volte sempre");

		scanner.close();
=======
		 * Faça um programa em Java que calcule e exiba o valor do desconto e o valor a ser 
		 * pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com 
		 * o ano do veículo. Até 2000 desconto de 12% e acima de 2000 desconto de 7%.
		 * O sistema deverá perguntar se deseja continuar calculando novos descontos 
		 * até que a resposta seja: "( N ) Não )". 
		 * Informar o total de carros com ano até 2000 e o total de carros no geral. */
		
		double valorCarro, valorDesc2000, valorDesc2001, anoVeiculo;
		String resp;
		int resul, valorPago = 0;
		int veiculo = 0;
		Scanner scanner = new Scanner(System.in);
		
		
			do{
				/* System.out.println("Digite o valor do carro que deseja: ");
				valorCarro = scanner.nextDouble();
				
				valorPago += valorCarro;
				*/
				System.out.println("Digite o ano do carro: ");
				anoVeiculo = scanner.nextDouble();
				
				veiculo+=anoVeiculo;
				
				
					if(anoVeiculo <= 2000) {
						
					//	valorDesc2000 = valorCarro * (12.0 / 100.0);
						//System.out.printf("O seu desconto nesse carro é de %.1f \n ", valorDesc2000 );
				}else if(anoVeiculo > 2000) {
					
						//valorDesc2001 = valorCarro * (7.0 / 100);
						//System.out.printf("O seu desconto nesse carro é de %.1f  \n ", valorDesc2001);
						} 
					System.out.println("Quer continuar? [S/N]");
					resp = scanner.next();
				} while(resp.equals("S"));
				System.out.println("Obrigado e volte sempre");
					
				
				
			scanner.close();
		
		
>>>>>>> cfe8d30a25795d18d8b498d6c6cfed76434e923d
	}
}
