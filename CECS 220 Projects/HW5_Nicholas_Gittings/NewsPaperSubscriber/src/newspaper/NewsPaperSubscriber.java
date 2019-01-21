package newspaper;

public abstract class NewsPaperSubscriber {
	private String subAddress;
	public double subRate;
	
	//Constructor
	NewsPaperSubscriber(String subAddress) {
		this.subAddress = subAddress;
	}
	
	//Abstract setRate
	protected abstract void setRate(double subRate);
	
	//equals method to check and see if object's addresses are equal
	public boolean equals(NewsPaperSubscriber pObject1, NewsPaperSubscriber pObject2) {
		if(pObject1.subAddress.equals(pObject2.subAddress)) {
			return true;
		}
		else {
			return false;
		}
	}

	//method to get address
	protected String getSubscriberAddress() {
		return subAddress;
	}
	
	//method to set address
	private void setSubscriberAddress(String subscriberAddress) {
		this.subAddress = subscriberAddress;
	}
	
	//method to get subRate
	protected double getSubscriptionRate() {
		return subRate;
	}
}
