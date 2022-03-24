package Solution9;

import java.util.ArrayList;

public class Playlist {
	
	public String name;
	ArrayList<Song> playList = new ArrayList<Song>();

	Playlist(String name, ArrayList<Song> playList) {
		this.name = name;
		this.playList = playList;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Song> getPlayList() {
		return playList;
	}

	public void setPlayList(ArrayList<Song> playList) {
		this.playList = playList;
	}

	
	public void printPlaylist() {
		System.out.println(playList);
	}
	
	//public boolean findSong(String song) {
		//for(Song title : playList) {
		
	//	}
	//}

	@Override
	public String toString() {
		return "Playlist [name=" + name + ", playList=" + playList + "]";
	}
	
	
}
