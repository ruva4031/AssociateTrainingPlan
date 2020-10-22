

public class Square extends Shape {
	double a,b,c,d;
	
	public Square(String shapeName, double a, double b, double c, double d) {
		super(shapeName);
	}
	
	public double calculateArea() {
		double total = 0;
		total = (a * a) + (b*b);
		return total;
	}

	public double calculatePerimeter() {
		double total = 0;
		total = a + b +c+d;
		return total;
	}

}
