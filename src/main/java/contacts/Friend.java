package contacts;


public class Friend extends People {

	public Friend(String name, int phone, String email, String address, int birthday, String note) {
		super(name, phone, email, address, birthday, note, 1, 0, "", "");
		this.type = 1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo(People p) {

		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
		System.out.println("Email:" + email);
		System.out.println("Address:" + address);
		System.out.println("Birthday:" + birthday);
		System.out.println("gst:" + gst);
	
		System.out.println("Note:" + note);
	}

	public String toString() {

		return name + " phone:" + phone + " email:" + email + " address:" + address + " birthday:" + birthday;
	}

}
