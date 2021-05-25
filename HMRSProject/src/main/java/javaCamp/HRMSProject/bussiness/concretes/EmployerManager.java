package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.EmployerService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.EmployerDao;
import javaCamp.HRMSProject.entities.concretes.Employer;


@Service

public class EmployerManager implements EmployerService{
	
	EmployerDao employerDao;
	
	@Autowired
	EmployerManager (EmployerDao employerDao){
		
		this.employerDao=employerDao;
	}
	
	

	@Override
	public Result add(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("Ekleme başarılı");
		
	}

	@Override
	public Result delete(Employer employer) {
		employerDao.delete(employer);
		return null;
	}

	@Override
	public Result update(Employer employer) {
		return null;
		
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}

	@Override
	public DataResult<Employer> getById(int id) {
		
		return null;
	}

}
