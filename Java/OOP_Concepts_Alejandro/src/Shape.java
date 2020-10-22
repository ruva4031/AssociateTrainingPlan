

public class Shape {
	private double area;
	private double perimeter;
	private String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	public double calculateArea() {
		return 0;
	}
	public double calculatePerimeter() {
		return 0;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
}
