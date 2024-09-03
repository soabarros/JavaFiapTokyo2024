package logica.aulas.aula06;



public class VotoOpcional {
	public static void main(String[] args) {
	
		int idade = 71 ;
		boolean verificamenoridade= idade>=16&&idade <18;
		System.out.println("Voto opc menor idade " + verificamenoridade);
		
		boolean verificavei= idade >70;
		System.out.println("Voto opcional maior idade (vein)" + verificavei);
		
		if ( verificamenoridade||verificavei) {
			System.out.println("Voto opcional");
		}
		
		if((idade >= 16 && idade<18)||idade > 70 ) {
			System.out.println("Voto opcional");
		}
		
		
		
		
		
}


	
}
