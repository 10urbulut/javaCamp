package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.JobInformationService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.ErrorResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.JobInformationDao;
import javaCamp.HRMSProject.entities.concretes.EducationInformation;
import javaCamp.HRMSProject.entities.concretes.JobInformation;

@Service
public class JobInformationManager  implements JobInformationService{

	private JobInformationDao jobInformationDao;
	
	@Autowired
	public JobInformationManager(JobInformationDao jobInformationDao) {
		super();
		this.jobInformationDao = jobInformationDao;
	}

	@Override
	public DataResult<List<JobInformation>> getAll() {
		
		return new SuccessDataResult<List<JobInformation>>(this.jobInformationDao.findAll());
	}

	@Override
	public Result add(JobInformation jobInformation) {
		if(!checkIfJobStatusIsFalseWithDepartureDate(jobInformation)) {
			return new ErrorResult("If you have done  your work, you have to entry the departure date");
		}
		
		
		this.jobInformationDao.save(jobInformation);
		return new SuccessResult("Added");
	}

	
	@Override
	public DataResult<List<JobInformation>> getAllByResumes_ResumeIdOrderByJobDepartureDateDesc(int resumeId) {
		return new SuccessDataResult<List<JobInformation>>(this.jobInformationDao.getAllByResume_ResumeIdOrderByJobDepartureDateDesc(resumeId),
				"Listed");
	}
	
	//business method
	
	private boolean checkIfJobStatusIsFalseWithDepartureDate(JobInformation jobInformation) {
		if(!jobInformation.isWorkStatus() &&  jobInformation.getJobDepartureDate()==null) {
			return false;
		}
		return true;
	}

}
