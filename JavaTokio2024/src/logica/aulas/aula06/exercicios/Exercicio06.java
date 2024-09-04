package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio06 { public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// 16 ao 18 opcinal
	//0 ao 16 proibido 
	// 18 ao 70 obrigatorio
	/// 70 ao infinito opcional
	
	
	
	
	
	System.out.println("Digite sua idade");
	int idade = scanner.nextInt();

	if ((idade >= 16 && idade < 18) || idade > 70) { 
		 System.out.println("voto opcional");
	} else if (idade<16) {
    	System.out.println("voto proibido");
    } else {
		 System.out.println("voto obrigatorio");
    }
    
}}
