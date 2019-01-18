package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
	//Tipos primitivos Booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);
		
	//Tipos primitivos caracter 
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		
		System.out.printf("%c %c %c \n", c1, c2, c3);
		
	//Tipos primitivos inteiro
		byte b = 127; //maximo é 127
		short s = 32767; //maximo do short
		int i = 2147483647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b, s, i, l); //%d imprime o valor inteiro
		
	//Tipos primitivos reais (ponto flutuantes)
		float f = 3.1416f; //tenho que declarar o f no final pra mostrar que é um float, caso contrário é double
		double d = 3.45;
		System.out.printf("%f %f\n", f, d);
		//diminuindo as casas decimais uso o .2 (defino 2 casas depois da virgula)
		System.out.printf("%.2f %.1f", f, d);
		
		
}
}
