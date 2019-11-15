import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		// System.out.println("These are the odd numbers in range from 1-10:");
		// for (int i = 1; i <= 10; i++) {
		// if (i % 2 == 0) {
		// continue;
		// } else {
		// System.out.println(i);
		// }
		// }
		//
		// System.out.println("These are the even numbers in range from 1-15:");
		//
		// int a = 1;
		// while (a < 15) {
		// if (a % 2 == 0) {
		// System.out.println(a);
		// a++;
		// } else {
		// a++;
		// }
		//
		// }
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter a number: ");
		// int value = scanner.nextInt();
		// while(value != 0) {
		// System.out.println("Enter a number: ");
		// value = scanner.nextInt();
		// }
		// System.out.println("Smart girl!");
		//

		System.out.println("Enter a number for pattern:");
		int iteration = scanner.nextInt();
		for (int i = 0; i < iteration; i++) {
			for (int a = i; a < i; a++) {

				System.out.print(a);
			}
			System.out.println(i);

			scanner.close();

		}
	}
}
