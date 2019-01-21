package newspaper;

public class WeekendSubscriber extends NewsPaperSubscriber {
	
	//Constructor
	public WeekendSubscriber(String subAddress) {
		super(subAddress);
		setRate(4.5);
	}
	//toString method
	public String toString() {
		String address = super.getSubscriberAddress();
		String rate = String.valueOf(super.getSubscriptionRate());
		
		return "Address: " + address + "\n" + "Subscription Rate: " + rate + "\n" + "Service: Weekend Subscriber";
	}
	//Setting abstract setRate
	public void setRate(double subRate) {
		super.subRate = subRate;
		
	}
}
