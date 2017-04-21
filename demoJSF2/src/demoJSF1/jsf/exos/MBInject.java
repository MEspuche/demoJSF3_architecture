package demoJSF1.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean (name ="mbinject", eager=true)
@SessionScoped
public class MBInject {



	public MBInject()
	{
		
	}

	@ManagedProperty(value="#{mbinjected}")
	private MBInjected mbinjected2;
	
	@ManagedProperty(value="#{mbinjectedservice}")
	private MBInjectedService mbinjectedservice;
	
	@ManagedProperty(value="#{clientservice}")
	private ClientService clientservice;
	
	
	public MBInjectedService getMbinjectedservice() {
		return mbinjectedservice;
	}

	public void setMbinjectedservice(MBInjectedService mbinjectedservice) {
		this.mbinjectedservice = mbinjectedservice;
	}

	public MBInjected getMbinjected2() {
		return mbinjected2;
	}

	public void setMbinjected2(MBInjected mbinjected2) {
		this.mbinjected2 = mbinjected2;
	}
	
	
	

	public ClientService getClientservice() {
		return clientservice;
	}

	public void setClientservice(ClientService clientservice) {
		this.clientservice = clientservice;
	}

	private String data = "data from inject";

	
	public String getData() {
		mbinjected2.show();
		mbinjectedservice.show();
		return mbinjected2.getInjectedData() + mbinjectedservice.getInjectedData() + mbinjectedservice.getInjectedData2()
		+ " nombre de clients : " + clientservice.getNombre() ;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
}
