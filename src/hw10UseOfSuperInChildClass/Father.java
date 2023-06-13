package hw10UseOfSuperInChildClass;

public class Father {
	String name;
    int age;
    char sex;
    boolean usCitizen;
    String familyName;

    public Father() {
        System.out.println("This is the default constructor of Father class");
    }

    public Father(String name, int age, char sex, boolean usCitizen) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.usCitizen = usCitizen;
        System.out.println("This is the parameterized constructor of Father class");
    }

    public void father() {
        System.out.println("This is the father method");
    }

    public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.usCitizen = usCitizen;
        System.out.println("This is the parameterized fatherInfo method");
    }
}

