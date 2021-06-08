package javaCamp.HRMSProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import javaCamp.HRMSProject.entities.concretes.Resume;


public interface ResumeDao extends JpaRepository<Resume, Integer> {


	


}
