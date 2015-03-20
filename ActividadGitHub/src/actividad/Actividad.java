package actividad;

import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime tu nombre y tu Ciudad: ");
		String nom = teclado.nextLine();
		
		System.out.print("Tú nombre es: " + nom);
		
		teclado.close();
	}

}
