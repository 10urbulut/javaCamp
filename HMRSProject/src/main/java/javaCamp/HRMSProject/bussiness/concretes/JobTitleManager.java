package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.JobTitleService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.ErrorResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.JobTitleDao;
import javaCamp.HRMSProject.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{
	JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>( jobTitleDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		if(!checkIfJobTitleExist(jobTitle)) {
			return new ErrorResult("Bu meslek zaten var");
		}
		else {
			jobTitleDao.save(jobTitle);
			return new SuccessResult();
		}
		
		
	}

	@Override
	public Result delete(JobTitle jobTitle) {
		jobTitleDao.delete(jobTitle);
		return new SuccessResult();
	}

	@Override
	public Result update(JobTitle jobTitle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	 //buradan aşağısı iş kuralları metod
	
		 boolean checkIfJobTitleExist(JobTitle jobTitle) {
			if(jobTitleDao.existsByjobNameIs(jobTitle.getJobName())) {
				return false;
			}
			else {
				return true;
			}
			
		}
	

}
