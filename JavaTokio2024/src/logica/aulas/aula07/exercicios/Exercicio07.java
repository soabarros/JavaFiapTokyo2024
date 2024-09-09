package logica.aulas.aula07.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a media da sala");

		double mediadasala = sc.nextDouble();

		int mediamaior = 0;
		int mediamenor = 0;

		for (int i = 1; i < 21; i++) {

			System.out.println("Digite a media do aluno " + i);

			double mediadoaluno = sc.nextDouble();

			if (mediadasala < mediadoaluno) {
				mediamaior++;
			}
			if (mediadasala > mediadoaluno) {
				mediamenor++;
			}
		}
		System.out.println("media menor" + mediamenor);
		System.out.println("media maior" + mediamaior);

	}

}
