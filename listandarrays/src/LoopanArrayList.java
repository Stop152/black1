import java.util.ArrayList;
import java.util.Arrays;

public class LoopanArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrys = new int[10];

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Lada");
		arrayList.add("Tesla");
		arrayList.add("Skoda");
		arrayList.add("BMW");
		arrayList.add("Toyota");
		arrayList.add("Honda");
		arrayList.add("Mercedes");
		arrayList.add("Hundai");
		arrayList.add("VW");
		loopArraysToString(arrayList);

		for (int i = 0; i < arrayList.size(); i++)
			;
		{
			System.out.println("Element value of arraylist: " + arrays.get(i)
					+ "index are " + i);
		}

	}
}

}
