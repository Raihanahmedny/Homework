package hw9Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() {// Default Constructor
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the implementation of biochemistryLab method");
	}

	abstract class EngineeringSchool {
		public abstract void mechanicalLab();

		public void computerLab() {
			System.out.println("This is the implementation of computerLab method");
		}
	}

	abstract class NursingSchool {
		public abstract void hygiene();

		public void caring() {
			System.out.println("This is the implementation of caring method");
		}
	}
}
