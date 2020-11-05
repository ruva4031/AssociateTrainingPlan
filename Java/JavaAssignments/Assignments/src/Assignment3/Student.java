package Assignment3;

public class Student extends Person {
	private String program;
	private int year;
	private int fees;
	
	Student(){
		super();
		this.program="High School";
		this.year=2020;
		this.fees=50;
	}
	Student(String name, String address, String program, int year, int fees){
		super(name, address);
		this.program = program;
		this.year=year;
		this.fees = fees;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return (super.toString() + " Student [program=" + program + ", year=" + year + ", fees=" + fees + "]");
	}
}
