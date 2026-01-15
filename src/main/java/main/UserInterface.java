package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import contacts.*;

public class UserInterface {

	Scanner scan = new Scanner(System.in);
	Map<String, People> people = new HashMap<>();
	Map<String, Business> businesses = new HashMap<>();

	public UserInterface() {
		// 1.menu
		System.out.println("Function Menu");
		System.out.println("1.Add new contact ");
		System.out.println("2.Search contacts");
		System.out.println("3.Show all the contacts");
		System.out.println("4.Delete contacts");
		System.out.println("5.Write to file");

		int choice = scan.nextInt();
		// chooseType();
		// System.out.println(choice);
		switch (choice) {
		// System.out.println("default:"choice);
		case 1 : this.chooseType();
//		case 1 -> addPeople();
//		case '2' -> this.addNewFamily();
//		case '3' -> this.addNewCoworker();
//		case '4' -> this.addNewIndividual();
		default : System.out.println("invailid input" + "default:");
		}
	}

//	}

//	public void addDefaultPeople() {
//
//		People iris = new Friend("iris", 123, "iris@gmail.com", "address", 198908, 111, "datacom", "");
//		People rebekka = new Friend("Rebecca", 123, "rebe@gmail.com", "address", 199807, 112, "datacom", "");
//		People violet = new Relative("violet", 123, "violet@gmail.com", "address", 199704, 112, "bnz", "");
//		People rachel = new Relative("violet", 123, "violet@gmail.com", "address", 199704, 112, "datatoque", "");
//
//		people.put(iris.getName(), iris);
//		people.put(rebekka.getName(), rebekka);
//		people.put(violet.getName(), violet);
//		people.put(rachel.getName(), rachel);
//
//	}

//添加联系人
	public void addNewPeople() {

		System.out.println("enter:n");

	}

	public void addNewFriend() {

		System.out.println("Enter name:  ");
		String name = scan.next();
		System.out.println("Enter phone:  ");
		int phone = scan.nextInt();
		System.out.println("Enter email:  ");
		String email = scan.next();
		System.out.println("Enter address:  ");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Enter birthday  ");
		int birthday = scan.nextInt();
		System.out.println("Enter note:  ");
		scan.nextLine();
		String note = scan.nextLine();

		People p = new Friend(name, phone, email, address, birthday, note);
		people.put(name, p);
		p.displayInfo(p);
	}

	// 判断类型,选择启动的method
	public void chooseType() {
		// 1.menu
		System.out.println("Choose contact type");
		System.out.println("1.friend ");
		System.out.println("2.family member");
		System.out.println("3.coworker");
		System.out.println("4.individual");
		int a = scan.nextInt();
		switch (a) {
		case 1:this.addNewFriend();break;
		case 2 :this.addNewFamily();break;
		case 3 :this.addNewCoworker();break;
		case 4 :this.addNewIndividual();break;
		default:  throw new IllegalArgumentException("invalid：" + a);
		}
	}

	public void addNewFamily() {

		System.out.println("Enter name:  ");
		String name = scan.next();
		System.out.println("Enter phone:  ");
		int phone = scan.nextInt();
		System.out.println("Enter email:  ");
		String email = scan.next();
		System.out.println("Enter address:  ");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Enter birthday  ");
		int birthday = scan.nextInt();
		System.out.println("Enter relationship  ");
		scan.nextLine();
		String relationship = scan.nextLine();
		System.out.println("Enter note:  ");
		scan.nextLine();
		String note = scan.nextLine();

		People pr = new Relative(name, phone, email, address, birthday, relationship, note);
		people.put(pr.getName(), pr);
		pr.displayInfo(pr);

	}

	public void addNewCoworker() {
		System.out.println("Enter business  ");
		String business = scan.next();
		System.out.println("Enter name:  ");
		String name = scan.next();
		System.out.println("Enter phone:  ");
		int phone = scan.nextInt();
		System.out.println("Enter email:  ");
		String email = scan.next();
		System.out.println("Enter address:  ");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Enter birthday  ");
		int birthday = scan.nextInt();
		System.out.println("Enter gst  ");
		// scan.nextLine();
		int gst = scan.nextInt();
		System.out.println("Enter note:  ");
		scan.nextLine();
		String note = scan.nextLine();

		People pc = new Coworker(name, phone, email, address, birthday, business, gst, note);
		people.put(name, pc);
		pc.displayInfo(pc);

	}

	public void addNewIndividual() {

		System.out.println("Enter name:  ");
		String name = scan.next();
		System.out.println("Enter phone:  ");
		int phone = scan.nextInt();
		System.out.println("Enter email:  ");
		String email = scan.next();
		System.out.println("Enter business:  ");
		scan.nextLine();
		String business = scan.nextLine();

		System.out.println("Enter gst  ");
		// scan.nextLine();
		int gst = scan.nextInt();
		System.out.println("Enter note:  ");
		scan.nextLine();
		String note = scan.nextLine();

		People pi = new Individual(name, phone, email, business, gst, gst, note);
		people.put(name, pi);
		pi.displayInfo(pi);
		if (businesses.containsKey(business)) {
			businesses.get(business).addEmploee(pi);
		} else {
			Business b = new Business(business);
			b.addEmploee(pi);
		}
	}

	//
//
//	System.out.println(pr.getType());
//
//  pr = new Relative(name, phone, email, address, birthday, relationship, note);
//
//	pr.displayInfo(pr);

	// System.out.println("if yuo want to see the relatives ");

	// 删除联系人
	public void deletePeople() {

	}

	// 查找并显示联系人所有信息

//	public void findPeople() {
//		String input = scan.nextLine();
//		System.out.println(people.get(input));
//		System.out.println("Do you want to see his/her relatives");
//		String s = scan.next();
//		if (s.equalsIgnoreCase("y")) {
//			System.out.println(people.get(input).get);
//		}
//	}

//	public void addRelative() {
//		for (Map.Entry<String, People> e : people.entrySet()) {
//
//			if (e.getValue().getRelationship().equalsIgnoreCase("relative")) {
//
//				e.getValue().getRelatives().add(e.getValue());
//			}
//
//		}
//	}

	public static void main(String[] args) {
		new UserInterface();
	}

}
