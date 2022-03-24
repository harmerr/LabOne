import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.HashMap;

public class Solution8 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\RaymondHarmer\\Downloads\\the_prince_quotes.txt"));
			String file = reader.readLine().toLowerCase();
			
			HashMap<String, Integer> fileWords = new HashMap<String, Integer>();
			
			while(!(file.equals(null))) {
				System.out.println(file);
				
				file = reader.readLine();
				
				if(!(file.equals(null))) {
					String[] words = file.split(" ");
				
					for(String word : words) {
						Integer integer = fileWords.get(word);
					
						if(integer == null) {
							fileWords.put(word, 1);
						}
						else {
							fileWords.put(word, integer + 1);
						}	
					}
				}
			
			}
			
			System.out.println(Arrays.asList(fileWords));
		}
		catch(IOException | NullPointerException e) {
			e.printStackTrace();
		}
		
	
	}
}
