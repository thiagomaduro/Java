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
			resp = "Você é novo";
			break;
		case 8:
		case 7:
		case 6:
			resp = "você é criança";
			break;
		case 5:
		case 4:
			resp = "Você é um bebê";
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			resp = "você é um neném";
			break;
		default:
			resp = null;
			break;
		}

		if (resp != null) {
			System.out.println(resp);
		} else {
			System.out.println("Você é velho");
		}
		scanner.close();
	}

}
