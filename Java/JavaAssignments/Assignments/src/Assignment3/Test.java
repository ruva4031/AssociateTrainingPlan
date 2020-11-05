package Assignment3;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("Billy", "1224 Jungle Road", "High School", 2020, 80);
		Staff sta1 = new Staff("Joe", "7851 City Ave", "Thomas High School", 55000);
		Person p1 = new Person();
		System.out.println(stu1.toString());
		System.out.println(sta1.toString());
		System.out.println(p1.toString());
	}
}
