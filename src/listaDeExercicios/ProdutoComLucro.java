package listaDeExercicios;

import java.util.Scanner;

public class ProdutoComLucro {

	public static void main(String[] args) {
		/* Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for
menor que R$ 20,00; caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor
da venda:
		 */
		Double produto;
		Double valorMenor, valorMaior;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		produto = scanner.nextDouble();
		
		if(produto <= 20) {
			
			valorMenor = produto + ( produto * (45.0 / 100.0) );
			
			System.out.println("O valor da venda do produto para o cliente será: " + valorMenor);
		}else if (produto > 20) {
			
			valorMaior = produto + (produto * (30.0/100.0));
			System.out.println("O valor da venda do produto para o cliente será: " + valorMaior);
			
		}
		
		scanner.close();
	}
}
