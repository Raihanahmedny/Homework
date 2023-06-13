package hw9Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() {// Default Constructor
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the implementation of biochemistryLab method");
	}

}
