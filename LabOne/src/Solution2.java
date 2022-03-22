import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter any year below: ");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
	
		sc.close();
		
		if((userInput % 4 == 0 && userInput % 100 != 0) || userInput % 400 == 0) {
			System.out.println(userInput + " is a leap year");
		}
		else {
			System.out.println(userInput + " is not a leap year");
		}
		
		
	}
	
	
	
}
