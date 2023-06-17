package hw12Polymorphism;

public class Niece extends Sister {

	// Method overriding: Implementing methods with the same name in the subclass

	@Override
	public void sister(int age1) {
		System.out.println("Overridden void method in Niece class with int parameter: " + age1);
	}

	@Override
	public void sister(int age2, int age3) {
		System.out.println("Overridden void method in Niece class with two int parameters: " + age2 + " and " + age3);
	}

	@Override
	public void sister(String age4) {
		System.out.println("Overridden void method in Niece class with String parameter: " + age4);
	}

	@Override
	public int sister(int age5, int age6, int age7) {
		System.out.println("Overridden int method with 3 int parameter: " + age5 + ", " + age6 + ", and " + age7);
		return age5;

	}
}