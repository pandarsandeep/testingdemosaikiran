package comjava;

public class first {
	public static void main(String[] args) {
		first f = new first();
		f.name();
	}

	int count;

	public void name() {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count++;
				}
				if (count > 1) {
					System.out.print(i + " ");
				}
			}

		}

	}
	static void sum(){
		
	}
}
