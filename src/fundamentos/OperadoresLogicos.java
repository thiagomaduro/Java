package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		
		// (&) e (&& [Se o 1º for falso, ele nem olha o segundo]) e (|) ou ( || [igual o &] ) ou
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		// ^ OU exclusivo (^)
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		//Operador unário intruso ---- "!" nega a afirmação da variável acima. 
		System.out.println("Fome = " + !comprouSorvete);
		
		
	}
}
