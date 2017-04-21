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
	
	
	
	public MBInjected getMbinjected2() {
		return mbinjected2;
	}

	public void setMbinjected2(MBInjected mbinjected2) {
		this.mbinjected2 = mbinjected2;
	}

	private String data = "data from inject";

	
	public String getData() {
		mbinjected2.show();
		return mbinjected2.getInjectedData();
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
}
