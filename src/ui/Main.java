package ui;

import models.Client;

public class Main {

	public static void main(String[] args) {
		System.out.println("Inici� el programa");
		Client newClient = new Client("Diego","Molina","1111","23323452", false);	
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());	
		newClient.setName("Andr�s");
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());
		
		newClient.setHasChildren(true);
		
		System.out.println("el cliente tiene hijos (true/false): " + newClient.getHasChildren());
		
	}
	
}
