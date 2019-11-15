class ArrayWorker {
	int sumValues(int[] processedArray) {
		int sum = 0;
		for (int value : processedArray){
			sum = sum + value;
					}
		return sum;		
		
	}
}

public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] processedArray = new int[5];
		processedArray[1] = 1;
		processedArray[2] = 1;
		processedArray[3] = 1;
		
		ArrayWorker arrayWorker = new ArrayWorker();
		
		int sum = arrayWorker.sumValues(processedArray);
		System.out.println(" Sum of array is" + sum);
		
	}

}
