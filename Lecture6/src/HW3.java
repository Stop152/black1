import java.util.Scanner;

public class HW3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter triangle size");
		int size = scanner.nextInt();
		for(int i = 1; i <= size; i++) {
			for(int j=1;j<=i;j++){
			System.out.print(i);
			}
			System.out.println();
		}

	}

}
