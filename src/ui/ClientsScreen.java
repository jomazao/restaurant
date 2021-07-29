package ui;

import java.util.Scanner;

import controllers.ClientsScreenController;

public class ClientsScreen {
	
	ClientsScreenController clientsScreenController = new ClientsScreenController();
	
	public void createClient() {
		
		String name;
		String lastName;
		String nId;
		String phoneNumber;
		boolean hasChildren;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----CREACIÓN DE CLIENTE----- \n");
		System.out.println("Digite el nombre: ");
		name = sc.nextLine();
		System.out.println("Digite los apellidos: ");
		lastName = sc.nextLine();
		System.out.println("Digite el documento de identidad: ");
		nId = sc.nextLine();
		System.out.println("Digite el teléfono: ");
		phoneNumber = sc.nextLine();
		
		System.out.println("El cliente tiene hijos s/n : ");
		String hasChildString = sc.nextLine();
		if (hasChildString.toLowerCase().equals("s")) {
			hasChildren = true;
		} else {
			hasChildren = false;
		}
		
		String result = clientsScreenController.createClient(name, lastName, nId, phoneNumber, hasChildren);	
		System.out.println(result);
		
	}
	
	public void listClients() {
		
	}
	
	public void deleteClient() {
		
	}
	

}
