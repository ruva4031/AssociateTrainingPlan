
public class Triangle extends Shape {
	private double a, b, c;
	private double base, height;

	public Triangle(String shapeName, double a, double b, double c, double base, double height) {
		super(shapeName);
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.height = height;
	}

	public double calculateArea() {
		double total = 0;
		total = base * height;
		total *= .5f;
		return total;
	}

	public double calculatePerimeter() {
		double total = 0;
		total = a + b + c;
		return total;
	}
}