package vehicle;
import java.util.Scanner;

public class VehicleDisplayer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name of owner:");
		String owner = scan.nextLine();
		
		System.out.println("Enter number of wheels:");
		int num = scan.nextInt();
		
		System.out.println("Enter brand:");
		String brand1 = scan.nextLine();
		
		Bicycle bike = new Bicycle(owner, num, brand1);
		bike.toString();
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter name of owner:");
		String owner2 = scan2.nextLine();
		
		System.out.println("Enter number of wheels:");
		int num2 = scan2.nextInt();
		
		System.out.println("Enter brand:");
		String brand2 = scan2.nextLine();
		
		System.out.println("Enter Engine Volume:");
		int EngineVolume = scan2.nextInt();
		
		MotorizedVehicle car = new MotorizedVehicle(owner2, num2, brand2, EngineVolume);
		car.toString();
		car.horsepower(num2, EngineVolume);
		
		scan.close();
		scan2.close();

	}

}
