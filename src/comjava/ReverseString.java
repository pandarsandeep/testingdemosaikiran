package comjava;

public class ReverseString {

	public static void main(String[] args) {
		String s = "sandeep pandar";
		for (int i = s.length()-1; i >= 0; i--) {
			char charAt = s.charAt(i);
			System.out.print(charAt);
		}
	}

}
