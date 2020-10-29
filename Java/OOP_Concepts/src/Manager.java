
public class Manager extends Employee {
	private Employee managee;
	private double yearlyBonus;

	public Manager(int id, double wage, String workLocation, double hoursWorked) {
		super(id, wage, workLocation, hoursWorked);
		this.yearlyBonus = (.10 * wage) * 150;

	}

	public Employee getManagee() {
		return managee;
	}

	public void setManagee(Employee managee) {
		this.managee = managee;
	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

}
