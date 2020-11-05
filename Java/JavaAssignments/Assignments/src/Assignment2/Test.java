package Assignment2;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Shape s1 = new Shape("Red", true);
		Rectangle r1 = new Rectangle(4, 6, "Blue", false);
		System.out.println(s1.toString());
		System.out.println(c1.toString() + " Has area=" + c1.getArea() 
		+" and perimiter=" + c1.getPerimeter());
		System.out.println(r1.toString() + " Has area=" + r1.getArea() 
		+" and perimiter=" + r1.getPerimeter());
	}
}
