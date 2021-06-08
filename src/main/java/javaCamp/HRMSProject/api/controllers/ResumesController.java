package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javaCamp.HRMSProject.bussiness.abstracts.ResumeService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	ResumeService resumeService;
	
	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}


	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll(){
		
		return this.resumeService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		
		return this.resumeService.add(resume);
	}
	
	
}

