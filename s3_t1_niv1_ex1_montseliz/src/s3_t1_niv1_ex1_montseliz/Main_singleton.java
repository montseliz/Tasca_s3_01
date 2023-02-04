package s3_t1_niv1_ex1_montseliz;

import java.util.Scanner;

public class Main_singleton {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String order = "";
		int menu = 0;
		
		Undo.getInstance(); 
		
		// Comprovar que la instància s'ha creat correctament
		// boolean check = Undo.getInstance() instanceof ArrayList<String>; 
		// System.out.println(check);  
		
		do {
			System.out.println("Escull quina opció vols realitzar del menú següent:\r\n"
					+ "1. Afegir una comanda.\r\n" 
					+ "2. Eliminar una comanda.\r\n"
					+ "3. Visualitzar el registre de les últimes 3 comandes realitzades.\r\n"
					+ "0. Sortir de l'aplicació.\r\n"
					+ "Tria (0-3):");
			menu = input.nextInt(); 
			
			switch (menu) {
			case 0: 
				System.out.println("Adéu! Fins la propera!");
				break; 
			case 1: 
				System.out.println("Introdueix el nom de la comanda que vols afegir:"); 
				input.nextLine(); 
				order = input.nextLine();
				Undo.saveOrders(order);
				break;
			case 2: 
				Undo.removeOrders();
				break; 
			case 3: 
				Undo.historyOrders();
				break; 
			default: 
				System.out.println("Error. Introdueix un número del 0 al 3.\r\n");
			}
				
		} while (menu != 0); 
		
		input.close();
	}
}
