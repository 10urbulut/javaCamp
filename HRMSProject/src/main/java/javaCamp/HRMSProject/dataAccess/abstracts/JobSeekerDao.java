package javaCamp.HRMSProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;


public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	
		boolean existsByeMailIs(String eMail);
		boolean existsByNationalityIdIs(String nationalityId);

}
