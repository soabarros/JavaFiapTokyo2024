package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	// FUNCAO COM PARAMETRO SEM RETORNO PARA EXIBIR NOME PERSONALIZADO 
	
	
	static void saudacaoComArgs(String nome) {
		System.out.println("Seja bem-vindo, "+nome);
		
		
		
		
		
		
	}
	
	
	
	//FUNCAO COM PARAMETRO E SEM RETORNO PARA EXIBIR UMA SOMA 
	static void somar(int n1, int n2) {
		System.out.println("Soma: "+ (n1+n2));
	
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomedigitado = sc.nextLine();
				
		// CHAMANDO  A FUNCAO saudacaoComArgrs E PASSANDO COMO PARAMETRO A 
		saudacaoComArgs("Sophia");
		
		//CHAMANDO COM A FUNCAO DE SOMA 
		somar(2,3);
		
		
		
		
	}
}
