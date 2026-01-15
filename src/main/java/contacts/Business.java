package contacts;

import java.util.ArrayList;
import java.util.List;

public class Business {
	List<People> employees;

	private String name;

	public Business(String name) {

		this.name = name;
		employees = new ArrayList<>();
	}

	public void addEmploee(People people) {

		employees.add(people);

	}

}
