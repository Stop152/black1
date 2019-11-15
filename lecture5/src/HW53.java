import java.util.Scanner;

public class HW53 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int value = scanner.nextInt();
		while (value != 0) {
			System.out.println("Next number, please");
			value = scanner.nextInt();
		}
		System.out.println("Completed, thank you");
	}
}



