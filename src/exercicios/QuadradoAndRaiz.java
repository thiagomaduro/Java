import java.util.Scanner;

public class QuadradoAndRaiz {

public static void main(String[] args) {
		
		
		/*
		 * Criar um algoritmo que leia dois números inteiros e imprimir o quadrado do menor número e a raiz
		 * quadrada do maior número, e a mensagem “São Iguais” para números iguais:
		 */
		
		Scanner scanner = new Scanner(System.in);
		Double numero1, numero2, maior, menor, quadrado, raizQuadrada;
		
		System.out.println("Digite o valor do número1: ");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do número2: ");
		numero2 = scanner.nextDouble();
		
		if (numero1 < numero2) {
			
			System.out.println("O quadrado do menor é: " + (numero1 * numero1));
			System.out.println("A raiz quadrada do maior é: " + (Math.sqrt(numero2)));
		
			
		} else if(numero1 > numero2){
			
			System.out.println("O quadrado do menor é: " + (numero2 * numero2));
			System.out.println("A raiz quadrada do maior é: " + (Math.sqrt(numero1)));
		
			
		} else {
			
			System.out.println("São iguais");
			
		}
		
		
		scanner.close();
	
		
	}

}
