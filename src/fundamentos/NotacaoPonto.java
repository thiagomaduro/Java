package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		/** toUpperCase deixa a string com caixa alta.| Replace � trocar a palavra ("A", "B") A pela B.
		concat � para concatenar!
		 */
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
	System.out.println(s);
	}
}
