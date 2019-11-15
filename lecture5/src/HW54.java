import java.util.Scanner;

public class HW54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int i = scanner.nextInt();
		int a = 1;
		while (a <= i) {
			int b = a;
			while (b != 0) {
				System.out.print(a);
				b--;
			}
			System.out.println();
			a++;
		}
	}
}
