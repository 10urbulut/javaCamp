package javaCamp.HRMSProject.core.validations.identityValidation;

import org.springframework.stereotype.Service;

@Service
public class EMailVerificationManager implements EMailVerificationService{

	@Override
	public boolean mailVerificationSending(String eMail) {
		if(!eMail.contains("@")) {
			return false;
		}
		return true;
	}

}
