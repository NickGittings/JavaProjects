package ship;
import java.util.ArrayList;
import java.util.Scanner;
import ship.Package.Shipping;

public class PackageDelivery {

	public static void main(String[] args) {
		ArrayList<String> packageList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		System.out.println("How many packages?");
		int n = scan.nextInt();
		
		while(i < n) {
			System.out.println("Package Weight?");
			double weight = scan.nextDouble();
			
			System.out.println("Shipping Method?");
			String message = scan.nextLine();
			
			Shipping shipType = Shipping.valueOf(message);
			
			System.out.println("Destination?");
			String destination = scan.nextLine();
			
			Package pack = new Package(weight, shipType, destination);
			int id = pack.GenerateID();
			double cost = pack.calculateCost(weight, shipType);
			String packageInfo = pack.packageInfo(id, weight, cost, shipType, destination);
			packageList.add(packageInfo);
		}
		
		scan.close();
		
		int index = 0;
		while(index < packageList.size()) {
			System.out.println(packageList.get(index));
			index++;
		}
		

	}

}
