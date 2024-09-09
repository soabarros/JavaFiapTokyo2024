package logica.aulas.aula07.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio05 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double num=0;
	for (int i = 1; i < 13; i++){
		System.out.println("Digite o valor " +i);
		int valor = sc.nextInt();
		
		if(num<valor) {
			num = valor;
		}
	}
	System.out.println("Valor maior e " + num);

	

	}
	
	
	
	
	
	
	
	
	
	
	
		
	}

