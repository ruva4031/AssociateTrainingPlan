package Assignment2;

public class Circle extends Shape{
	private double radius;
	
	Circle(){
		super();
		this.radius=0;
	}
	Circle(double radius){
		super();
		this.radius = radius;
	}
	Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*(this.radius*this.radius);
	}
	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return ("A circle with radius=" + this.radius 
				+ ", which is a subclass of " + super.toString() + ".");
	}
}
