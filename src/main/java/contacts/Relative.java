package contacts;

import java.util.ArrayList;
import java.util.List;

public class Relative extends People {
	private List<People> relatives;

	private String relationship;

	public Relative(String name, int phone, String email, String address, int birthday, String relationship,String note) {
		super(name, phone, email, address, birthday,relationship, 0, 2, note, "");
		this.relationship = relationship;
		// TODO Auto-generated constructor stub
	}

	public List<People> getRelatives() {

		return relatives;

	}

	@Override
	public void displayInfo(People p) {

		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
		System.out.println("Email:" + email);
		System.out.println("Address:" + address);
		System.out.println("Birthday:" + birthday);
		System.out.println("Relationship:" + relationship);
		System.out.println("Note:" + note);
	}

	public void displayrelatives(People p) {

		System.out.println(getRelatives());
	}

}
