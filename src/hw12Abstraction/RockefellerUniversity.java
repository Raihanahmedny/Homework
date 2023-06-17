package hw12Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	// non abstract method
	public void maths() {
		System.out.println("This is the implementation of maths method");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
}
