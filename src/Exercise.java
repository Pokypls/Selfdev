
public class Exercise {

	private String personName;

	public Exercise(String person) {
		this.personName = person;
	}

	@Override
	public String toString() {
		return "exercise of " + this.personName;
	}
}
