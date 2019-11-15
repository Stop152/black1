import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// System.out.println("What is your name?");
		// String username = scanner.nextLine();
		// System.out.println("User name is: " + username);
		//
		// System.out.println("What is your age?");
		// int age = scanner.nextInt();
		// System.out.println("User age is: " + age);

		System.out.println("Please enter a number?");
		double number = scanner.nextDouble();
		String status = "blank";

		if (number > 0) {
			status = "positive.";
		} else if (number < 0) {
			status = "negative.";
		} else if (number == 0) {
			status = "zero.";
		} else {
			status = "blank";
		}

		if (status != "blank") {
			System.out.println("Number " + number + " is " + status);
		} else {
			System.out.println("The entered content is not a number.");
		}

//		System.out.println("Enter something please:");
//		String username = scanner.nextLine();
//		while (scanner.hasNext()){
//			 System.out.print("" + scanner.hasNextInt());
//			 System.out.print(" -> " + scanner.next() + "\n");
//		}
		

		scanner.close();
	}

}
