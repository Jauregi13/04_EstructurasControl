import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("Introduce un numero:");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		int contador = 0;
		
		while (contador <= numero){
			System.out.println("contador: " + contador);
			
			contador ++;
		}

	}

}
