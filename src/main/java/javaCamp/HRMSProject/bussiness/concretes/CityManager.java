package javaCamp.HRMSProject.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaCamp.HRMSProject.bussiness.abstracts.CityService;
import javaCamp.HRMSProject.dataAccess.abstracts.CityDao;

@Service
public class CityManager implements CityService{
	CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}	

}
