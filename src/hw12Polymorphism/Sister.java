package hw12Polymorphism;

//Method overloading: Multiple methods with the same name but different parameters
// Method with void return type and int parameter

public class Sister {

	public void sister(int age1) {
		System.out.println("This is the void method with int parameter: " + age1);
	}

	// Method with void return type and two int parameters
	public void sister(int age2, int age3) {
		System.out.println("This is the void method with two int parameters: " + age2 + " and " + age3);
	}

	// Method with void return type and String parameter
	public void sister(String age4) {
		System.out.println("This is the void method with String parameter: " + age4);
	}

	// Method with int return type and int parameter
	public int sister(int age5, int age6, int age7) {
		System.out.println("This is the int method with 3 int parameter: " + age5 + ", " + age6 + ", and " + age7);
		return age5;

	}

}
