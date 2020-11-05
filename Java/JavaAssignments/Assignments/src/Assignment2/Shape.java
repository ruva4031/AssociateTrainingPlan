package Assignment2;

public class Shape {
	private String color;
	private Boolean filled;
	
	Shape(){
		this.color = "green";
		this.filled = true;
	}
	Shape(String color, Boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean FILLED() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		String s2 = "filled";
		if(!this.filled) {
			s2="Not filled";
		}
		return ("Shape with color of " + color + " and " + s2);
	}
}
