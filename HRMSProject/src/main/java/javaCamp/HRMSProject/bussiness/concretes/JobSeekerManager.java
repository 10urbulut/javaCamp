package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import javaCamp.HRMSProject.bussiness.abstracts.JobSeekerService;
import javaCamp.HRMSProject.bussiness.validations.IdentityCheckService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.ErrorResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.core.validations.identityValidation.EMailVerificationService;
import javaCamp.HRMSProject.dataAccess.abstracts.JobSeekerDao;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager   implements JobSeekerService{
	
	private JobSeekerDao jobSeekerDao;
	private IdentityCheckService identityCheckerService;
	private EMailVerificationService eMailVerificationService;


	@Autowired
	public JobSeekerManager (JobSeekerDao jobSeekerDao,	
			IdentityCheckService identityCheckerService,
			EMailVerificationService eMailVerificationService)
	{
		this.jobSeekerDao=jobSeekerDao;
		this.identityCheckerService=identityCheckerService;
		this.eMailVerificationService = eMailVerificationService;
	
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		
		if(!this.nullAndEmptyBlocker(jobSeeker)){
			return new ErrorResult("Alanlar boş olamaz");
		}
		else if (!checkIfEMailExists(jobSeeker)) 
		{
		return new ErrorResult("Mail adresi zaten var");
		}
		else if (!checkIfNationalityIdExists(jobSeeker)) {
			return new ErrorResult("Tc numarası zaten var");
		}
		else if(!checkIfPasswordAgainControl(jobSeeker)) {
			
			return new ErrorResult("Parolalar aynı değil");
		}
		
		
		else if(identityCheckerService.checkIfRealPerson(jobSeeker)) {
			
			return new ErrorResult("Kimlik doğrulanamadı");
		}
		else if(!eMailVerificationService.mailVerificationSending(jobSeeker.getEMail())) {
			return new ErrorResult("Mail doğrulanamadı");
		}
		
		else {
	
			jobSeekerDao.save(jobSeeker);		
			return new SuccessResult("Ürün eklendi");
			
		
		}

	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		return null; 
		
	}

	@Override
	public Result delete( JobSeeker jobSeeker) {
		
		jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("ürün silindi");
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>> (this.jobSeekerDao.findAll());
	}
	
// buradan aşağısı iş kuralı metodları

	  boolean nullAndEmptyBlocker(JobSeeker jobSeeker) {
		  
		if (jobSeeker.getFirstName().isEmpty() 
				|| jobSeeker.getLastName().isEmpty() 
				|| jobSeeker.getEMail().isEmpty() 
				|| jobSeeker.getNationalityId().isEmpty() 
				|| jobSeeker.getPassword().isEmpty()|| jobSeeker.getBirthYear()<=1900)
				
		{
			return false;
		} 
		else 
		{
			return true;
		}

	}
	  
	  boolean checkIfEMailExists(JobSeeker jobSeeker) {
		  
		if( jobSeekerDao.existsByeMailIs(jobSeeker.getEMail())) {
			
			return false;
			
			}  
		
		  return true;
		  
		}
	  
	  
	  boolean checkIfNationalityIdExists(JobSeeker jobSeeker) {
		  
		 if (jobSeekerDao.existsByNationalityIdIs(jobSeeker.getNationalityId())) {
			
			 return false;
		 }
		 
		 return true;
	  }
	  
	  boolean checkIfPasswordAgainControl(JobSeeker jobSeeker) {
		  
		  if(!jobSeeker.getPassword().contains(jobSeeker.getPasswordAgain())) {
			 
			  return false;
		  }
		  
		  return true;
	  }
	  
	  
	  

	
}
