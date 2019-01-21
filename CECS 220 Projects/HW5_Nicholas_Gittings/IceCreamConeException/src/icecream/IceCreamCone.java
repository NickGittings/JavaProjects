package icecream;
import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamCone {
	private String Flavor;
	private int Scoops;
	private final ArrayList<String> FLAVORS = new ArrayList<String>(Arrays.asList("Vanilla", "Chocolate", "Strawberry"));
	
	IceCreamCone(String Flavor, int Scoops) throws IceCreamConeException {
		setFlavor(Flavor);
		setScoops(Scoops);
	}
	
	private void setFlavor(String Flavor) throws IceCreamConeException {
		if(Flavor.equals("Vanilla") || Flavor.equals("Chocolate") || Flavor.equals("Strawberry")) {
			this.Flavor = Flavor;
		}
		else {
			throw new IceCreamConeException("Wrong Flavor");
		}
		
	}
	
	private void setScoops(int Scoops) throws IceCreamConeException {
		if(Scoops <= 4) {
			this.Scoops = Scoops;
		}
		else {
			throw new IceCreamConeException("Too many scoops, greater than 4");
		}
	}
	
	private ArrayList<String> getFLAVORS() {
		return FLAVORS;
	}
	
	public String toString() {
		return "Flavor: " + Flavor + "\n" + "Scoops: " + String.valueOf(Scoops) + "\n";
	}
}
