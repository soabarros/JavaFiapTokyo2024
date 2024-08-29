package logica.aulas.aula05.exercicios;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor em reais");
	double reais = scanner.nextDouble();
	
	System.out.println("Valor em real: " + reais );
	
	
	double dolarAmericano= reais/ 5.64;
	double dolarAmericano2= reais= 0.18;
	System.out.println("Valor em dolar: " + dolarAmericano );
	System.out.println("Valor em reais: " + dolarAmericano2 );
	
	
	
	
	
	
	
}
}
