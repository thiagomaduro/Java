package listaDeExercicios;

import java.util.Scanner;

//Exercicio apenas para testar switch, sem nexo;
public class SwitchExercicio {
	public static void main(String[] args) {

		int idade;
		String resp = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Diga sua idade: ");
		idade = scanner.nextInt();

		switch (idade) {

		case 10:
		case 9:
			resp = "Voc� � novo";
			break;
		case 8:
		case 7:
		case 6:
			resp = "voc� � crian�a";
			break;
		case 5:
		case 4:
			resp = "Voc� � um beb�";
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			resp = "voc� � um nen�m";
			break;
		default:
			resp = null;
			break;
		}

		if (resp != null) {
			System.out.println(resp);
		} else {
			System.out.println("Voc� � velho");
		}
		scanner.close();
	}

}
