
public class Excercise {

	private String personName;

	public Excercise(String person) {
		this.personName = person;
	}

	@Override
	public String toString() {
		return "excercise of " + this.personName;
	}
}
