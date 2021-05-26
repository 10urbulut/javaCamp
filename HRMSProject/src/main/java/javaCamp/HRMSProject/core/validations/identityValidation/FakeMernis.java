package javaCamp.HRMSProject.core.validations.identityValidation;

import org.springframework.stereotype.Service;


@Service
public class FakeMernis {
	
	public boolean FakeMernisControl(String nationalityId, String lastName) {
		if(nationalityId.length()==11 || lastName.length()<2) {
			
			
			return false;
		}
		else {
			
			return true;
		}
		
	}

}
