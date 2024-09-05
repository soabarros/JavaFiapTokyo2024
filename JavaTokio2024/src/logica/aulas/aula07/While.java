package logica.aulas.aula07;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (i < 5) {
			System.out.println("Ola mundo " + i);
			i++;
		}
		System.out.println("    ");
		int o = 5;
		while (o >= 0) {
			System.out.println("Ola mundo " + o);
			o--;
		}

		String jogar = "sim";
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo");
			System.out.println("Deseja jogar again?");

			jogar = scanner.nextLine();

		}

	}

}
