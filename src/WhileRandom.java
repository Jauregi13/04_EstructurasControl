import java.util.Scanner;

public class WhileRandom {

	public static void main(String[] args) {
		double random = Math.random()*10;
		int numero_acertar = (int)random;
		System.out.println("Intenta adivinar el numero del ordenador: ");
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		int intento = 1;
		while (numero != numero_acertar){
			System.out.println("No has acertado!!");
			System.out.println("Prueba otra vez:");
			numero = lector.nextInt();
			intento++;
		}
		System.out.println("Has acertado!! Enhorabuena!!");
		System.out.println("Has necesitado " + intento + " intento(s)");

	}

}