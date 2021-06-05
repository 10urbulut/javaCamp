package javaCamp.HRMSProject.entities.concretes.Dtos;

import java.util.List;

import javaCamp.HRMSProject.entities.concretes.EducationInformation;
import javaCamp.HRMSProject.entities.concretes.JobInformation;
import javaCamp.HRMSProject.entities.concretes.Resume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeAllDto {
	

	private Resume resume;
	
	private List<JobInformation> jobInformations;
	
	private List<EducationInformation> educationInformations;
	

	

	
}
