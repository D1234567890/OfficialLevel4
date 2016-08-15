import java.util.ArrayList;

public class Demographics {
	int getAverageAge(ArrayList<Person> a) {
		int addTo = 0;
		int length = a.size();
		for (Person p : a) {
			addTo += p.getAge();
		}
		return addTo / length;
	}
}
