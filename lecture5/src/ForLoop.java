import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times I should repeat?");
		int iteration = scanner.nextInt();
		for (int i = iteration; i >0; i--) {
			System.out.println(" Repeat " + i);
		}
		
		scanner.close();
	}

}
