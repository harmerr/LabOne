import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a decimal number: ");
		
		Scanner sc = new Scanner(System.in);
		float userInput = sc.nextFloat();
		
		sc.close();
		
		System.out.println("The ceil value of the number is " + Math.ceil(userInput));
		System.out.println("The floor value of the number is " + Math.floor(userInput));
		System.out.println("The number rounded to its nearest integer is " + Math.round(userInput));
	}
}
