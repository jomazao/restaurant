package data;

import java.util.ArrayList;
import models.Client;

public class ClientRepository {

	
	private ArrayList<Client> clients = new ArrayList<Client>(); /// Se va a cambiar por una base de datos real
	
	
	public boolean create(Client client) {
		clients.add(client);
		//// Una conexión a la base datos ej: Mysql
		/// con una consulta SQL que inserte los datos.
		return true;
	}
	
}
