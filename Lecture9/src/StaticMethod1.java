import java.util.Arrays;

public class StaticMethod1 {

	public static int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	static int[] arr = {};

	static int sum(int [] arr) {
		int sum = 0;
		int i;

		for (i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	public void () printElement { 
	for(int element = 0; element < arr.length; element++){
	System.out.println(arr);
	}
	}
	
	
	
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,70,80};
		sum(arr);
		System.out.println("Sum of given array is " + sum(arr));
		System.out.println(Arrays.toString(arr));
			}
}
