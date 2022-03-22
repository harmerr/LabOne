
public class Solution3 {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(true) {
	
			count++;
			
			if(count == 3) {
				continue;
			}
			if(count == 5) {
				break;
			}
			
			System.out.println(count);
		}
	}
}
