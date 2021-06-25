import java.util.Date;

import java.util.Scanner;

public class DateGenerator {

	public String getCurrentDate() {
		
		System.out.println("Enter a text to send to the client");
		
		
		Scanner inputText1 = new Scanner(System.in);
		String English_Text1=inputText1.nextLine();
		
		System.out.println("Type Target Language:melayu/arabic,Korean");
		
		Scanner inputText2 = new Scanner(System.in);
		String English_Text2=inputText2.nextLine();
		
		String Var=English_Text1+English_Text2;
		return Var;
		
	}
	
}
