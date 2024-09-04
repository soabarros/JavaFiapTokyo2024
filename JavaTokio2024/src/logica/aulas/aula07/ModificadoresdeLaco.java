package logica.aulas.aula07;

import java.util.Scanner;

public class ModificadoresdeLaco {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int i = 0;
	while(i<10) {
		i++;	
		if(i==3|| i==5) {
			continue;
	}
		
		if(i==7) {break;}
	
		System.out.println("Produto "+ i );	

	}
	 System.out.println("FIM");
	
	// MODIFICADORES break 
	
	
	
	
	
	
	
	
}
}