package ui;

public class Main {

	public static void main(String[] args) {
		ClientsScreen clientsScreen = new ClientsScreen();
		MenuScreen menuScreen = new MenuScreen();
		clientsScreen.listClients();
		while (true) {
			
			int selected = menuScreen.showMenuOptions();
			switch (selected) {
				case 1:
					clientsScreen.createClient();
					break;			
				case 2:
					clientsScreen.listClients();
					break;
				default:
					System.out.println("Esta opci�n no est� disponible");
			}	
		}
		
	}
	
	
	public static void restaurantUi(ClientsScreen clientsScreen) {
		

		
	}
	
}
