package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Raihan Ahmed");
		employee.setAge(25);
		employee.setSex('M');
		employee.setCitizen(true);

		System.out.println("Employee Information:" + "\nName: " + employee.getName() + "\nAge: " + employee.getAge()
				+ "\nSex: " + employee.getSex() + "\nCitizen: " + employee.getCitizen());

	}
}