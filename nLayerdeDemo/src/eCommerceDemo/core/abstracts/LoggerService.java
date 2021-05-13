package eCommerceDemo.core.abstracts;

public interface LoggerService {
	void mailLogger();
	void userNotifySucces();
	void userNotifyUnSucces();
	boolean userVerification();
	boolean logInWithGoogle();

}
