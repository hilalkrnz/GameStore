package Entities;

import java.time.LocalDate;

public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private int discount;
	private LocalDate startDate;
	private LocalDate finishDate;
	private int time;
	
	
	public Campaign() {
		super();
	}


	


	public Campaign(int campaignId, String campaignName, int discount, LocalDate startDate, LocalDate finishDate,
			int time) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.time = time;
	}





	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getDiscount(Game game) {
		return (int) (game.getGamePrice() - ((int) (game.getGamePrice()*this.discount) / 100)) ;
	}



	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getFinishDate() {
		return finishDate;
	}


	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	
	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	
	

}
