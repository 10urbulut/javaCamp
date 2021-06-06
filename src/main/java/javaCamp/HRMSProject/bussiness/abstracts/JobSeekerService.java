package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	Result add(JobSeeker jobSeeker);
	
	Result update(JobSeeker jobSeeker);
	
	Result delete(JobSeeker jobSeeker);
	
	DataResult<List<JobSeeker>> getAll();
	
	

}
