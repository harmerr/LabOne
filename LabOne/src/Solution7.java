import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		System.out.println("Please enter a number below");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		
		System.out.println("And another number");
		int input2 = sc.nextInt();
		
		try {
			System.out.println(input1 + " divided by " + input2 + " equals " + (input1/input2));
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you");
		}
		
		sc.close();
	}
}
