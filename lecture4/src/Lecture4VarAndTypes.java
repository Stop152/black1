
public class Lecture4VarAndTypes {

	public static void main(String[] args) {
		String testString = "This is a test string.";
		System.out.println("I will print out the test: " + testString);
		
		int prim1 = 1;
		int prim3 = 3;
		int prim5 = 5;
		int prim7 = 7;
		
		System.out.println("These are all the primitives until number 10: " + prim1 + ", " + prim3 + ", " + prim5 + ", " + prim7 + ".");
	
		String a = "H3110_w0r1d_";
		double b = 2.0;
		String c = "_";
		boolean d = true;
		
		System.out.println(a + b + c + d);
		
		String hannah = "Did Hannah see bees? Hannah did."; 
		System.out.println("The length of the hannah String is: " + hannah.length());
		System.out.println("The 13th character of the hannah String is: " + hannah.charAt(12));
	}

}
