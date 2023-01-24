package comjava;

public class ConstructorDemo {
	int i;
	int j;

	ConstructorDemo(int i) {
		this.i = i;
	}

	ConstructorDemo(int i, int j) {
		this(i);
		this.j = j;
	}

	public static void main(String[] args) {
		ConstructorDemo constructorDemo = new ConstructorDemo(2, 3);
		constructorDemo.display();
		ConstructorDemo constructorDemo3 = new ConstructorDemo(33, 23);
		constructorDemo3.display();


	}

	private void display() {
		System.out.println("id of the student" + this.i);
		System.out.println("id of the student" + this.j);

	}

}
