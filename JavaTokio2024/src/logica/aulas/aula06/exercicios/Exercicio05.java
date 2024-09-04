package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio05 {public static void main(String[] args) {
	 
	 Scanner scanner= new Scanner (System.in);
	 
	 
	 System.out.println("Digite o primeiro numero");
	 double n1 = scanner.nextDouble();
	 System.out.println("Digite o segundo numero");
	 double n2= scanner.nextDouble();
	 
	 System.out.println("Digite o caracter da operacao");
	 char operacao= scanner.next().charAt(0);
	 
	 System.out.println("Operacao selecionada foi "+ operacao);
	 
	 double resultado = 0 ;
	 switch(operacao) {
	 case '+':
		 resultado = n1+n2;
		 break;
		 
	 case '-':
	 resultado = n1-n2;
	 break;
	 
	 case '*' :
		 resultado = n1*n2;
		 break;
		 
	 case '/' :
		 resultado = n1/n2;
		 break;
		 
		 default: System.out.println("Operacao invalida");
		}
	 System.out.println("Resultado "+ resultado);
	 
	 
}//

}//
