package fundamentos;

public class ConversaoNumerica {
	
	public static void main(String[] args) {
		//Exemplo 1 - Conversão explicita
		//(float) estou explicita para transformar em float. famoso(cash)
		float f = (float) 0.1;
		System.out.println(f);
		
		//exemplo 2 - Conversão explícita
		int i1 = (int)7.9;
		System.out.println(i1);
		
		//Exemplo 3 - Conversão implicita
		int i2 = 'a';
		System.out.println(i2);
		//vai dar 97 porque o valor do char quando for inteiro é 97.
		
		//Exemplo 4 - Conversão implicita
		double d = 1001;
		System.out.println(d);
	
	}
	

}
