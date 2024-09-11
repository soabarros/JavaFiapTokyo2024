package logica.aulas.aula08.exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicios01 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   
	
	Calendar c = Calendar.getInstance();
	int hora = c.get(Calendar.HOUR_OF_DAY);
	int minuto = c.get(Calendar.MINUTE);
	System.out.println("Digite seu nome");
	String nome = sc.nextLine();
	

 if (hora >=6 && hora<12) {System.out.println("Bom dia, "+ nome);
	 
 }
 else if (hora >=12 && hora < 18) {System.out.println("Boa tarde, "+ nome);
	 
 }
	
 else {
	 System.out.println("Boa noite , "+ nome);
 }
 
 
}
}
