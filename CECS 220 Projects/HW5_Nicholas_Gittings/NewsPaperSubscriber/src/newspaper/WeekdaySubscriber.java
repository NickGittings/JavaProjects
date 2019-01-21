package newspaper;

public class WeekdaySubscriber extends NewsPaperSubscriber {
	
	//Constructor
	public WeekdaySubscriber(String subAddress) {
		super(subAddress);
		setRate(7.5);
	}
	//toString method
	public String toString() {
		String address = super.getSubscriberAddress();
		String rate = String.valueOf(super.getSubscriptionRate());
		
		return "Address: " + address + "\n" + "Subscription Rate: " + rate + "\n" + "Service: Weekday Subscriber";
	}
	//Setting abstract setRate
	public void setRate(double subRate) {
		super.subRate = subRate;
		
	}
}
