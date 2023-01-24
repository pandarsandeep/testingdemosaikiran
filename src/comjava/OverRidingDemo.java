package comjava;

public class OverRidingDemo {

	public static void main(String[] args) {
		B b = new B();
		b.add();

	}

}

class A {
	void add() {
		System.out.println("this is form super class");
	}
}

class B extends A {
	void add() {
		System.out.println("this is from sub-class");
	}
}