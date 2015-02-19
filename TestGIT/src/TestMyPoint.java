public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10.0, 30.5);
		
		System.out.print("The distance between the points is: ");
		System.out.println(String.format("%.1f", p1.distance(p2)));
	}

}
