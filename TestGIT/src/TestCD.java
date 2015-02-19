public class TestCD {
	
	public static void main (String[] args) {
		
		CD myCD = new CD("Desire", "Bob Dylan", 1999, 155);
		CD myCD2 = new CD("Lisa", "Bob Dylan", 1999, 155);
		CD myCD3 = new CD("Bob", "Bob Dylan", 1999, 155);
		CD myCD4 = new CD("Garry", "Bob Dylan", 1999, 155);
		CD myCD5 = new CD("Diamond", "Bob Dylan", 1999, 155);
		
		Track song1 = new Track("Hurricane", "Bob Dylan", 4, 94);
		Track song2 = new Track("Isis", "Bob Dylan", 3, 125);
		Track song3 = new Track("Mozambique", "Bob Dylan", 5, 87);
		Track song4 = new Track("Sara", "Bob Dylan", 4, 222);
		Track song5 = new Track("Henry", "Bob Dylan", 2, 53);
		
		myCD.addSong(song1);
		myCD.addSong(song2);
		myCD.addSong(song3);
		myCD.addSong(song4);
		myCD2.addSong(song5);
		myCD3.addSong(song5);
		myCD4.addSong(song5);
		myCD5.addSong(song5);
		
		System.out.println(myCD.getInfo());
		System.out.print(myCD.getSongs());
		System.out.println("Total spilletid er " + myCD.getLength());
		System.out.println("Lengste låt er spor " + myCD.getLongest() + "\n");
		
		CDArkiv mittArkiv = new CDArkiv();
		mittArkiv.addCD(myCD);
		mittArkiv.addCD(myCD2);
		mittArkiv.addCD(myCD3);
		mittArkiv.addCD(myCD4);
		mittArkiv.addCD(myCD5);
		mittArkiv.printArchive();
		
		mittArkiv.deleteCD("Lisa");
	}
}
