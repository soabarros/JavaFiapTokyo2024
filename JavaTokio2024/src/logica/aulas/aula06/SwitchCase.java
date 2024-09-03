package logica.aulas.aula06;

public class SwitchCase {
public static void main(String[] args) {
	
	int tipousuario= 0 ;
	// tipousuario = 0 e adm
	// tipousuario= 1 e cliente 
	
	
	switch(tipousuario)
	{
		case 0 :
		System.out.println ("Usuario adm");
		break;
		case 1: 
			System.out.println("Usuario client");
			break;
			default :
				System.out.println("Erro");
			
			
			
	}

	
	
}
}
