import java.util.Scanner;

public class QuadradoAndRaiz {

public static void main(String[] args) {
		
		
		/*
		 * Criar um algoritmo que leia dois n�meros inteiros e imprimir o quadrado do menor n�mero e a raiz
		 * quadrada do maior n�mero, e a mensagem �S�o Iguais� para n�meros iguais:
		 */
		
		Scanner scanner = new Scanner(System.in);
		Double numero1, numero2, maior, menor, quadrado, raizQuadrada;
		
		System.out.println("Digite o valor do n�mero1: ");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do n�mero2: ");
		numero2 = scanner.nextDouble();
		
		if (numero1 < numero2) {
			
			System.out.println("O quadrado do menor �: " + (numero1 * numero1));
			System.out.println("A raiz quadrada do maior �: " + (Math.sqrt(numero2)));
		
			
		} else if(numero1 > numero2){
			
			System.out.println("O quadrado do menor �: " + (numero2 * numero2));
			System.out.println("A raiz quadrada do maior �: " + (Math.sqrt(numero1)));
		
			
		} else {
			
			System.out.println("S�o iguais");
			
		}
		
		
		scanner.close();
	
		
	}

}
