
public class Person {
	String name;
	int dateOfBirth;

	Person(String name, int dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return 2016 - dateOfBirth;
	}
}
