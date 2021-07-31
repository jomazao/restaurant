package ui;

import java.util.Scanner;

public class MenuScreen {
	
	
	public int showMenuOptions() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione la opción que desea realizar:");
		System.out.println("///////////////////////////////////////");
		System.out.println("1. Crear cliente");
		System.out.println("2. Listar clientes");
		try {
			int optionSelected = Integer.parseInt(scanner.nextLine());
			return optionSelected;
		}catch (Exception e) {
			return -1;
		}
					
	}

}
