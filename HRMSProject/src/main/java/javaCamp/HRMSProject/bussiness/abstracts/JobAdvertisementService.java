package javaCamp.HRMSProject.bussiness.abstracts;



import java.sql.Date;
import java.util.List;

import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.core.utilities.results.Result;
import javaCamp.HRMSProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getByStatus(boolean status);

    Result add(JobAdvertisement jobAdvertisement);
    Result update(JobAdvertisement jobAdvertisement);
    
    DataResult<List<JobAdvertisement>> findByStatusAndPublicationDate(boolean status, Date date);
    DataResult<List<JobAdvertisement>> findByEmployer_CompanyNameAndStatus(
    		String companyName,boolean status );
}
