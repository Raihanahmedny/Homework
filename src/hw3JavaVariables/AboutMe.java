package hw3JavaVariables;

public class AboutMe {

	// Variable is declared
	public String myNameString;

	// Variable is initialized
	public String myName = "Raihan";
	public byte myAge = 25;
	public short myBill = 3200;
	public int myHouseRent = 550000;
	public long myMortgage = 530000000l;
	public float myGrade = 9.145f;
	public double myHeight = 5.111998868;
	public char sex = 'M';
	public boolean employed = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.employed);
		System.out.println("My name is: " + aboutMe.myName + " \nMy age is: " + aboutMe.myAge + "\nMy house rent is: "
				+ aboutMe.myHouseRent);
	}

}
