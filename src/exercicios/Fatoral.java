package exercicios;

public class Fatoral {

	public static void main(String[] args) {
		//Fatorial de 1 � 10.
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("O fatorial de " + i + " = " + fatorial);
		}
		
	}
}
