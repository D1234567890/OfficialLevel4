
public class Vampire extends Person {
	int ageAtDeath;

	Vampire(String name, int dateOfBirth, int ageAtDeath) {
		super(name, dateOfBirth);
		this.ageAtDeath = ageAtDeath;
	}

	int getAgeAtDeath() {
		return ageAtDeath;
	}
}
