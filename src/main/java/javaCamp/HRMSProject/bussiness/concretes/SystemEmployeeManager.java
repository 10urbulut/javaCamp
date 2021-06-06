package javaCamp.HRMSProject.bussiness.concretes;

import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.SystemEmployeeService;
import javaCamp.HRMSProject.entities.concretes.Employer;


@Service
public class SystemEmployeeManager implements SystemEmployeeService{

	@Override
	public boolean confirmToEmployer(Employer employer) {
			return true;//onay butonu
	}

}
