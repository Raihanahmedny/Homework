package hw10Abstraction;

/*
 * The "ColumbiaUniversity" class extends the "MedicalSchool" abstract class.
 * A regular class can inherit from another regular class or an abstract class using the "extends" keyword.
 * Regular class cannot directly inherit from an interface.
 */
public class ColumbiaUniversity {
	// Default Constructor
	public ColumbiaUniversity() {
	}
	// Abstract method
	// public abstract void chemistry();
	// The abstract method chemistry can only be defined by an abstract class

	// Non-abstract method
	public void biology() {
		System.out.println("This is the implementation of biology method");
	}
}
