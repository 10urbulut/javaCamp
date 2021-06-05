package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.Resume;
import javaCamp.HRMSProject.entities.concretes.Dtos.ResumeAllDto;


public interface ResumeService {

	DataResult<List<Resume>> getAll();
	Result add(Resume resume);
 

}
