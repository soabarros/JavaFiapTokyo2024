package logica.aulas.aula05.exercicios;


import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = scanner.nextLine();

		System.out.println("Digite seu gênero");
		String genero = scanner.nextLine();
		
	
		System.out.println("Olá," + nome +"Você escolheu a seguinte opção de gênero:"+ genero);
		
		
		
	}
}
