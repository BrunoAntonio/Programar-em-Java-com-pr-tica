package application;

public class SwitchCase {

	public static void main(String[] args) {
		
		char vogal = 'E';
		
		switch (vogal) {
		case 'A':
		System.out.println("vogal A");
		break;
		case 'E':
			System.out.println("vogal E");
			break;
		case 'I':
			System.out.println("vogal I");
			break;
		case 'O':
			System.out.println("vogal O");
			break;	
		case 'U':
			System.out.println("vogal U");
			break;		
		
		default:
			System.out.println("Não há vogal correspondente");
		}

	}

}
