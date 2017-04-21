package demoJSF1.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name ="mbinjectedservice", eager=true)
@ApplicationScoped
public class MBInjectedServiceImpl implements MBInjectedService {


	public MBInjectedServiceImpl()
	{
		System.out.println("Injected bean created");
	}
	@Override
	public void show()
	{
		System.out.println("show injected");
	}
	
	@Override
	public String getInjectedData()
	{
		return "Hello injected service";
	}

	public String getInjectedData2() {
		return "Hello injected service 2";
	}
	
	
}
