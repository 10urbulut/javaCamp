package Bussiness;


import DataAccess.ICampaignDal;
import Entity.Campaign;

public class CampaignManager implements ICampaignService{
	ICampaignDal campaignDal;

	public CampaignManager(ICampaignDal campaignDal) {
		this.campaignDal = campaignDal;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDal.add(campaign);
	
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDal.delete(campaign);
		
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDal.update(campaign);
		
		
	}

}
