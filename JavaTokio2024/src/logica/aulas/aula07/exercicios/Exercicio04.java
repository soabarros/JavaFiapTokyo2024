package logica.aulas.aula07.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soma = 0;
	
	for (int i = 1; i <= 10; i++) { 
		System.out.println(" Digite o numero " + i);
		int numero =sc.nextInt();
		soma = soma+numero;
	}

	System.out.println("A soma de todos os numeros sao"+soma);
	
	
	
	
}
	
	
	
	
}
