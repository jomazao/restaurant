package ui;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ClientsScreen clientsScreen = new ClientsScreen();
		MenuScreen menuScreen = new MenuScreen();
		clientsScreen.listClients();
		while (true) {
			
			int selected = menuScreen.showMenuOptions();
			switch (selected) {
			case 0:
				case 1:
					clientsScreen.createClient();
					break;			
				case 2:
					clientsScreen.listClients();
					break;
				case 3: 
					clientsScreen.searchClient();
					break;
				case 4: 
					clientsScreen.updateclient();
					break;
				case 5: 
					clientsScreen.deleteClient();
					break;
				default:
					System.out.println("Esta opción no está disponible");
			}	
		}
		
	}
	
	
	public static void restaurantUi(ClientsScreen clientsScreen) {
		

		
	}
	
}
