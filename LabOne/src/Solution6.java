import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

	static ArrayList<String> states = new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println("Enter the states you have visited one at a time.");
		System.out.println("State name: ");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine().toLowerCase();
		states.add(userInput);
		
		while(!(userInput.equals("done"))) {
			
			System.out.println("State name: ");
			userInput = sc.nextLine().toLowerCase();
			
			if(!(userInput.equals("done"))) {
				states.add(userInput);
			}
		}
		
		System.out.println(states);
		
		sc.close();
		
	}
}
