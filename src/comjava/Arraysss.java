package comjava;

import java.util.Scanner;

public class Arraysss {
	static int[] marks = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the six subject marks:::");
		for (int i = 0; i < 6; i++) {
			marks[i] = sc.nextInt();

		}
		display();

	}

	static void display() {
		System.out.println("your marks are ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

}
