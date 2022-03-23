package Solution9;

import java.util.ArrayList;

public class Playlist {

	String name;
	
	static ArrayList<Song> songs = new ArrayList<Song>();
	
	public static void printPlaylist() {
		System.out.println(songs);
	}
	
	//public static boolean findSong(String song) {
		//	return songs.equals(song);
		
	//}
}
