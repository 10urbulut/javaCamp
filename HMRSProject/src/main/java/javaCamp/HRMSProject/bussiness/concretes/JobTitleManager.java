package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.JobTitleService;
import javaCamp.HRMSProject.dataAccess.abstracts.JobTitleDao;
import javaCamp.HRMSProject.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{
	JobTitleDao jobtitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobtitleDao) {
		super();
		this.jobtitleDao = jobtitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return this.jobtitleDao.findAll();
	}

}
