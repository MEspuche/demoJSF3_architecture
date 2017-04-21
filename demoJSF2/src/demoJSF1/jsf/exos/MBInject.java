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
	private MBInjected mbinjected;
	
	private String data = "data from inject";

	
	public String getData() {
		mbinjected.show();
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
}
