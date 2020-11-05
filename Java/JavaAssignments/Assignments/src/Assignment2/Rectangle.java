package Assignment2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	Rectangle() {
		super();
		this.width = 1;
		this.length =1;
	}
	Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}
	Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return (this.length*2) + (this.width*2);
	}
	@Override
	public String toString() {
		return ("A rectangle with width=" + this.width +
				"and length=" + this.length+ ", which is a subclass of " 
				+ super.toString() + ".");
	}
}
