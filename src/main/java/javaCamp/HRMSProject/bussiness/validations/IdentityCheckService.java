package javaCamp.HRMSProject.bussiness.validations;

import javaCamp.HRMSProject.entities.concretes.JobSeeker;

public interface IdentityCheckService {
	public boolean checkIfRealPerson(JobSeeker jobSeeker) ;

}
