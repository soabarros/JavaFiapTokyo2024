package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade04 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double notaA, notaB;
	
	do { System.out.println("Digite a primeira note");
	notaA=sc.nextDouble();
	} 
	while (notaA <0|| notaA>10);
	
	
	do { System.out.println("Digite a segunda note");
	notaB=sc.nextDouble();
	} 
	while (notaB <0|| notaB>10);
	 System.out.println("A media E "+ ((notaB+notaA)/2)   );
	
	
	
	
	
}

}
