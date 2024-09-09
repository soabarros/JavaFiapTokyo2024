package logica.aulas.aula07.exercicios;

import java.util.Scanner;

public class Exercico08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0;
double soma =0;
		do {
			System.out.println("Digite o numero");
			n = sc.nextDouble();

		} while (n <= 0);

		for (int i = 1; i < n; i++) {
			System.out.println(i);
			soma=soma+i;
		}

		System.out.println("soma e "+ soma);
		
		
	}

}
