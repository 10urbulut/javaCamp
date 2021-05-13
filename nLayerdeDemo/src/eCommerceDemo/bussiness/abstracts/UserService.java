package eCommerceDemo.bussiness.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	boolean logIn(User user);
	void register(User user);
}
