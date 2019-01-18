package exercicios;

import java.util.Scanner;

public class LeiaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double n, x, z;
		
		
		System.out.printf("qual sua idade em anos: ");
		n = ler.nextDouble();
		
		System.out.printf("Qual sua idade em meses: " );
		x = ler.nextDouble();
		
		System.out.printf("Qual sua idade em dias: " );
		z = ler.nextDouble();
		
		Double resultado = (n * 365)+(x*30) + z;
		System.out.println("Sua idade expressa em dias é: " + resultado);
		
		ler.close();
		
	}
}
