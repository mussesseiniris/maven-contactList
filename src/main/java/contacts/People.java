package contacts;

import java.util.ArrayList;
import java.util.List;

public class People {

	protected String name;
	protected int phone;
	protected Object email;
	protected String address;
	protected int birthday;
	protected int gst;
	protected String business;
	protected String relationship;
	protected String note;
//	List<People> relatives;
//	List<People> employees;
	protected int type;

	public People(String name, int phone, String email, String address, int birthday, String note, int type, int gst,
			String business, String relationship) {

		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.type = type;
		this.gst = gst;
		this.business = business;
		this.relationship = relationship;
		this.note = note;
//	employees = new ArrayList<>();
		// relatives = new ArrayList<>();
	}

	// getter

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public String getAdress() {
		return address;
	}

//	public String getRelationship() {
//
//		return relationship;
//
//	}

//	public List<People> getRelatives() {
//
//		return relatives;
//
//	}

	public boolean isrelative() {

		return true;

	}

	public void addRelative() {

	}

	public int getType() {

		return type;

	}

	public void displayInfo(People p) {

		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
		System.out.println("Email:" + email);
		System.out.println("Address:" + address);
		System.out.println("Birthday:" + birthday);
		System.out.println("Note:" + note);
	}

//	public String toString() {
//		return "Contact:" + " name:" + name + " phone:" + phone + " address:" + address + " birthday:" + birthday;
//
//	}

}
