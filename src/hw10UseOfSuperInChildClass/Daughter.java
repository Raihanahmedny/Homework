package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
    int birthMonth;
    int age;

    public Daughter() {
        super();
        System.out.println("This is the default constructor of Daughter class");
    }

    public Daughter(int birthMonth, int age) {
        super();
        this.birthMonth = birthMonth;
        this.age = age;
        System.out.println("This is the parameterized constructor of Daughter class");
    }

    public void daughter() {
        System.out.println("This is the daughter method");
    }

    public void daughterInfo() {
        int birthMonth = 11;
        int age = 25;
        super.name = "Raihan"; // Using super keyword to access variable from the parent class
        super.familyName = "Raihan";
        super.fatherInfo(super.name, super.age, super.sex, super.usCitizen);
        System.out.println("This is the parameterized daughterInfo method");
    }
}