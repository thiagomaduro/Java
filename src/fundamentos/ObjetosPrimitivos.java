package fundamentos;

public class ObjetosPrimitivos {

	public static void main(String[] args) {
		//Letra maiúscula na frente, o primitivo vira objeto.
		//Primitivo carrega apenas os dados e objeto carrega atributos e interações
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(bo.toString().length());
		//ou em vez do "to.String", escreve "true"
		System.out.println("true".length());
		
		
	}
}
