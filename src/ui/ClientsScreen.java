package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ClientsScreenController;
import models.Client;

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
		ArrayList<Client> clients = clientsScreenController.getClients();
		if (clients.size() == 0) {
			System.out.println("No hay ningún cliente registrado");
			return;
		}
		
		for (int i = 0 ; i < clients.size();i++) {
			Client client = clients.get(i);
			System.out.println(client.toString());
		}
		
	}
	
	public void deleteClient() {
		
	}
	

}
