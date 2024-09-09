package logica.aulas.aula07.exercicios;

import java.util.Scanner;

public class Execicio06 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite numero");
	double numerodigitado= sc.nextDouble();
	
	for (int i = 2; i < numerodigitado; i++) {
		
		if(i%2==0) {
			System.out.println("Numero "+i);
		}
	
}

}
}