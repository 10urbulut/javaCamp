package javaCamp.HRMSProject.core.validations.identityValidation;

import org.springframework.stereotype.Service;

@Service
public  class  IdentityChecker implements IdentityCheckerService {
	
	private FakeMernis fakeMernis;
	
	public IdentityChecker(FakeMernis fakeMernis) {
		super();
		this.fakeMernis = fakeMernis;
	}

	@Override
	public boolean FakeMernisControl( String nationalityId, String lastName) {
		
	
		if (fakeMernis.FakeMernisControl(nationalityId,lastName)) 
		{
			
			
			return false;
		}
		
		return true;
	}
	
	
	
	}
