package vehicle;

public class Bicycle extends Vehicle {
	private String Brand;
	
	Bicycle(String OwnerName, int numberofWheels, String Brand) {
		OwnerName = getOwnerName();
		numberofWheels = getnumberofWheels();
		this.Brand = Brand;
	}
	
	public String toString() {
		String Formatted = "Owner name: " + getOwnerName() + "\n" + "Number of Wheels: " + getnumberofWheels() + "\n" + "Brand: " + Brand;
		return Formatted;
	}
	
	public String getBrand() {
		return Brand;
	}
}
