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
	
	public void searchClient() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite un documento a buscar:");
		String id = scanner.nextLine();
		Client client = clientsScreenController.searchClient(id);
		if (client != null) {
			System.out.println(client.toString());			
		} else {
			System.out.println("No se encontró el cliente");
		}		
	}

	public void updateclient() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite el documento del cliente que desea actualizar:");
		String id = scanner.nextLine();
		Client client = clientsScreenController.searchClient(id);
		if (client != null) {
			String name;
			String lastName;
			String nId;
			String phoneNumber;
			boolean hasChildren;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("----ACTUALIZACIÓN DE CLIENTE----- \n");
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
			String result = clientsScreenController.updateClient(client,name, lastName, nId, phoneNumber, hasChildren);	
			System.out.println("Se actualizó el cliente correctamente");
		} else {
			System.out.println("No se encontró el cliente");
		}
	}


	public void deleteClient() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite el documento del cliente que desea eliminar:");
		String id = scanner.nextLine();
		Boolean clientDeleted = clientsScreenController.deleteClient(id);
		if (clientDeleted) {
			System.out.println("Se eliminó el cliente correctamente");
		} else {
			System.out.println("No se encontró el cliente");
		}
	}

	
}
