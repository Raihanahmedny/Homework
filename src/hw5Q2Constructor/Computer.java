package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + " Model: " + model + " Operating system: " + operatingSystem
				+ " Price: $" + price + ", Grade: " + grade + " , and Made in the USA? Ans: " + madeInUSA);
	}

	public Computer(char grade, boolean madeInUSA) {
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Grade: " + grade + " Made in the USA? Ans: " + madeInUSA);
	}

}
