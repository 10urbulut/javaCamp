package javaCamp.HRMSProject.api.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.JobSeekerService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.core.utilities.results.SuccessResult;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	JobSeekerService jobSeekerService;
	
	public JobSeekersController(JobSeekerService jobSeekerService) {
		
		this.jobSeekerService=jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult< List<JobSeeker>> getAll(){
		
		return jobSeekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		
		return jobSeekerService.add(jobSeeker);
		
		
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeeker jobSeeker) {
		
		 jobSeekerService.delete(jobSeeker);
		 return  new SuccessResult("Kayıt silindi");
	}

}
