package hw12Abstraction;

abstract class NursingSchool extends RockefellerUniversity{
	public abstract void hygiene();

	public void caring() {
		System.out.println("This is the implementation of caring method");
	}
}