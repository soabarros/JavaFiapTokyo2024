package logica.aulas.aula05.exercicios;

import java.util.Scanner;

public class Exercicio6 {public static void main(String[] args) {
	    
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a peca");
	String nome= scanner.nextLine();
	double peca1 = 10.5;
	

	System.out.println("O valor de cada peca e " + peca1);
	

	System.out.println("Digite a quantidade de pecas");
	int quantidade= scanner.nextInt();
	System.out.println("Sua peca e "+ nome +". "+ "sao "+ quantidade+" " + nome+"(s)"+ " que custa(m) "+ (peca1*quantidade)+" reais");

	scanner.nextLine();

	System.out.println("Digite a segunda peca");
	String nome2= scanner.nextLine();
	double peca2 = 15.5;
	System.out.println("O valor de cada " + nome2 +" e " + peca2);
	System.out.println("Digite a quantidade de pecas");
	int quantidade2= scanner.nextInt();
	System.out.println("Sua peca e "+ nome2 +". "+ " sao "+ quantidade2+" " + nome2+"(s)"+ " que custa(m) "+ (peca2*quantidade2)+" reais");
System.out.println("O valor total e " +((peca2*quantidade2)+(peca1*quantidade)) + " reais " );
	
	
	
	
	
	
}

}
