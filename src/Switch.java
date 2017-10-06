import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Elige una de estas opciones:");
		System.out.println("1. Grabar CD audio");
		System.out.println("2. Grabar CD datos");
		System.out.println("3. Guardar CD en disco D");
		System.out.println("4. Copiar CD a CD");
		System.out.println("Pulsa un botón de estos:");
		
		Scanner lector = new Scanner(System.in);
		int caso = lector.nextInt();
		
		switch (caso){
			case 1:
				System.out.println("Grabando CD...");
			break;
			
			case 2:
				System.out.println("Grabando CD...");
			break;
			
			case 3:
				System.out.println("Guardando datos en disco D...");
			break;
			
			case 4:
				System.out.println("Copiando CD...");
			break;
			
			default:
				System.out.println("Opción incorrecta");
		}
		
		

	}

}
