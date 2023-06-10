package hw10Abstraction;

public interface University {
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
