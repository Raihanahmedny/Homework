package hw12Abstraction;

/*
Question: Total how many keywords are used for the inheritance in Interface?
Answer: 2 keywords: extends and implements)

Question: Can an interface inherit other Interfaces, or a regular class or abstract class by extends or implements keyword?
Answer: An interface can extend other interfaces using the "extends" keyword.
             An interface can inherit other interfaces using the "implements" keyword.
             An interface cannot inherit a regular class or abstract class using the "extends" keyword. 
             
Question: How many inheritances are possible?
Answer: Single Inheritance, Multi-Level Inheritance, and Hierarchical Inheritance.

        public interface University extends College, Hospital {}
*/
public interface University extends College, Hospital{
	// public University() {}
	// Interfaces cannot have constructors
	void classSize();

	void playGround();

	void teacher();

	default void gymnasium() {
		System.out.println("This is the default method gymnasium inside the University interface");
	}

	static void library() {
		System.out.println("This is the static method library inside the University interface");

		/*
		 * Interfaces can inherit from other interfaces using the extends keyword.
		 * Interfaces can only extend other interfaces, not regular classes or abstract
		 * classes. "University" can inherit from "College",
		 * AeronauticalSchool", "LawSchool", "VocationalSchool", and "
		 * Hospital" interfaces using the "extends" keyword.
		 */
	}
}
