package logica.aulas.aula05.exercicios;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Exercicio11 { public static void main(String[] args) {
	 
Scanner scanner = new Scanner(System.in);
System.out.println("Digite a sua idade em dias");
int idadeemdias = scanner.nextInt();
// 9255 dia
// 25 anos
///4 meses
/// 10 dias


int anos= idadeemdias/365;
System.out.println("idade em anos " + anos);
int restodeano = idadeemdias % 365;
System.out.println("resto de ano " + restodeano);
int meses= restodeano/30;// 130 dividido por 30 
System.out.println("meses "+ meses);
int dias = restodeano % 30; // resto da divisao de 130 por 30 
System.out.println("dias " + dias);

	
	
	
	
	
	
	
	
	
	
	
}
}
