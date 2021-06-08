package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.JobInformation;

public interface JobInformationService {
	DataResult<List<JobInformation>> getAll();
	Result add(JobInformation jobInformation);
	DataResult<List<JobInformation>> getAllByResumes_ResumeIdOrderByJobDepartureDateDesc(int resumeId);

}
