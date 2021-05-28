package gameDemo;

public class Campaign {
	private int id;
	private String campaignType;
	private double discountRate;
	
	public Campaign() {
		
	}
	
	
	
	public Campaign(int id, String campaignType, double discountRate) {
		super();
		this.id = id;
		this.campaignType = campaignType;
		this.discountRate = discountRate;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
