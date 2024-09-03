package logica.aulas.aula05.exercicios;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner( System.in);
		
		System.out.println("Digite o numero");
		int numero = scanner.nextInt();
		
	System.out.println("valor digitado" + numero);
	 int centena = (numero/100)*100;
	 System.out.println("centena "+centena);
	 
	 int dez =( ((numero-centena)/10)*10);
	 System.out.println("Dezena "+dez);
	
	 int uni = ((numero-centena)-dez);
	 System.out.println("unidade "+uni);
	 
	 
	 
	 
		
		
		
		
		
		
		
		
	}
	
}
