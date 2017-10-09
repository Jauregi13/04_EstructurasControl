import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int num_acertar = (int)(Math.random()*10);
		int num_usuario;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero de 0 al 9:");
			
			num_usuario = scan.nextInt();
		}while(num_usuario != num_acertar);
			
		}

	}


