import Bussiness.CampaignManager;
import Bussiness.CustomerManager;
import Bussiness.ProductManager;
import Bussiness.SalesManager;
import DataAccess.CampaignDal;
import DataAccess.CustomerDal;
import DataAccess.ProductDal;
import Entity.Campaign;
import Entity.Customer;
import Entity.Product;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		//Database simulation
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Onur");
		customer1.setLastName("Bulut");
		customer1.setBirthYear(1993);
		customer1.setCitizenId("32595422369");//fake
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Tezay");
		customer2.setLastName("Tanrýkulu");
		customer2.setBirthYear(1995);
		customer2.setCitizenId("30578066111");//fake
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setFirstName("Buðse");
		customer3.setLastName("Sancak");
		customer3.setBirthYear(1992);
		customer3.setCitizenId("30573336111");//fake
		
		System.out.println("\n---------- Customer CRUD section ----------\n");
		//Customer CRUD simulation
		CustomerManager customerManager = new CustomerManager(new CustomerDal());
		
		System.out.println(customerManager.checkForIdentity(customer1));
		
		customerManager.add(customer1);
		customerManager.update(customer2);
		customerManager.delete(customer3);
		
		System.out.println("\n---------- Campaign CRUD section ----------\n");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("First sopping campaign");
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName("Black friday campaign");
		
		Campaign campaign3 = new Campaign();
		campaign3.setId(3);
		campaign3.setName("Hello to summer campaign");
		
		CampaignManager campaignManager = new CampaignManager(new CampaignDal());
		campaignManager.add(campaign2);
		campaignManager.delete(campaign3);
		campaignManager.update(campaign1);
		
		System.out.println("\n---------- Game CRUD section ----------\n");
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Call Of Duty");
		product1.setPrice(320);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Nedd For Speed 2");
		product2.setPrice(210);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Half Life");
		product3.setPrice(180);
		
		ProductManager productManager = new ProductManager(new ProductDal());
		productManager.add(product2);
		productManager.delete(product1);
		productManager.update(product3);
		
		System.out.println("\n---------- Selling section ----------\n");
		
		SalesManager salesManager = new SalesManager();
		salesManager.sales(customer2, product1);
		salesManager.sellWithCampaign(customer2, campaign2, product1);
		
	}

}
