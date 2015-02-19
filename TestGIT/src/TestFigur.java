
public class TestFigur {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Figur fig1 = new Figur(10,12);
		Circle c1 = new Circle(20, 20, 4.0);
		System.out.println(c1); //Trenger ikke skrive .toString, gjøres automatisk
	}

}
