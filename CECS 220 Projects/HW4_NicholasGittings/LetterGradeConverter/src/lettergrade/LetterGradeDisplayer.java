package lettergrade;
import java.util.Scanner;

public class LetterGradeDisplayer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//First file
		System.out.println("Enter file path:");
		String message = scan.nextLine();
		
		System.out.println("Enter max size of grade list:");
		int actialLength = scan.nextInt();
		
		LetterGradeConverter object1 = new LetterGradeConverter(message, actialLength);
		object1.toString();
		
		
		
		Scanner scan2 = new Scanner(System.in);
		
		//Second file
		System.out.println("Enter another file path:");
		String message2 = scan2.nextLine();
		
		System.out.println("Enter max size of second grade list:");
		int actialLength2 = scan2.nextInt();
		
		LetterGradeConverter object2 = new LetterGradeConverter(message2, actialLength2);
		object2.toString();
		
		
		//Test to see if equal
		object1.equals(object1, object2);
		
		scan.close();
		scan2.close();
		
	}

}