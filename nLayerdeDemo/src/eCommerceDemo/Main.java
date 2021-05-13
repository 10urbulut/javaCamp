package eCommerceDemo;


import eCommerceDemo.bussiness.concretes.UserManager;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Onur","Bulut","10urbulut@gmail.com","123");
		User user2 = new User(2, "Alp", "Karadeniz", "alp@mail.com", "1231231");
		
		UserManager userManager= new UserManager(new HibernateUserDao());
		userManager.add(user2);
		userManager.add(user1);


	}

}
