package javaCamp.HRMSProject.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.EducationInformation;

public interface EducationInformadionDao extends JpaRepository<EducationInformation,Integer>{

	List<EducationInformation>getAllByResume_ResumeIdOrderByGraduationDateDesc(int resumeId);
	
}
