package Bussiness;

import Entity.Campaign;
import Entity.Customer;
import Entity.Product;

public class SalesManager implements ISalesService {

	@Override
	public void sales(Customer customer, Product product) {
		
		
		System.out.println(customer.getFirstName()+" "+customer.getLastName().toUpperCase()+ " " + "is purchasing... "+product.getName() + "\n Purchase successfull\n");
	}

	@Override
	public void sellWithCampaign(Customer customer, Campaign campaign, Product product) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName().toUpperCase()+ " is purchasing... with  =>"+ campaign.getName()+"  is applied to "  +product.getName() + "\n Purchase successfull\n");
		
		
	}
	





}
