package icecream;
import java.util.ArrayList;
import java.util.Scanner;

public class IceCreamConeDisplayer {

	public static void main(String[] args) {
		ArrayList<IceCreamCone> listofIceCream = new ArrayList<IceCreamCone>(10);
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		
		while(counter != 10) {
			try {
				System.out.printf("Ice Cream #%d\n", counter + 1);
				System.out.println("Enter Ice Cream Flavor (Vanilla, Chocolate, Strawberry)");
				String flavor = scan.nextLine();
				System.out.println("Enter Number of Scoops (Max is 4)");
				String scoops = scan.nextLine();
				IceCreamCone icecream = new IceCreamCone(flavor, Integer.parseInt(scoops));
				listofIceCream.add(icecream);
				counter++;
			}
			catch (IceCreamConeException icecream){
				System.out.println(icecream.getMessage());
				icecream.printStackTrace();
			}
		}
		
		System.out.println(listofIceCream);
		scan.close();
	}

}
