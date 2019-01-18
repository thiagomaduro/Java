package exercicios;

import java.util.Scanner;

public class InformarSaldo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double n;
		Double x;
		
		System.out.printf("Informe seu salário atual: ");
		n = ler.nextDouble();
		
		System.out.printf("Informe o reajuste desejado \u0025 " );
		x = ler.nextDouble();
		
		Double resultado = (n * x)/100;
		
		System.out.println("Seu salário aumentou: " + resultado);
		
		System.out.println("Resumindo, você irá receber a partir do mês que vem: " + (resultado + n));
		
		
		
		
		
		
	}
}
