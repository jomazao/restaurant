package ui;

import java.util.Scanner;

public class MenuScreen {
	
	
	public int showMenuOptions() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione la opción que desea realizar:");
		System.out.println("///////////////////////////////////////");
		System.out.println("1. Crear cliente");
		System.out.println("2. Listar clientes");
		System.out.println("3. Buscar cliente por id");
		System.out.println("4. Actualizar cliente por id");
		System.out.println("5. Eliminar cliente por id");


		try {
			int optionSelected = Integer.parseInt(scanner.nextLine());
			return optionSelected;
		}catch (Exception e) {
			return -1;
		}
					
	}

}
