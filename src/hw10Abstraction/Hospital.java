package hw10Abstraction;

public interface Hospital {
	void emergencyRoom();

	void surgeryRoom();

	void cafeteria();

	default void morgue() {
		System.out.println("This is the default method morgue inside the Hospital interface");
	}

	static void pharmacy() {
		System.out.println("This is the static method pharmacy inside the Hospital interface");
	}
}
