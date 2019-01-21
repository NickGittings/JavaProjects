package newspaper;

public class SevenDaySubscriber extends NewsPaperSubscriber {
	
	//Constructor
	public SevenDaySubscriber(String subAddress) {
		super(subAddress);
		setRate(10.5);
	}
	
	//toString method
	public String toString() {
		String address = super.getSubscriberAddress();
		String rate = String.valueOf(super.getSubscriptionRate());
		
		return "Address: " + address + "\n" + "Subscription Rate: " + rate + "\n" + "Service: Seven Day Subscriber";
	}
	
	//Setting abstract setRate
	public void setRate(double subRate) {
		super.subRate = subRate;
		
	}
}
