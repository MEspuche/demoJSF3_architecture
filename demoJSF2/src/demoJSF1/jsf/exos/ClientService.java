package demoJSF1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name ="clientservice")
@ApplicationScoped
public class ClientService {


	public ArrayList<Client> clients = new ArrayList<Client>();

	public int nombre;
	
	
	
	public int getNombre() {
		return clients.size();
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Client> getClients() {
		System.out.println("get mbclients");
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	

	public ClientService()
	{
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client ("Durand","Paul"));
	}
	
	public void delete(Client client)
	{
		clients.remove(client);
	}
	
	public void ajouter(Client client)
	{
		clients.add(client);
	}
	
	
	
	
}
