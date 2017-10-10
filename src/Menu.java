import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner (System.in);
		int opcion;
		do{
			System.out.println("Elige una de estas opciones:");
			System.out.println("1. Grabar CD audio");
			System.out.println("2. Grabar CD datos");
			System.out.println("3. Guardar CD en disco D");
			System.out.println("4. Copiar CD a CD");
			System.out.println("5. Salir");
			System.out.println("Pulsa un botón de estos:");
			
			opcion = scan.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Grabando CD...");
					Thread.sleep(1000);
					System.out.println("CD grabado!!");
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
				case 5:
					System.out.println("Cerrando sistema");
					break;
				default:
					System.out.println("Opción incorrecta");
				
				
			
			}
		}
		while(opcion != 5);
			System.out.println("Fin del programa");

	}

}
