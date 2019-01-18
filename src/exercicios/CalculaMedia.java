package exercicios;


/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class CalculaMedia {
	
	public static void main(String[] args) {
		
		int media1 = 8;
		int media2 = 9;
		int media3 = 7;
		
		int mediaTotal1 = (media1 + media2 + media3)/3;
				
				System.out.println("A média total de 8, 9 e 7 é equivalente a: " + mediaTotal1);
				
		int media4 = 4;
		int media5 = 5;
		int media6 = 6;
		
		int mediaTotal2 = (media4 + media5 + media6)/3;
				
				System.out.println("A média total de 4, 5 e 6 é equivalente a: " + mediaTotal2);
		
		int mediaDasMedias = (mediaTotal1 + mediaTotal2)/2;
				System.out.println("A média das médias é equivalente a: " + mediaDasMedias);
		
		
	}

}
