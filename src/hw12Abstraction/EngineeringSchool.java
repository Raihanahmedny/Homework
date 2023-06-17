package hw12Abstraction;

abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is the implementation of computerLab method");
	}
}