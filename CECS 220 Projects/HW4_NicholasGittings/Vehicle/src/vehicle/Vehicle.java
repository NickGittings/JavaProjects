package vehicle;

public abstract class Vehicle {
	private String OwnerName;
	private int numberofWheels;
	
	public String getOwnerName() {
		return OwnerName;
	}
	public int getnumberofWheels() {
		return numberofWheels;
	}
	public void setOwnerName(String owner) {
		this.OwnerName = owner;
	}
	public void setnumberofWheels(int num) {
		this.numberofWheels = num;
	}
}
