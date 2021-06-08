package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.JobInformationService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.JobInformation;

@RestController
@RequestMapping("/api/jobinformations")
public class JobInformationsController {
	
	private JobInformationService jobInformationService;
	
	@Autowired
	public JobInformationsController(JobInformationService jobInformationService) {
		super();
		this.jobInformationService = jobInformationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobInformation jobInformation) {
		
		return this.add(jobInformation);
	}


	@GetMapping("/getall")
	public DataResult<List<JobInformation>> getAll(){
		
		return this.jobInformationService.getAll();
	}
	
	@GetMapping("/getAllByResumeIdOrderByJobDepartureDateDesc")
	public DataResult<List<JobInformation>> getAllByResumeIdOrderByJobDepartureDateDesc(@RequestParam int resumeId){
		return this.jobInformationService.getAllByResumes_ResumeIdOrderByJobDepartureDateDesc(resumeId);
	}

}
