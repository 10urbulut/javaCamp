package Bussiness;

import Entity.Campaign;
import Entity.Customer;
import Entity.Product;

public interface ISalesService {
	void sales(Customer customer, Product product);
	void sellWithCampaign(Customer customer, Campaign campaign,Product product);

}
