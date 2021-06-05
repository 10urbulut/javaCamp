package javaCamp.HRMSProject.core.adapter;


import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.validations.IdentityCheckService;
import javaCamp.HRMSProject.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
@Service
public class MernisServiceAdapter implements IdentityCheckService {
	
		public boolean checkIfRealPerson(JobSeeker jobSeeker) {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			boolean serviceResult= false;
			try {
				serviceResult = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()), 
						jobSeeker.getFirstName().toUpperCase(), 
						jobSeeker.getLastName().toUpperCase(), 
						jobSeeker.getBirthYear());

			} catch (Exception e) {
				System.out.println("Hatalı işlem, Geçerli bir kişi degil.");
			}
			return serviceResult;
	
		}
}
