package logica.aulas.aula08.exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio02 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Calendar c = Calendar.getInstance();
	System.out.println("Dia da semana "+ c.get(Calendar.DAY_OF_WEEK));
	
	if ( c.get(Calendar.DAY_OF_WEEK)==3) { 
		System.out.println("Hoje e terça dia de feira ");
		
	}
	else {
		System.out.println("Hoje não e dia de feira ");
	}
	
	
}
}