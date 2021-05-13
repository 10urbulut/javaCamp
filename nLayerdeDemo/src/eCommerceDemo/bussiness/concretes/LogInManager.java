package eCommerceDemo.bussiness.concretes;

import eCommerceDemo.bussiness.abstracts.LogInService;
import eCommerceDemo.core.abstracts.LoggerService;
import eCommerceDemo.core.abstracts.ValidationService;
import eCommerceDemo.entities.concretes.User;

public class LogInManager implements LogInService{
	ValidationService validationService;
	LoggerService loggerService;
	User user;

	

	

	public LogInManager(User user) {
		super();
		this.user = user;
	}

	public LogInManager(ValidationService validationService, LoggerService loggerService) {
		super();
		this.validationService = validationService;
		this.loggerService = loggerService;
	}

	public LogInManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public boolean logIn(User user) {
		validationService.eMailChecking(user);
		validationService.passwordChecking(user);
		if(user.geteMail()==null && user.getPassword()==null) {
			System.out.println("You have to fill in the blanks. (Email and Password  ");
			
		}
		else if (this.user.geteMail()==user.geteMail()) {
			System.out.println("Login successful ");
			return true;
		}
		System.out.println("Login failed, try again ");
		return false;
	}

}
