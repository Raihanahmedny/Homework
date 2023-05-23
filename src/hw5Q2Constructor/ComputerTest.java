package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer comp01 = new Computer("Apple,", "MacBook Air,", "MacOS Mojave,", 800, 'A', false);
		Computer comp02 = new Computer("HP,", "Envy 13,", "Windows 10,", 699, 'A', false);
	}
}
