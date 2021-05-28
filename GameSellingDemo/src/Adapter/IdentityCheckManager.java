package Adapter;


import java.rmi.RemoteException;
import java.util.Locale;

import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class IdentityCheckManager implements IIdentityCheckService{

	@Override
	public boolean checkForIdentity(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getCitizenId()), 
					 customer.getFirstName().toUpperCase(new Locale("tr")), 
					 customer.getLastName().toUpperCase(new Locale("tr")), 
					 customer.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
		
		
		
	}

}
