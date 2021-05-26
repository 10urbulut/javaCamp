package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
	Result delete(JobTitle jobTitle);
	Result update(JobTitle jobTitle);
}
