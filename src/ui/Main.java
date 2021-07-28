package ui;

import models.Client;

public class Main {

	public static void main(String[] args) {
		System.out.println("Inició el programa");
		Client newClient = new Client("Diego","Molina","1111","23323452", false);	
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());	
		newClient.setName("Andrés");
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());
		
		newClient.setHasChildren(true);
		
		System.out.println("el cliente tiene hijos (true/false): " + newClient.getHasChildren());
		
	}
	
}
