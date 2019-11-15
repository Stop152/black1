import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
        int value = scanner.nextInt();        
        while(value != 5) {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        System.out.println("Smart girl!");
        scanner.close();
	}

}
