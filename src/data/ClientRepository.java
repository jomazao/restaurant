package data;

import java.util.ArrayList;
import models.Client;

public class ClientRepository {

	
	private ArrayList<Client> clients = new ArrayList<Client>(); /// Se va a cambiar por una base de datos real
	
	public boolean create(Client client) {
		clients.add(client);
		//// Una conexi�n a la base datos ej: Mysql
		/// con una consulta SQL que inserte los datos.
		return true;
	}


	public ArrayList<Client> getAll() {
		return clients;
		
	}


	public Client findClientById(String id) {
		for (int i = 0 ; i < clients.size(); i++) {
			Client client = clients.get(i);
			if (client.getnId().equals(id)) {
				return client;
			}
		}
		return null;
	}
	
}
