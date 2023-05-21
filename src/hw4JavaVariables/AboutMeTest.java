package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe raihan = new AboutMe();// Constructor is initialized
		// Variable is initialized
		raihan.name = "Raihan Ahmed";
		raihan.age = 25;
		raihan.myApartmentRent = 5000;
		raihan.myYearlySalary = 400000;
		raihan.myBankBalance = 6276656888l;
		raihan.myHeight = 5.999f;
		raihan.myGrade = 9.999999;
		raihan.sex = 'M';
		raihan.usCitizen = true;
		// Method is initialized
		raihan.aboutMe();

		AboutMe alex = new AboutMe();// Constructor is initialized
		// Variable is initialized
		alex.name = "Alex";
		alex.age = 30;
		alex.myApartmentRent = 9000;
		alex.myYearlySalary = 5900000;
		alex.myBankBalance = 34353388l;
		alex.myHeight = 4549f;
		alex.myGrade = 2.5435349;
		alex.sex = 'M';
		alex.usCitizen = true;
		// Method is initialized
		alex.aboutMe();
	}
}
