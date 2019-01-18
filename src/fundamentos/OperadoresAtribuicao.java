package fundamentos;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		
		//O valor de A vai ser acrescentado na variavel B
		b+= a; //B = B + A
		b *=4; //B = b * 4
		b /= 2; // B = b / 2
		b -=2; //B = b -2
		b%=2; //modulo (resto)
		
		System.out.println(b);
	}
}
