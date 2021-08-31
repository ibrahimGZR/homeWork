package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class JpaCampaignDao implements CampaignDao {

	List<Campaign> campaigns;

	public JpaCampaignDao() {
		super();
		this.campaigns = new ArrayList<Campaign>();
	}

	@Override
	public void add(Campaign entity) {
		this.campaigns.add(entity);

	}

	@Override
	public List<Campaign> getAll() {

		return this.campaigns;
	}

	@Override
	public void update(Campaign entity) {
		int index = this.campaigns.indexOf(entity);

		Campaign campaign = this.campaigns.get(index);

		campaign.setId(entity.getId());
		campaign.setName(entity.getName());
		campaign.setDiscountRate(entity.getDiscountRate());

	}

	@Override
	public void delete(Campaign entity) {
		this.campaigns.remove(entity);

	}

}
