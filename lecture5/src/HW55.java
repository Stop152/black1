import java.util.Scanner;

public class HW55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int iii = scanner.nextInt();
		int b = 1;
		while (b <= iii) {
			int a = 1;
			while (a <= b) {
				System.out.print(a);
				a++;
			}
			System.out.println();
			b++;
		}
	}
}
