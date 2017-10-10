
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int opcion;
		do{
			System.out.println("Elige una de estas opciones:");
			System.out.println("1. Circulo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Triangulo");
			System.out.println("4. Salir");
			System.out.println("Pulsa un botón de estos:");
			
			opcion = scan.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Escribe el radio del circulo:");
					Scanner scan2 = new Scanner (System.in);
					int radio = scan2.nextInt();
					double area = Math.PI*radio*radio;
					System.out.println("Este es el area del circulo: "+ area);
				break;
				
				case 2:
					System.out.println("Escribe el lado del cuadrado:");
					Scanner scan3 = new Scanner (System.in);
					int lado_cuad = scan3.nextInt();
					int area_cuad = lado_cuad*lado_cuad;
					System.out.println("Este es el area del cuadrado: "+ area_cuad);
				break;
				
				case 3:
					System.out.println("Escribe el lado del triangulo:");
					Scanner scan4 = new Scanner (System.in);
					int lado_tri = scan4.nextInt();
					double area_tri = (Math.sqrt(3)/4*(lado_tri*lado_tri));
					System.out.println("Este es el area del triangulo:" + area_tri);
				break;
				
				case 4:
					System.out.println("Cerrando sistema");
					break;
				default:
					System.out.println("Opción incorrecta");
				
				
			
			}
		}
		while(opcion != 4);
			System.out.println("Fin del programa");

	}

}