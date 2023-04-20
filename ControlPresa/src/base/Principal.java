package base;

import java.util.Scanner;
import java.util.logging.Logger;

public class Principal {
	private static final Logger LOGGER = Logger.getLogger(Principal.class.getName());

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Este programa lee el nivel de agua de una presa y permite abrir compuertas si tenemos permiso y el nivel es superior a 50.");

		int nivel = leerNivelAgua();

		int opcion = 0;
		do {
			System.out.println();
			System.out.println("Nivel del agua: " + nivel);
			System.out.println();
			System.out.println("ACCIONES: ");
			System.out.println();
			System.out.println("1. Nueva lectura del nivel de agua.");
			System.out.println("2. Abrir compuertas.");
			System.out.println("3. Solicitar permiso.");
			System.out.println("4. Salir");
			System.out.println();
			System.out.print("Introduce opción: ");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				nivel = leerNivelAgua();
				break;
			case 2:
				nivel = leerNivelAgua();
				break;
			default:
				break;
			}
		} while (opcion != 4);

	}

	static int leerNivelAgua() {
		return (int) Math.random()*100;
	}
}
