package demoJSF1.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name ="mbinjected", eager=true)
@ApplicationScoped
public class MBInjected {



	public MBInjected()
	{
		System.out.println("Injected bean created");
	}

	public void show()
	{
		System.out.println("show injected");
	}
	
	
	
}