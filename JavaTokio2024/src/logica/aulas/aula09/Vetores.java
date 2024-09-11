package logica.aulas.aula09;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	//lado esquerdo : declaração do vetor de num inteiros
	// lado direito:: instanciamos o vetor com 10 posições 
	int[] vetorInteiros = new int[10];
	 vetorInteiros[0]=10;//colocando o valor 10 na posição 0 do vetor
	 System.out.println("Valor inteiro na posição 0: "+ vetorInteiros[0]);
	
	 int anonascimento= vetorInteiros [1];
	 System.out.println("Ano nascimento: "+ anonascimento);
	 
	 // Acessando a posicao via variavel 
	 int posicao= 0;
	 System.out.println(vetorInteiros[posicao]);
	 
	 //LISTA DE FRUTAS COM 4 POSIÇOES 
	 String[] listadefrutas= new String[4];
	 listadefrutas[0] = "Morango";
	 listadefrutas[1]= "Uva";
	 listadefrutas[2] = "pera";
     listadefrutas[3]= "tomate";
     System.out.println("  ");
     System.out.println("Fruta posição 1: "+listadefrutas[1]);
     
     // OUTRO JEITO DE FZR
     
     String[] listafrutas2= { "Melancia", "Abacaxi", "pitaia", "banana" };
     
     int quantidadefruta= listafrutas2.length ;
     System.out.println("Quantidade de frutas : "+ quantidadefruta);
   
     for(int i= 0; i < listafrutas2.length ; i++){
    	 
     }

     /// CRiar uma lista de numeros
     int[] numeros = { 16,24,29,33};
     
     ///FOR EACH ---> PERCORRE A LISTA E ACESSA OS VALORES DAS POSICOES
     
     System.out.println();

     for(int numero: numeros ) {
      System.out.println(numero);
     
     
     
     
     
     
     
     
     
     }
     
	}
}