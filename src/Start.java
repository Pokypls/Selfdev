

public class Start {

	public static void main(String [] args) {
		
		Exercise exercise1 = new Exercise("Carl");
		Exercise exercise2 = new Exercise("Sarah");
		
		Object a;
		
		
		String asStringExc1 = exercise1.toString();
		String asStringExc2 = exercise2.toString();

		System.out.println("Hello first exercise: " + asStringExc1);
		System.out.println("Hello second exercise: " + asStringExc2);

	}
}