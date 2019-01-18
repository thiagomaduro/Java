package exercicios; 

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		
		int salarioMinimo = 788;
		Float salarioUsuario;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o seu salário? ");
		salarioUsuario = ler.nextFloat();
		
		Float resultado = salarioUsuario / salarioMinimo;
		
				
		System.out.printf("Você recebe %.2f de salário minimo", resultado );
		
		ler.close();
		
	
	}
}
