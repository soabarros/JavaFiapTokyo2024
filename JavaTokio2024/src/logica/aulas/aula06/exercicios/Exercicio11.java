package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio11 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Origem da carga (1-5)");
	int estado= sc.nextInt();
	System.out.println("Digite o peso do caminhao em toneladas ");
	double pesotoneladas= sc.nextDouble();
	System.out.println("Codigo da carga");
	int codcarga= sc.nextInt();
	
	
	double pesokg= pesotoneladas*1000;
	
	double precokg= 0;
			
	if (codcarga>=10&&codcarga<+20) { 
		precokg=100;
		
	}  else if (codcarga<=30) {
		precokg=250;
	}
	
	else if (codcarga <=40) { 
		precokg=340;
	}
	

	double impostoporcentagem=0;
	if (estado ==1) {impostoporcentagem = 0.35;
	}
	else if (estado==2) {
		impostoporcentagem=0.25;
		
	}
	else if (estado==3) {
		impostoporcentagem=0.15;
		}
	
	
	else if (estado==4) {
		impostoporcentagem=0.05;
}
	else if (estado==5) {
		impostoporcentagem=0;
		}
	
	double precocarga= pesokg*precokg;
	
	double imposto= precocarga*impostoporcentagem;
	
	
    double valorfinal = precocarga+imposto;
    
    
    System.out.println("Peso da carga em kg "+ pesokg);
    System.out.println("Preco da carga "+ precocarga);
    System.out.println("Valor do imposto"+ imposto);
    System.out.println("Valor final "+ valorfinal);

	
	
	
	
	
	
	
}

}
