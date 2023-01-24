package comjava;

public class DebugExcample {
	static int a = 100;
	static int b = 200;
	static int c;

	public static void main(String[] args) {
		c = a + b;
		b = c - b;
		a = c-a;
		System.out.println(" a ="+ a + " "+ "b= " + b);
	}

}
