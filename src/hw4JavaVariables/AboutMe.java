package hw4JavaVariables;

public class AboutMe {
// Variable is declared
	public String name;
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public AboutMe() {
		System.out.println("This is all about us:");
	}

	// Method is implemented
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nMy Yearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Height: "
				+ myHeight + "\nMy Grade" + myGrade + "\nMy Sex: " + sex + "\nUS Citizen?: " + usCitizen);
	}

}
