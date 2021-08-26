package business;

import dataAccess.CampaignDaoRepository;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	CampaignDaoRepository campaignDaoRepository;
	
	public CampaignManager(CampaignDaoRepository campaignDaoRepository) {
		super();
		this.campaignDaoRepository = campaignDaoRepository;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDaoRepository.add(campaign);
		
	}

	@Override
	public void list() {
		campaignDaoRepository.list();
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDaoRepository.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDaoRepository.delete(campaign);
		
	}

}
