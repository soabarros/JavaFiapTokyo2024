package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio09 { public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	        
	        
	
System.out.println("Digite a quantidade de kWh gastos");
double kWh=scanner.nextDouble();
System.out.println("Digite o tipo de cliente");
int cliente= scanner.nextInt();
double comercio= 0.49;//2
double residencia= 0.60;//1
double industria= 1.29;//3
if(cliente==1) {
	System.out.println("Seu estabelecimento e uma residencia, sua conta de luz custa "+ kWh*residencia);
	}
if (cliente==2) {System.out.println("Seu estabelecimento e uma residencia, sua conta de luz custa "+ kWh*comercio);}

if (cliente==3) {System.out.println("Seu estabelecimento e uma residencia, sua conta de luz custa "+ kWh*industria);}
 
else { System.out.println("ERRO");



}
}


}
