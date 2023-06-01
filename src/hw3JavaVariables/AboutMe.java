package hw3JavaVariables;

public class AboutMe {
	// Variable declared
	private String name;
	private byte age;
	private short bill;
	private int rent;
	private long myMortgage;
	private float grade;
	private double height;
	private char sex;
	private boolean isEmployed;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();

		// Variables initialized
		System.out.println("Name: " + aboutMe.name + ", Age: " + aboutMe.age);
		System.out.println("Height: " + aboutMe.height + ", Is employed: " + aboutMe.isEmployed);
		System.out.println("Sex: " + aboutMe.sex + ", My mortgage is: " + aboutMe.myMortgage);
	}
}
