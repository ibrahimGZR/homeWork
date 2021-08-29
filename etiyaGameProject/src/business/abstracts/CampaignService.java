package business.abstracts;

import entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void getAll();
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
