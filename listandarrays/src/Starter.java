import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String gotoArray = "Mazda";
		int[] arrys = new int[3];
		
		System.out.println("Arrys length: " +arrys.length);
		
		arrys[0] = 1;
		//arrys[4] = 30;
		
	System.out.println(Arrays.toString(arrys));
	
	ArrayList<String> arrayList = new ArrayList<>();
	arrayList.add("Volvo");
	arrayList.add("Lada");
	arrayList.add("Tesla");
	arrayList.add("Skoda");
	arrayList.add("BMW");
	
	arrayList.set(1, gotoArray);
	
		
	System.out.println("Array size is: " +arrayList.size());
	arrayList.remove(2);
	System.out.println("Array size is: " +arrayList.size());
	String elementZero = arrayList.get(0);
	System.out.println("Element zero is: " +elementZero);
	
	
	
	ArrayList<Double> arrayTest = new ArrayList<>();
	arrayTest.add(234.4);
	//loopArraysDoubleToString(arrayTest);
	
	User user = new User("Janis", 3333);
	
	System.out.println(user.getName());
	
	 	
	ArrayList<User> userArray = new ArrayList<>();
	userArray.add(new User("Anna",3030330));
	userArray.add(new User("Denis",2020220));
	userArray.add(user);
	System.out.println(userArray.size());
	//loopArraysUserToString(userArray);
	
	List<String> listArr = new ArrayList<>();
		
	listArr.add("3");
	listArr.add("4");
	listArr.add("2");
	listArr.add("5");
	listArr.add("50");
	System.out.println(listArr.size());
	
	//listArr.clear();
	//System.out.println(listArr.size());
	}
	
	//listArr.forEach(listArr -> {System.out.println(listArr);});
	
	
	List<Integer> listArrInt = new ArrayList<>();{
	
	listArrInt.add(34);
	listArrInt.add(32);
	listArrInt.add(5);
	listArrInt.add(7);
	listArrInt.add(65);
	System.out.println(listArrInt.size());
	
	Iterator<Integer> iterator = listArrInt.iterator();
	while(iterator.hasNext()){
		Integer listToString = iterator.next();
		System.out.println("List " + listToString);
	//}
	
	//private static void loopArraysDoubleToString(ArrayList<Double> arrayTest); {
		// TODO Auto-generated method stub
		
	//}

	//private static void loopArraysUserToString(ArrayList<User> arrays) {
		//for(User arr : arrays){
			//System.out.println("Element value of arraylist: " + arr);
		//}
		//}
		
	
	//public static void loopArraysToString(ArrayList<String> arrays){
		
		//for (int i = 0; i < arrays.size(); i++)
		//System.out.println("Element value of arraylist: " + arrays.get(i)
			//	+ "index are " + i);
	
	}

}
}

