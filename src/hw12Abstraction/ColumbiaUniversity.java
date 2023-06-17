package hw12Abstraction;

/*
 * The "ColumbiaUniversity" class extends the "MedicalSchool" abstract class.
 * A regular class can inherit from another regular class or an abstract class using the "extends" keyword.
 * Regular class cannot directly inherit from an interface.
 */

/*
	Question: You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class?
    Answer: 1 keyword: extends.
    
    Question: Can a regular Class inherit another Abstract Class or a regular class or interface by extends or implements keyword?
    Answer: A regular class can extend another regular class or an abstract class using the "extends" keyword.
                 A regular class can implement interfaces using the "implements" keyword.
            
    Question: How many inheritances are possible by a regular Class?
    Answer: A regular class can have single inheritance extends but can have multiple inheritance implements.
          
            public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {}
*/

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// Default Constructor
	public ColumbiaUniversity() {
		System.out.println("This is the default constructor of ColumbiaUniversity");
	}
	// Abstract method
	// public abstract void chemistry();
	// The abstract method chemistry can only be defined by an abstract class

	// Non-abstract method
	public void biology() {
		System.out.println("This is the implementation of biology method");
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
}
