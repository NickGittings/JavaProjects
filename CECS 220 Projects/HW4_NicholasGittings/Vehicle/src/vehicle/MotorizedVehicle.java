package vehicle;

public class MotorizedVehicle extends Vehicle {
	private String Brand;
	private int EngineVolume;
	
	MotorizedVehicle(String OwnerName, int numberofWheels, String Brand, int EngineVolume) {
		OwnerName = getOwnerName();
		this.Brand = Brand;
		this.EngineVolume = EngineVolume;
	}
	
	public int horsepower(int pWheels, int pEngineVolume) {
		int horsepower = pWheels * pEngineVolume;
		return horsepower;
	}
	
	public String toString() {
		String enginev = String.valueOf(EngineVolume);
		String Formatted = "Owner name: " + getOwnerName() + "\n" + "Number of Wheels: " + getnumberofWheels() + "\n" + "Brand: " + Brand + "\n" + "Engine Volume: " + enginev + "\n" + "Horsepower: " + String.valueOf(horsepower(getnumberofWheels(), EngineVolume)) ;
		return Formatted;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public int getEngineVolume() {
		return EngineVolume;
	}
	
}
