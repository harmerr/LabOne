import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence and the words will be printed in reverse order:");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		sc.close();
		
		String[] inputArray = input.split(" ");
		
		for(int i = inputArray.length - 1; i >= 0; i--) {
			System.out.print(inputArray[i] + " ");
		}
	}
}
