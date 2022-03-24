package Solution9;

public class Song {
	
	public String title;
	public int duration;
	
	Song(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [Title: " + title + ", Duration: " + duration + " seconds]";
	}
	
	
}
