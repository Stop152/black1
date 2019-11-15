import java.util.Scanner;

public class HW56 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int input = scanner.nextInt();
		int row = 1;
		
		int increment = 1;
		while (row <= input) {
			int coloumn = 1;
			do {
				System.out.print(increment);
				increment++;
				coloumn++;
			} while (coloumn <= row);
			System.out.println();
			row++;
		}

	}
}
