package logica.aulas.aula06.exercicios;

import java.util.Scanner;

public class Exercicio08 {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Digite o percuso percorrido");
	double distancia = scanner.nextDouble();
	// gasolina 6,09

	System.out.println("Digite o combustivel consumido ");
	double litro = scanner.nextDouble();

	double gasolina= distancia/litro;

	// Km/L

	System.out.println("Esse carro consome "+ gasolina+"KM/L");

	if(gasolina < 8) {
		System.out.println("Esse carro bebe bem");
	}
	else {
		System.out.println("autonomia legal");
	}







}

}
