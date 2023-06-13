package hw11Abstraction;

public interface College {
	void commonRoom();

	void laboratory();

	void languageClub();

	default void dorm() {
		System.out.println("This is the default method dorm inside the College interface");
	}

	static void studyRoom() {
		System.out.println("This is the static method studyRoom inside the College interface");
	}
}
