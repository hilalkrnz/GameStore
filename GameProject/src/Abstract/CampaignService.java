package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	
	void campaignAdd(Game game, Campaign campaign);
	void campaignDelete(Campaign campaign);
	void campaignUpdate(Campaign campaign);

}
