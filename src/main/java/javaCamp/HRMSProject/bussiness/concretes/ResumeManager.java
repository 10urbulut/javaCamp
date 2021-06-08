package javaCamp.HRMSProject.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.ResumeService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessDataResult;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.dataAccess.abstracts.ResumeDao;
import javaCamp.HRMSProject.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> getAll() {

		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll());
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Added");
	}

	


}
