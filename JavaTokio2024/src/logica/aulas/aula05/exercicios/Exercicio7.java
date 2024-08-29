package logica.aulas.aula05.exercicios;

import java.util.Scanner;

public class Exercicio7 { public static void main(String[] args) {
	 
	
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Digite o valor do produto");
	double preco1= scanner.nextDouble();
	System.out.println("Digite o valor pago");
	double valorpago= scanner.nextDouble();
	System.out.println("O troco e " + (valorpago-preco1));
	
	
}

}
