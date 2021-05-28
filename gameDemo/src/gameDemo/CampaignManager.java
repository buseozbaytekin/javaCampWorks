package gameDemo;

public class CampaignManager {
	public void newCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getCampaignType());
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getCampaignType());

	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getCampaignType());

	}
}
