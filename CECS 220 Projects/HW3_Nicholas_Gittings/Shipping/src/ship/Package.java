package ship;
import java.util.Random;

public class Package {
	
	public static enum Shipping {Air, Ground, Sea};
	private int TrackingID;
	private double Weight;
	private double Cost;
	private Shipping shipMethod;
	private String Destination;
	
	public int GenerateID() {
		Random rand = new Random();
		TrackingID = rand.nextInt(999999) + 1;
		return TrackingID;
	}
	
	public double calculateCost(double pWeight, Shipping pshipMethod) {
		if(pshipMethod == Shipping.Air) {
			if(pWeight >= 1 && pWeight <= 8) {
				double Cost = 4.00;
			}
			if(pWeight >= 9 && pWeight <= 16) {
				double Cost = 6.00;
			}
			if(pWeight >= 17) {
				double Cost = 9.00;
			}
		}
		
		if(pshipMethod == Shipping.Ground) {
			
			if(pWeight >= 1 && pWeight <= 8) {
				double Cost = 1.80;
			}
			if(pWeight >= 9 && pWeight <= 16) {
				double Cost = 2.80;
			}
			if(pWeight >= 17) {
				double Cost = 4.00;
			}
			
		}
		
		if(pshipMethod == Shipping.Sea) {
			
			if(pWeight >= 1 && pWeight <= 8) {
				double Cost = 0.55;
			}
			if(pWeight >= 9 && pWeight <= 16) {
				double Cost = 1.50;
			}
			if(pWeight >= 17) {
				double Cost = 2.00;
			}
		}
		return Cost;
	}
	
	Package(double pWeight, Shipping pshipMethod, String pDestination) {
		
		Weight = pWeight;
		shipMethod = pshipMethod;
		Destination = pDestination;
		Cost = calculateCost(pWeight, pshipMethod);
		
	}
	
	public void setTrackingID(int pTrackingID) {
		TrackingID = pTrackingID;
	}
	
	public void setWeight(double pWeight) {
		Weight = pWeight;
	}
	
	public void setCost(double pCost) {
		Cost = pCost;
	}
	
	public void setshipMethod(Shipping pshipMethod) {
		shipMethod = pshipMethod;
	}
	
	public void setDestination(String pDestination) {
		Destination = pDestination;
	}
	
	public int getTrackingID() {
		return TrackingID;
	}
	
	public double getWeight() {
		return Weight;
	}
	
	public double getCost() {
		return Cost;
	}
	
	public Shipping getshipMethod() {
		return shipMethod;
	}
	
	public String getDestination() {
		return Destination;
	}
	
	public String packageInfo(int TrackingID, double Weight, double Cost, Shipping shipMethod, String Destination) {
		String Formatted = String.valueOf(TrackingID) + "\n" +  String.valueOf(Weight) + "\n" + String.valueOf(Cost) + "\n" + String.valueOf(shipMethod) + "\n" + Destination;
		return Formatted;
	}
	
	
}
