package exercicios;


/* Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
 */
public class CalculaMedia {
	
	public static void main(String[] args) {
		
		int media1 = 8;
		int media2 = 9;
		int media3 = 7;
		
		int mediaTotal1 = (media1 + media2 + media3)/3;
				
				System.out.println("A m�dia total de 8, 9 e 7 � equivalente a: " + mediaTotal1);
				
		int media4 = 4;
		int media5 = 5;
		int media6 = 6;
		
		int mediaTotal2 = (media4 + media5 + media6)/3;
				
				System.out.println("A m�dia total de 4, 5 e 6 � equivalente a: " + mediaTotal2);
		
		int mediaDasMedias = (mediaTotal1 + mediaTotal2)/2;
				System.out.println("A m�dia das m�dias � equivalente a: " + mediaDasMedias);
		
		
	}

}
