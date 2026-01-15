package contacts;


public class Coworker extends People {

	private int gst;

	public Coworker(String name, int phone, String email, String address, int birthday, String note, int gst,
			String business) {
		super(name, phone, email, address, birthday, note, 3, gst, business, "");
		this.gst = gst;

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

	public int getGst() {

		return this.gst;
	}

}
