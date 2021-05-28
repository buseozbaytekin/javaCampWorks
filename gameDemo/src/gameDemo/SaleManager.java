package gameDemo;

public class SaleManager implements SaleServices{

	@Override
	public void withCampaign( Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.firstName + " " + campaign.getCampaignType() + " kampanyası " + game.gameName + " için uygulandı." );
		
	}

	@Override
	public void withoutCampaign(Game game, Gamer gamer, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}