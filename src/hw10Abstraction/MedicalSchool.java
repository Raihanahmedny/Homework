package hw10Abstraction;

/*
 * The "MedicalSchool" class extends the "NursingSchool" abstract class.
 * An abstract class can inherit from another abstract class or a regular class using the "extends" keyword.
 * Abstract class cannot inherit from an interface.
 */
public abstract class MedicalSchool {
	public MedicalSchool() {// Default Constructor
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the implementation of biochemistryLab method");
	}

}
