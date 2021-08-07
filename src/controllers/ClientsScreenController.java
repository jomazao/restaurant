package controllers;

import java.util.ArrayList;

import data.ClientRepository;
import models.Client;

public class ClientsScreenController {
	
	ClientRepository clientRepository = new ClientRepository();
	
	public String createClient(String name, String lastName, String nId, String phoneNumber, boolean hasChildren) {
			
	
		if (name.trim().length() < 3) {
			return "El nombre no puede tener menos de 3 dígitos";
		} 	
		
		if (lastName.trim().length() < 3) {
			return "El apellido no puede tener menos de 3 dígitos";
		}

		Client client = new Client(name, lastName, nId, phoneNumber, hasChildren);
		
		boolean result = clientRepository.create(client);
		
		if (result) {
			return "Se creó el cliente con éxito";
		} else {
			return "Hubo un error al crear el cliente";
		}
		
	}

	public ArrayList<Client> getClients() {
		return clientRepository.getAll();
	}

	public Client searchClient(String id) {
		Client client = clientRepository.findClientById(id);
		return client;
	}

	public String updateClient(Client client, String name, String lastName, String nId, String phoneNumber,
			boolean hasChildren) {
		Client clientUpdate = new Client(name, lastName, nId, phoneNumber, hasChildren);
		clientRepository.updateClient(client,clientUpdate);
		return null;
	}

	public Boolean deleteClient(String id) {
		return clientRepository.deleteClientById(id);
	}

}
