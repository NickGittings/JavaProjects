package newspaper;
import java.util.Scanner;
import java.util.ArrayList;

public class Subscribers {
		
	public static void main(String[] args) {
		//Boolean to run menu
		boolean running = true;
		
		//Creating ArrayList of NewsPaperSubscriber
		ArrayList<NewsPaperSubscriber> subscribers = new ArrayList<NewsPaperSubscriber>();
		
		//Creating scan object for user input
		Scanner scan = new Scanner(System.in);
		
		//While loop menu
		while(running) {
			System.out.println("NewsPaper Subscribers Terminal");
			System.out.println("1. Add new Subscriber");
			System.out.println("2. View Current Subscribers");
			System.out.println("3. Exit");
			String message = scan.nextLine();
			
			//Adding Subscriber menu option
			if(message.equalsIgnoreCase("1")) {
				System.out.println("What type of account would you like? 1. Seven Day 2. Weekday 3. Weekend");
				String typeofAccount = scan.nextLine();
				System.out.println("Enter Street Address");
				String address = scan.nextLine();
				
				//Adding subscriber menu option
				if(typeofAccount.equalsIgnoreCase("1")) {
					SevenDaySubscriber sevenday = new SevenDaySubscriber(address);
					//Checks to see if array empty and adds
					if(subscribers.size() == 0) {
						subscribers.add(sevenday);
					}
					//Checks to see if address is already used
					else {
						for(int n = 0; n < subscribers.size(); n++) {
							if(sevenday.equals(sevenday, subscribers.get(n))) {
								System.out.println("Address already used... returning to menu");
							}
							else {
								subscribers.add(sevenday);
							}
						}
					}
				}
				
				//Adding Weekday subscriber
				else if(typeofAccount.equalsIgnoreCase("2")) {
					
					WeekdaySubscriber weekday = new WeekdaySubscriber(address);
					
					//Checks to see if array empty and adds
					if(subscribers.size() == 0) {
						subscribers.add(weekday);
					}
					//Checks to see if address is already used
					else {
						for(int n = 0; n < subscribers.size(); n++) {
							if(weekday.equals(weekday, subscribers.get(n))) {
								System.out.println("Address already used... returning to menu");
							}
							else {
								subscribers.add(weekday);
							}
						}
					}
					
					
				}
				//Adding Weekend subscriber
				else if(typeofAccount.equalsIgnoreCase("3")) {
					WeekendSubscriber weekend = new WeekendSubscriber(address);
					
					//Checks to see if array empty and adds
					if(subscribers.size() == 0) {
						subscribers.add(weekend);
					}
					//Checks to see if address is already used
					else {
						for(int n = 0; n < subscribers.size(); n++) {
							if(weekend.equals(weekend, subscribers.get(n))) {
								System.out.println("Address already used... returning to menu");
							}
							else {
								subscribers.add(weekend);
							}
						}
					}
				}
				//Invalid input
				else {
					System.out.println("Error: Wrong input... returning to menu");
				}
				
			}
			//Viewing subscribers menu option
			else if (message.equalsIgnoreCase("2")) {
				for(int n = 0; n < subscribers.size(); n++) {
					System.out.printf("Customer #%d:\n", n+1);
					System.out.println(subscribers.get(n).toString());
					System.out.println();
				}
				
			}
			//Exit program menu option
			else if (message.equalsIgnoreCase("3")) {
				running = false;
				scan.close();
			}
			//Invalid input
			else {
				System.out.println("Error: Wrong input... returning to menu");
			}
			
		}

	}

}
