package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	static void saudacao() {
		System.out.println("Seja bem-vindo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Seja bem-vindo, "+ nome);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	//CHAMADA DA FUNÇÃO 
	
	saudacao();
	System.out.println();
	
	

}
}