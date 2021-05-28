package gameDemo;

public interface SaleServices {
	
	void withCampaign(Gamer gamer,Game game, Campaign campaign);
	void withoutCampaign(Game game, Gamer gamer, Campaign campaign);

}
