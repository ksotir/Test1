package test1;

public class Test1 {

	public static void main(String[] args) {
		//new Test1().temp1();

		Holder dog = new Holder("Max");
		System.out.println("@@@" + dog.getName());
		modify(dog);
		System.out.println("%%%" + dog.getName());
	}

	private void temp1() {
		// TODO: Test to-do note
		System.out.println("@@@");
		System.out.println("$$$");
	}

	private static void modify(Holder dog) {
		dog.setName("Sam");
		dog = new Holder("Bob");
		dog.setName("Rudolf");
	}

}

class Holder {
	private String name;

	public Holder(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}