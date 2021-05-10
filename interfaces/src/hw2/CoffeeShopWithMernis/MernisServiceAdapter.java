package hw2.CoffeeShopWithMernis;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult= false;
		try {
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getCitizenNumber()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthYear());

		} catch (Exception e) {
			System.out.println("Hatalý iþlem, Geçerli bir kiþi deðil.");
		}
		return serviceResult;
	}
	

}
