package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.EmployerService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.ErrorResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.core.validations.identityValidation.ConfirmToEmployerService;
import javaCamp.HRMSProject.core.validations.identityValidation.EMailVerificationService;
import javaCamp.HRMSProject.dataAccess.abstracts.EmployerDao;
import javaCamp.HRMSProject.entities.concretes.Employer;

@Service

public class EmployerManager implements EmployerService{
	
	EmployerDao employerDao;
	EMailVerificationService eMailVerificationService;
	ConfirmToEmployerService confirmToEmployerService;
	
	@Autowired
	EmployerManager (EmployerDao employerDao,
			EMailVerificationService eMailVerificationService,
			ConfirmToEmployerService confirmToEmployerService){
		
		this.employerDao=employerDao;
		this.eMailVerificationService=eMailVerificationService;
		this.confirmToEmployerService=confirmToEmployerService;
	}
	
	

	@Override
	public Result add(Employer employer) {
		
		if(!nullAndEmptyBlocker(employer)) {
			return new ErrorResult("Tüm alanlar dolmalıdır.");
		}
		else if(checkForCompareToCompanyMail(employer)) {
			return new ErrorResult("Mail şirket adı ile eşleşmiyor");			
			}
		else if(!checkIfEMailExists(employer)) {
			return new ErrorResult("Mail adresi zaten var");
		}
		else if(!checkIfPasswordAgainControl(employer)) {
			return new ErrorResult("Parololar aynı değil");
		}
		else if(!eMailVerificationService.mailVerificationSending(employer.getEMail())) {
			return new ErrorResult("Mail doğrulanamadı");
		}
		else if(!confirmToEmployerService.confirmToEmployer(employer)) {
			return new ErrorResult("Onay reddedildi");
		}
		else {
			employerDao.save(employer);
			return new SuccessResult("Ekleme başarılı");
			
		}
		
		
		
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
	
	
	// buradan aşağısı iş kuralları metodları
	
	
	  boolean nullAndEmptyBlocker(Employer employer) {
		  
			if (employer.getFirstName().isEmpty() 
					|| employer.getLastName().isEmpty() 
					|| employer.getEMail().isEmpty() 
					|| employer.getWebSiteName().isEmpty() 
					|| employer.getPassword().isEmpty()
					|| employer.getPhoneNumber().isEmpty()
					||employer.getCompanyName().isEmpty()) {
			
				return false;
			}
			else {
				return true;
			}
	  }	
	  
	  boolean checkForCompareToCompanyMail(Employer employer) {
		  if(employer.getEMail().contains(employer.getCompanyName().substring(0,3))) {
			  return false;
		  }
		  
		  
		  return true;
	  }
	  
	  boolean checkIfEMailExists(Employer employer) {
		  
			if( employerDao.existsByeMailIs(employer.getEMail())) {	
				return false;	
			}  
			  return true;
	}
	  
	  boolean checkIfPasswordAgainControl(Employer employer) {
		  
		  if(!employer.getPassword().contains(employer.getPasswordAgain())) {
			 
			  return false;
		  }
		  
		  return true;
	  }
	  

	 
	 
}