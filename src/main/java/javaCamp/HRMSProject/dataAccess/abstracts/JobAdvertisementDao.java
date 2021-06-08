package javaCamp.HRMSProject.dataAccess.abstracts;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement>findByStatus(boolean status);
	List<JobAdvertisement>findByStatusAndPublicationDate(boolean status, Date date);
	List<JobAdvertisement>findByEmployer_CompanyNameAndStatus(String companyName,boolean status );
	
	
}

