package exercicios;

import java.util.Scanner;

public class InformarSaldo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double n;
		Double x;
		
		System.out.printf("Informe seu sal�rio atual: ");
		n = ler.nextDouble();
		
		System.out.printf("Informe o reajuste desejado \u0025 " );
		x = ler.nextDouble();
		
		Double resultado = (n * x)/100;
		
		System.out.println("Seu sal�rio aumentou: " + resultado);
		
		System.out.println("Resumindo, voc� ir� receber a partir do m�s que vem: " + (resultado + n));
		
		
		
		
		
		
	}
}
