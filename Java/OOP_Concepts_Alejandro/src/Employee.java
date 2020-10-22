

public class Employee {
	private int id;
	private double wage;
	private String workLocation;
	private double hoursWorked;
	
	public Employee(int id, double wage, String workLocation, double hoursWorked) {
		this.id = id;
		this.wage = wage;
		this.workLocation = workLocation;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculatePaycheck() {
		double total=0;
		total = this.hoursWorked * this.wage;
		
		return total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
