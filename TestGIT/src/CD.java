import java.util.ArrayList;

public class CD {
	private String title;
	private String artist;
	private int year;
	private int price;
	private ArrayList<Track> songs;
	
	public CD(String title, String artist, int year, int price) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.price = price;
		songs = new ArrayList<Track>();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getInfo() {
		return ("Title: " + title + "\t Artist: " + artist + "\t Year: " + year + "\t Price: " + price);
	}
	
	public int getNumberOfSongs() {
		return songs.size();
	}
	
	public String getSongs() {
		String info = new String();
		for(int i=0; i<songs.size(); i++) {
			info += ((i+1) + ": " + songs.get(i).getTitle() + "\n");
		}
		return info;
	}
	
	public String getLength() {
		int length = 0;
		for(int i=0; i<songs.size(); i++) {
			length += songs.get(i).getDuration();
		}
		int minutes = length / 60;
		int seconds = length - (minutes*60);
		return (minutes + ":" + seconds);
	}
	
	public String getLongest () {
		int longestTime = 0;
		String longestName = new String();
		for(int i=0; i<songs.size(); i++) {
			if((songs.get(i).getDuration()) > longestTime) {
				longestTime = songs.get(i).getDuration();
				longestName = ((i+1) + ": " + songs.get(i).getTitle());
			}
		}
		return longestName;
	}
	
	public void addSong(Track song) {
		songs.add(song);
	}
	

}