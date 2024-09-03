package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double primeiranota = scanner.nextDouble();

		System.out.println("Digite a segunda nota");
		double segundanota = scanner.nextDouble();

		System.out.println("Digite a terceira nota");
		double terceiranota = scanner.nextDouble();

		System.out.println("Digite a quarta nota");
		double quartanota = scanner.nextDouble();

		double media = ((primeiranota + segundanota + terceiranota + quartanota) / 4);
		System.out.println("Sua media e " + media);

		if (media >= 7) {
			System.out.println("aprovado");
		} else if (media >= 5 && media < 7) {
			
			System.out.println("Em rec");
		}
		if (media<5) {
			System.out.println("Reprov");
		}

		
		
	}

}
