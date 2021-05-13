package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.ValidationService;
import eCommerceDemo.entities.concretes.User;

public class ValidationManager implements ValidationService{


	@Override
	public boolean eMailChecking(User user) {
		
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$"; 
		Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		   
		 
		 Matcher matcher = emailPattern.matcher(user.geteMail());
	        if (matcher.matches()){
	            return true;
	        }else {
	            System.out.println("Invalid email ");
	                return false;
		
	        }

	}

	@Override
	public boolean nameCehecking(User user) {
		
		if (user.getFirstName().length()<2 && user.getLastName().length()<2) {
			return false;
		}
		else {
			System.out.println("Your first and last name must be longer than two letters ");
		return true;
		}
	}

	@Override
	public boolean passwordChecking(User user) {
		if(user.getPassword().length()<6) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean eMailRepetion(User user) {
		
		
		
		return true;
	}
}
