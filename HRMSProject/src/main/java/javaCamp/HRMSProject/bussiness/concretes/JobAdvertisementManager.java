package javaCamp.HRMSProject.bussiness.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.JobAdvertisementService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.JobAdvertisementDao;
import javaCamp.HRMSProject.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatus(boolean status) {
		
		status = true;
		return new SuccessDataResult<List<JobAdvertisement>>(
			 this.jobAdvertisementDao.findByStatus(status));
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByStatusAndPublicationDate(boolean status, Date date) {
		status = true;
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findByStatusAndPublicationDate(status,date));
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByEmployer_CompanyNameAndStatus(String companyName, boolean status) {
	
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.jobAdvertisementDao.findByEmployer_CompanyNameAndStatus(companyName, status));
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult();
	}
}
