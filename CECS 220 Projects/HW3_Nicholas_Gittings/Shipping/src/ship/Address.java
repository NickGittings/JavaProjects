package ship;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	public void setstreetAddress(String pstreetAddress) {
		streetAddress = pstreetAddress;
	}
	
	public void setcity(String pcity) {
		city = pcity;
	}
	
	public void setstate(String pstate) {
		state = pstate;
	}
	
	public void setzipCode(String pzipCode) {
		zipCode = pzipCode;
	}
	
	public String getstreetAddress() {
		return streetAddress;
	}
	
	public String getcity() {
		return city;
	}
	
	public String getstate() {
		return state;
	}
	
	public String getzipCode() {
		return zipCode;
	}
	
	public String displayAddress() {
		return streetAddress + " " + city + ", " + state + " " + zipCode;
	}
}
