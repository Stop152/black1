import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] table = new int[5][4];
		
		Scanner scanner = new Scanner(System.in);
		
		//ask user for row number
		System.out.println("Enter column: ");
		int userCol = scanner.nextInt();
		//+validation
		if(userCol >4 || userCol < 1){
			System.out.println ("Entered invalid coloumn index");
			return;
		}
				//+shift by -1
		int columnIndex = userCol -1;
		
		//ask user for col number
		System.out.println("Enter row: ");
		int userRow = scanner.nextInt();
		//+validation
		if(userRow >5 || userRow < 1){
			System.out.println ("Entered invalid row index");
			return;
		}
				//+shift by -1
		int rowIndex = userRow -1;
		//+validation
		//+shift by -1
		
		//ask user for value
		System.out.println ("Enter value");
		int newValue = scanner.nextInt();
		
	//asign value to array cell
		table[rowIndex][columnIndex] = newValue;
		//print out
		for(int[] row : table){
			System.out.println(Arrays.toString(row));
		}
		
		}
}
