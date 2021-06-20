package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class SummerCampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Game game, Campaign campaign) {
		
		System.out.println("Game called '" + game.getGameName() + "' " + campaign.getDiscount(game) + " TL for " + campaign.getTime() + " days!");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " campaign is over.");
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " campaign updated.");
		
	}

	}

