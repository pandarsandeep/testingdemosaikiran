package comjava;

public class Factorial {

	public static void main(String[] args) {
		int fact = 5;
		for (int i = fact-1; i >=1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
