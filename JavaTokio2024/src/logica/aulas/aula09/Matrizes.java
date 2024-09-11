package logica.aulas.aula09;

import java.util.Scanner;

public class Matrizes {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
// jogo da velha
	
	char[][]tabuleiro= new char [3][3];
	
	tabuleiro[0][0]='X' ;
	tabuleiro[1][1]='O';
	tabuleiro[2][2]='X' ;
	
	// CRIANDO MAIS ALGUMAS MATRIZES
	
	int[][]matriz = new int[4][5];// linha por coluna//
	int linhas = matriz.length;// quantidade de colunas
	int colunas = matriz[0].length;// quantidade de linhas
	System.out.println(colunas );
	
	int numero= 1 ;
	System.out.println( );
	for(int i = 0 ; i<linhas; i++) {
		for(int j=0 ; j<colunas; j ++) {
	

	matriz[i][j]= numero ;
	numero++;
		}
	}
	// FOR PARA EXIBIR MATRIZ
	
	for (int k = 0 ;k <linhas; k ++) {
		for (int j = 0 ;j <colunas ; j++)
		System.out.println(matriz [k][j]+ "/t");
		
	}
}
}
