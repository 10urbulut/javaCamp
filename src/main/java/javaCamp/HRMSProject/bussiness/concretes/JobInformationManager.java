package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.JobInformationService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.dataAccess.abstracts.JobInformationDao;
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
		// TODO Auto-generated method stub
		return null;
	}

}
