package javaCamp.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	boolean existsByeMailIs(String eMail);
	
}
