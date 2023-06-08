package hw10Abstraction;

public interface College {
	void commonRoom();

	void laboratory();

	void languageClub();

	default void dorm() {

	}

	static void studyRoom() {

	}
}
