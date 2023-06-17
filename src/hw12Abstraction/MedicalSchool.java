package hw12Abstraction;

/*
 * The "MedicalSchool" class extends the "NursingSchool" abstract class.
 * An abstract class can inherit from another abstract class or a regular class using the "extends" keyword.
 * Abstract class cannot inherit from an interface.
 */

/*
   Question: You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class?
   Answer: 1 keyword: extends.
   
   Question: Can an Abstract Class inherit another Abstract Class or a regular class or interface by extends or implements keyword?
   Answer: An abstract class can extend another abstract class or a regular class using the "extends" keyword.
                An abstract class can implement interfaces using the "implements" keyword.
                
   Question: How many inheritances are possible in an Abstract Class? 
   Answer: An abstract class can have single inheritance through extends but can have multiple inheritance through implements.
           
           public abstract class MedicalSchool extends NursingSchool implements LawSchool {}
*/

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() {// Default Constructor
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the implementation of biochemistryLab method");
	}
}
