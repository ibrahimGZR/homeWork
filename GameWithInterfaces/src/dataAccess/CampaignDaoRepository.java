package dataAccess;

import entities.Campaign;

public interface CampaignDaoRepository {
	void add(Campaign campaign);
	void list();
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
