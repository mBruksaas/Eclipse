public class Circle2D {
	protected double x;
	protected double y;
	private double radius;
	
	public Circle2D() {
		x = 0.0;
		y = 0.0;
		radius = 1.0;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		return radius > Math.sqrt((Math.pow(this.x - x, 2))+(Math.pow(this.y - y, 2)));
	}
	
	public boolean contains(Circle2D circle) {
		return radius > Math.sqrt((Math.pow(this.x - circle.x, 2))+(Math.pow(this.y - circle.y, 2))) + circle.radius;
	}
	
	public boolean overlaps(Circle2D circle) {
		double dist = Math.sqrt((Math.pow(this.x - circle.x, 2))+(Math.pow(this.y - circle.y, 2)));
		return(radius <= dist + circle.radius && radius >= dist - circle.radius);
	}
}
