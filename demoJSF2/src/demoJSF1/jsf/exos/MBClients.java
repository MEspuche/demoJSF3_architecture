package demoJSF1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name ="mbclients", eager=true)
@SessionScoped
public class MBClients {


	ClientService clientservice;
	private Client clientCourant;
	private Client newClient= new Client();
	
	
	
	public Client getClientCourant() {
		return clientCourant;
	}


	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}


	public MBClients()
	{
		clientservice = new ClientService();
	}
	
	
	public ArrayList<Client> getClients() {
		return clientservice.getClients();
	}
	
	
	public int getNombre()
	{
		return clientservice.getClients().size();
	}
	
	
	public String select(Client client)
	{
		this.clientCourant = client;
		System.out.println("select : " + client.getNom());
		return "client";
	}
	
	
	
	public Client getNewClient()
	{
		return newClient;
	}
	

	public void setNewClient(Client newClient) {
		this.newClient = newClient;
	}


	public String delete()
	{
		clientservice.delete(clientCourant);
		return "clients";
		
	}
	
	public String ajouter()
	{
		clientservice.ajouter(newClient);
		newClient = new Client();
		return "clients";
	}
	
	
	
	
}
