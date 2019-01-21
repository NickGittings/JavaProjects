package lettergrade;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LetterGradeConverter {
	private ArrayList<Integer> intGrades = new ArrayList<Integer>();
	private ArrayList<Character> LetterGradeList = new ArrayList<Character>();
	private int actialLength;
	
	//Constructor with parameter name of file and length of integer list
	LetterGradeConverter(String NameofFile, int actialLength) {
		
		//Try and catch block for file not found exception
		try {
			//Creating a file object and scanner to look through file and read integers
			File file = new File(NameofFile);
			Scanner scan = new Scanner(file);
			this.actialLength = actialLength;
			
			for(int i = 0; i < actialLength; i++) {
				String line = scan.nextLine();
				intGrades.add(Integer.parseInt(line));
			}
			
			//Private method which generates letter grades
			LetterGradeConverter(intGrades);
			
		} catch (FileNotFoundException except) {
			System.out.println("File not found...");
			except.printStackTrace();
		}
		
			
	}

	//Generates letter grade list from integer grade list
	private void LetterGradeConverter(ArrayList<Integer> intGrades) {
		for(int i = 0; i < 6; i++) {
			if(intGrades.get(i) >= 90) {
				LetterGradeList.add('A');
			}
			else if(intGrades.get(i) >= 80 && intGrades.get(i) < 90) {
				LetterGradeList.add('B');
			}
			else if(intGrades.get(i) >= 70 && intGrades.get(i) < 80) {
				LetterGradeList.add('C');
			}
			else if(intGrades.get(i) >= 60 && intGrades.get(i) < 70) {
				LetterGradeList.add('D');
			}
			else if(intGrades.get(i) < 60) {
				LetterGradeList.add('F');
			}
			else {
				System.out.println("k");
			}
		}
		
	}
	
	//Accessors
	public ArrayList<Integer> getintGrades() {
		return intGrades;
	}
	
	public ArrayList<Character> getLetterGradesList() {
		return LetterGradeList;
	}
	
	public int getactialLength() {
		return actialLength;
	}
	
	//toString method which returns a table of the integer grades and then letter grades
	public String toString() {
		
		String Formatted = "";
		
		for(int i = 0; i < actialLength; i++) {
			int temp = intGrades.get(i);
			String integer = String.valueOf(temp);
			char temp2 = LetterGradeList.get(i);
			String letter = String.valueOf(temp2);
			Formatted = Formatted + integer + "\t" + letter + "\n";
		}
		System.out.println(Formatted);
		
		return Formatted;
	}
	
	//Returns true or false if the two objects are equal
	public boolean equals(LetterGradeConverter pObject1, LetterGradeConverter pObject2) {
		 if(pObject1.intGrades.equals(pObject2.intGrades) && pObject1.LetterGradeList.equals(pObject2.LetterGradeList)) {
			 System.out.println("true");
			 return true;
		 }
		 else {
			 System.out.println("false");
			 return false;
		 }
	}
}
