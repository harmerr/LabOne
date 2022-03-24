package Solution9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Song> playListOne = new ArrayList<Song>();
		
		Playlist list = new Playlist("Playlist 1", playListOne);
		
		Song song1 = new Song("Basket Case", 184);
		Song song2 = new Song("I THINK", 162);
		Song song3 = new Song("Under the Bridge", 207);
		
		playListOne.add(song1);
		playListOne.add(song2);
		playListOne.add(song3);
		
		System.out.println(playListOne);
		

	}
}