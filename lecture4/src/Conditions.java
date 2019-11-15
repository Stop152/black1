import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		int a = 3;
		short b = 3;
		int c = 1;

		boolean b1 = a == b;
		boolean b2 = b != c;
		boolean b3 = a > c;

		if (b1 && b2 && b3) {
			System.out.println("Success!");
		} else {
			System.out.println("Something wrong");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an index of a day?");
		int dayIndex = scanner.nextInt();
		//
		// int dayIndex = 11;

		if (dayIndex == 1) {
			System.out.println("The value for number: " + dayIndex
					+ " is Monday.");
		} else if (dayIndex == 2) {
			System.out.println("The value for number: " + dayIndex
					+ " is Tuesday.");
		} else if (dayIndex == 3) {
			System.out.println("The value for number: " + dayIndex
					+ " is Wednesday.");
		} else if (dayIndex == 4) {
			System.out.println("The value for number: " + dayIndex
					+ " is Thursday.");
		} else if (dayIndex == 5) {
			System.out.println("The value for number: " + dayIndex
					+ " is Friday.");
		} else if (dayIndex == 6) {
			System.out.println("The value for number: " + dayIndex
					+ " is Saturday.");
		} else if (dayIndex == 7) {
			System.out.println("The value for number: " + dayIndex
					+ " is Sunday.");
		} else {
			System.out
					.println("Sorry, enetered number does not refer to any day of the week.");
		}
		scanner.close();
	}

}
