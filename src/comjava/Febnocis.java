package comjava;

public class Febnocis {

	public static void main(String[] args) {
		Febnocis febnocis = new Febnocis();
		febnocis.feb();
	}

	private void feb() {
		int a = 0, b = 1;
		
		System.out.print(a + " " + b + " ");
		for (int i = 1; i <= 100; i++) {
			int c = a + b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		}

	}

}
