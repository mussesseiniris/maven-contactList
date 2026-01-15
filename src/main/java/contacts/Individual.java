package contacts;


public class Individual extends People {

	public Individual(String name, int phone, String email, String note, int type, int gst, String business) {
		super(name, phone, email, "", 0, note, type, gst, business, "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo(People p) {

		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
		System.out.println("Email:" + email);
		System.out.println("Address:" + address);
		System.out.println("Birthday:" + birthday);
		System.out.println("Relationship:" + relationship);
		System.out.println("gst:" + gst);
		System.out.println("Note:" + note);
	}

}
