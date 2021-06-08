package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.EducationInformation;

public interface EducationInformationService {
	DataResult<List<EducationInformation>> getAll();
	Result add(EducationInformation educationInformation);
	DataResult<List<EducationInformation>> findAllByResumeIdOrderByGraduationDateDesc(int resumeId);

}
