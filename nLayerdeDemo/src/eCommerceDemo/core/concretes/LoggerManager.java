package eCommerceDemo.core.concretes;


public class LoggerManager implements eCommerceDemo.core.abstracts.LoggerService{

	@Override
	public void mailLogger() {
		System.out.println("Sent with mail ");
		
	}

	@Override
	public void userNotifySucces() {
		mailLogger();
	
		System.out.println(" Proccess is successful ");

		
	}

	@Override
	public void userNotifyUnSucces() {
		mailLogger();
		System.out.println("Poroccess is unsuccessfull ");
		
	}

	@Override
	public boolean userVerification() {
		mailLogger();
		System.out.println("Please on the click to button for the verification");
		return true;
	}

	@Override
	public boolean logInWithGoogle() {
		//simülasyon
		System.out.println("LogIn with Google account is success");
		return true;
	}

	

	


	

}
