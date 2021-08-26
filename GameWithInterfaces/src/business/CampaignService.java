package business;

import entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void list();
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
