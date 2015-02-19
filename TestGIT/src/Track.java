public class Track {
	private String tittel;
	private String komponist;
	private int vurdering;
	private int sekunder;
	
	public Track(String tittel, String komponist, int vurdering, int sekunder) {
		this.tittel = tittel;
		this.komponist = komponist;
		this.vurdering = vurdering;
		this.sekunder = sekunder;
	}
	
	public String getTitle() {
		return tittel;
	}
	
	public String getComposer() {
		return komponist;
	}
	
	public int getScore() {
		return vurdering;
	}
	
	public int getDuration() {
		return sekunder;
	}
}