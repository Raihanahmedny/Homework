package hw10Abstraction;

public interface Hospital {
	void emergencyRoom();

	void surgeryRoom();

	void cafeteria();

	default void morgue() {

	}

	static void pharmacy() {

	}
}
