package gameDemo;

public class Main {

	public static void main(String[] args) {
		Gamer buse = new Gamer(1,"Buse","Özbaytekin",1996,"1111111");
		Gamer mustafa = new Gamer(2,"Mustafa","Bilce",1996,"2222222");
		
		Game first = new Game (1,"First game",39.90);
		Game second = new Game (2,"Second game",59.90);
		
		GameManager gameManager = new GameManager();
		gameManager.buy(second, mustafa);
		
		Campaign firstPurchase = new Campaign (1,"İlk alışverişe özel %10 indirim",0.10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.newCampaign(firstPurchase);
		
		SaleManager saleManager= new SaleManager();
		saleManager.withCampaign(mustafa, first, firstPurchase);
		
		EDevletVerificationManager eDevletVerificationManager = new EDevletVerificationManager();
		eDevletVerificationManager.eDevlet(buse);
	}

}
