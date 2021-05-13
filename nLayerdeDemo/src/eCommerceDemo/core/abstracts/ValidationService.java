package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface ValidationService {
	boolean eMailChecking(User user);
	boolean nameCehecking(User user);
	boolean passwordChecking(User user);
	boolean eMailRepetion(User user);

}
