package exercicios; 

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		
		int salarioMinimo = 788;
		Float salarioUsuario;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o seu sal�rio? ");
		salarioUsuario = ler.nextFloat();
		
		Float resultado = salarioUsuario / salarioMinimo;
		
				
		System.out.printf("Voc� recebe %.2f de sal�rio minimo", resultado );
		
		ler.close();
		
	
	}
}
