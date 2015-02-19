import java.util.ArrayList;

public class CDArkiv {
	private ArrayList<CD> CDs;
	
	public CDArkiv() {
		CDs = new ArrayList<CD>();
	}
	
	public void addCD(CD CD) {
		CDs.add(CD);
	}
	
	public void printArchive() {
		System.out.println("\nAntall plater i arkivet er " + CDs.size() + "\n\tOversikt:");
		
		for(int i=0; i<CDs.size(); i++) {
			if(i>2 && (i%3) == 0) System.out.print("\n");
			
			System.out.print(((CDs.get(i)).getTitle()) + "\t");
		}
		System.out.print("\n");
	}
	
	public void deleteCD(String CD) {
		int size = CDs.size();
		for(int i=0; i<CDs.size(); i++) {
			if(CDs.get(i).getTitle() == CD) {
				CDs.remove(i);
				System.out.println("\nPlate slettet");
				printArchive();
			}
		}
		if(size == CDs.size()) System.out.println("\nPlaten du skrev inn finnes ikke i arkivet");
	}
}
