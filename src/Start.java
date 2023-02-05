

public class Start {

	public static void main(String [] args) {
		
		Excercise exercise1 = new Excercise("Carl");
		Excercise exercise2 = new Excercise("Sarah");
		
		Object a;
		
		
		String asStringExc1 = exercise1.toString();
		String asStringExc2 = exercise2.toString();

		System.out.println("Hello first exercise: " + asStringExc1);
		System.out.println("Hello second exercise: " + asStringExc2);

	}
}