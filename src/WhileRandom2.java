import java.util.Scanner;

public class WhileRandom2 {

	public static void main(String[] args) {
		double random = Math.random()*10;
		int numero_acertar = (int)random;
		Scanner lector = new Scanner(System.in);
		int numero = numero_acertar + 1;
		int intento = 1;
		System.out.println("Intenta adivinar el numero del ordenador: ");
		while (numero != numero_acertar){
			numero = lector.nextInt();
			System.out.println("No has acertado!!");
			System.out.println("Prueba otra vez:");
			numero = lector.nextInt();
			intento ++;
		}
		System.out.println("Has acertado!! Enhorabuena!!");
		System.out.println("Has necesitado " + intento + " intento(s)");

	}

}