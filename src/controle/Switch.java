package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String conceito = "";
		int nota;
		System.out.print("Digite sua nota: ");
		nota = scanner.nextInt();

		switch (nota) {
		case 10:
		case 9:
			conceito = "Parab�ns, sua nota est� �tima!";
			break;
		case 8:
		case 7:
			conceito = "voc� passou!";
			break;
		case 6:
		case 5:
			conceito = "Voc� est� em recupera��o!";
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			conceito = "Voc� est� reprovado!";
			break;
		default:
			conceito = null;

		}
		if (conceito != null) {

			System.out.println(conceito);
		} else {
			System.out.println("Nota inexistente. Tente novamente!");
		}
		scanner.close();
	}
}
