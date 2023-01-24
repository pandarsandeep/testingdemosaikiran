package comjava;

public class OverHidingDemo extends Overhiding1 {

	public static void main(String[] args) {
		add();
		Overhiding.add();
	}

}

class Overhiding {
	static void add() {
		System.out.println("this is from class A");
	}
}

class Overhiding1 extends Overhiding {
	static void add() {
		System.out.println("this is from class B");
	}
}
