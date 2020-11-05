package Assignment1;

public class Demo {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		Rat rat1 = new Rat();
		System.out.println("Cat says: " + cat1.greeting() + ". Dog says: " + dog1.greeting() + ". Rat says: " + rat1.greeting());
	}
}
