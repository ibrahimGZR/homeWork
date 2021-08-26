package dataAccess;

import entities.Campaign;

public class CampaignDao implements CampaignDaoRepository {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Eklendi");
	}

	@Override
	public void list() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Güncellendi");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Silindi");

	}

}
