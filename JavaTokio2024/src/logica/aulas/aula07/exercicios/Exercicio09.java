package logica.aulas.aula07.exercicios;

import java.util.Scanner;



public class Exercicio09 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
int numero = 0;
	
	System.out.println("Digite o numero ");
	int n = sc.nextInt();
	
	
	for (int i = 0; i < n; i ++) {														
		if (n%i==0) { 
		System.out.println("divisores " + i);
		}
		
	
		System.out.println("numero escolhido "+ i);}


	
	
	
	
	
	
}

}
