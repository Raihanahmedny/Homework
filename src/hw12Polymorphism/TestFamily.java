package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister(18);
		sister.sister(20, 24);
		sister.sister("Twenty");
		sister.sister(22, 24, 26);
		System.out.println();

		Niece niece = new Niece();
		niece.sister(18);
		niece.sister(20, 24);
		niece.sister("Twenty");
		niece.sister(22, 24, 26);
	}
}