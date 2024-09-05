package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio10 {public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Digite seu salario");
	double salario= scanner.nextDouble();
	
	double aumento1= 0.2;
	double aumento2= 0.15;
	double aumento3 = 0.10;
	double aumento4= 0.05;
	
	double reajuste = 0;
	
	if (salario<=289) {
		reajuste= 0.2;

	} else if (salario >280 && salario<=700) {
		reajuste = 0.15;
		
	} else if (salario>700 && salario <=1500) {
		reajuste = 0.10;
	} else  if (salario>1500) {
		
	}
	
	
	
	
	
	
	if (salario<289) {
		System.out.println("Seu salario antes do reajuste e " + salario);
		System.out.println("");
		System.out.println("O percentual de aumento e de 5%" );
		System.out.println("");
		System.out.println("O valor do aumento.");
		System.out.println("");
		System.out.println("O novo salário");
	}
	
	
	
	
}

}
