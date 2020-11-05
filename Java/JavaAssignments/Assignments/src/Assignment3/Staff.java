package Assignment3;

public class Staff extends Person {
	private String school;
	private int pay;
	
	Staff(){
		super();
		this.school = "Elementry";
		this.pay = 40000;
	}
	Staff(String name, String address, String school, int pay){
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return (super.toString() + " Staff [school=" + school + ", pay=" + pay + "]");
	}

}
