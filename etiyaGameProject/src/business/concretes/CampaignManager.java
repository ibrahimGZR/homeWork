package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	CampaignDao campaignDao;
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " Eklendi");
        this.campaignDao.add(campaign);
    }

    @Override
    public List<Campaign> getAll() {
        System.out.println(" Listelendi");
        return this.campaignDao.getAll();
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " Güncellendi");
        this.campaignDao.update(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " Silindi");
        this.campaignDao.delete(campaign);
    }

}
