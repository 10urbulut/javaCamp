package eCommerceDemo.bussiness.concretes;

import java.util.List;
import eCommerceDemo.bussiness.abstracts.UserService;
import eCommerceDemo.core.abstracts.LoggerService;
import eCommerceDemo.core.abstracts.ValidationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	LoggerService loggerService;
	ValidationService validationService;
	

	public UserManager(ValidationService validationService) {
		
		this.validationService = validationService;
	}

	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	public UserManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		validationService.eMailChecking(user);
		validationService.eMailRepetion(user);
		validationService.nameCehecking(user);
		validationService.passwordChecking(user);
		
		userDao.add(user);
		loggerService.userNotifySucces();
		
	
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public boolean logIn(User user) {
		if (user.geteMail() == null || user.getPassword()==null) {
			System.out.println("E-Mail and Password field cant not be empty  ");
			return false;
		}
		return true;
		//else if (user.geteMail()== )
		
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

}
