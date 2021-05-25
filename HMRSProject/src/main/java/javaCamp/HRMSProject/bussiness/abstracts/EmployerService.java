package javaCamp.HRMSProject.bussiness.abstracts;

import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	Result delete(Employer employer);
	Result update(Employer employer);
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getById(int id);

}
