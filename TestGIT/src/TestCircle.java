public class TestCircle {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("The area of the circle is " + String.format("%.2f", c1.getArea()));
		System.out.println("The perimeter of the circle is " + String.format("%.2f", c1.getPerimeter()) + "\n");
		
		System.out.println("The point (3, 3) is within circle1: " + c1.contains(3, 3));
		System.out.println("Circle2 is within circle1: " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Circle1 overlaps circle2: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
