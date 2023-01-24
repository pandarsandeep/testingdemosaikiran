package comjava;

public class ArrayDecending {
	static int[] arr = { 2, 53, 2, 432, 234, 245, 23, 545 };

	public static void main(String[] args) {
		System.out.println("original array");
		orginal();
		System.out.println("decending order");
		decending();
	}

	static void decending() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
	}

	static void orginal() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
