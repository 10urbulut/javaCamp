package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.EducationInformationService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.ErrorResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.EducationInformadionDao;
import javaCamp.HRMSProject.entities.concretes.EducationInformation;


@Service
public class EducationInformationManager implements EducationInformationService{
		private EducationInformadionDao educationInformationDao;
	
		@Autowired
	public EducationInformationManager(EducationInformadionDao educationInformationDao) {
			super();
			this.educationInformationDao = educationInformationDao;
		}

	@Override
	public DataResult<List<EducationInformation>> getAll() {
		
		return new SuccessDataResult<List<EducationInformation>>( this.educationInformationDao.findAll(),"Listed");
	}

	
	@Override
	public Result add(EducationInformation educationInformation) {
		if(!checkIfEducationStatusIsFalseWithGraduationDate(educationInformation)) {
			return new ErrorResult("If you have done  your education, you have to entry the graduation date ");
		}
		
		
		this.educationInformationDao.save(educationInformation);
		
		
		return new SuccessResult("Education information added");
	}

	@Override
	public DataResult<List<EducationInformation>> findAllByResumeIdOrderByGraduationDateDesc(int resumeId) {
		
		
		
		return new SuccessDataResult<List<EducationInformation>>
		(this.educationInformationDao.getAllByResume_ResumeIdOrderByGraduationDateDesc(resumeId),
				"Listed");
	}

	
	
	// business method
	
	private boolean checkIfEducationStatusIsFalseWithGraduationDate(EducationInformation educationInformation) {
		if(!educationInformation.isEducationStatus() &&  educationInformation.getGraduationDate()==null) {
			return false;
		}
		return true;
	}
	
	
	
}
