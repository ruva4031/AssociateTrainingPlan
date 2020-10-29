
public class Tester {
	public static void main(String[] args) {
		Square shape1 = new Square("Perfect Square", 10, 10, 10, 10);
		Triangle shape2 = new Triangle("Right Triangle", 5, 3, 4, 3, 4);
		System.out
				.println("Shape one is a:" + shape1.getShapeName() + ", and has a area of: " + shape1.calculateArea());
		System.out
				.println("Shape two is a:" + shape2.getShapeName() + ", and has a area of: " + shape2.calculateArea());
		/*---------------------------------------------------------------------*/
		Employee Bill = new Employee(000123, 32.50f, "Texas", 40);
		Manager Tom = new Manager(000222, 36.5f, "Utah", 40);
		Tom.setManagee(Bill);
		System.out.println("Employee 1 is Bill with wage of $" + Bill.getWage() + ", and made $"
				+ Bill.calculatePaycheck() + " this week.");
		System.out.println("Employee 2 is Tom and manages " + Tom.getManagee().getId() + " and has a yearly bonus of $"
				+ Tom.getYearlyBonus());

	}
}
