import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Elige una de estas opciones:");
		System.out.println("A. Grabar CD audio");
		System.out.println("B. Grabar CD datos");
		System.out.println("C. Guardar CD en disco D");
		System.out.println("D. Copiar CD a CD");
		System.out.println("Pulsa un botón de estos:");
		
		Scanner lector = new Scanner(System.in);
		String caso = lector.nextLine();
		
		switch (caso){
			case "A":
				System.out.println("Grabando CD...");
			break;
			
			case "B":
				System.out.println("Grabando CD...");
			break;
			
			case "C":
				System.out.println("Guardando datos en disco D...");
			break;
			
			case "D":
				System.out.println("Copiando CD...");
			break;
			
			default:
				System.out.println("Opción incorrecta");
		}
		
		

	}

}
